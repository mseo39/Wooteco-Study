package baseball.util;

import baseball.view.ErrorPhrase;

public class Util {
    public static int stringToInteger(String input) {
        try {
            int i = Integer.parseInt(input);
            return i;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorPhrase.STRING_TO_INTEGER.getPhrase());
        }
    }
}
