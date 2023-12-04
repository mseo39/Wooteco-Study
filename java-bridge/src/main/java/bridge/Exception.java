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
}
