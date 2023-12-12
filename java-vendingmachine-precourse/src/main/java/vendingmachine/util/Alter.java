package vendingmachine.util;

public class Alter {
    private static final String ERROR = "[ERROR] ";

    public static int stringToInteger(String input) {
        try {
            int i = Integer.parseInt(input);
            if (i < 0) {
                throw new IllegalArgumentException("[ERROR] 양수여야 합니다.");
            }
            return i;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ERROR + "숫자를 입력해 주세요.");
        }
    }

}
