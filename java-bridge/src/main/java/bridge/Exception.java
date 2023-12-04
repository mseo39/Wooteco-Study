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

    public static void checkMoveChoice(String input) {
        if (input.equals("U") || input.equals("D")) {
            return;
        }
        throw new IllegalArgumentException(ERROR + "U(위 칸)와 D(아래 칸) 중 하나의 문자를 입력하여야 합니다.");
    }

    public static void checkRetryChoice(String input) {
        if (input.equals("R") || input.equals("Q")) {
            return;
        }
        throw new IllegalArgumentException(ERROR + "R(재시도)와 Q(종료) 중 하나의 문자를 입력하여야 합니다.");
    }
}
