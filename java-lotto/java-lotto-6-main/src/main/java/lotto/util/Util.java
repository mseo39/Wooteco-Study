package template.util;

public class Util {
    public static int stringToInteger(String input) {
        try {
            int i = Integer.parseInt(input);
            if (i < 0) {
                throw new IllegalArgumentException("");
            }
            return i;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("");
        }
    }
}
