package bridge;

public class Exception {
    private static final String ERROR = "[ERROR] ";

    private Exception() {

    }

    public static int stringToInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ERROR + "숫자를 입력해 주세요.");
        }
    }

    public static int checkNumberRange(int input) {
        if (3 > input || 20 < input) {
            throw new IllegalArgumentException(ERROR + "다리 길이는 3부터 20 사이의 숫자여야 합니다.");
        }
        return input;
    }
}
