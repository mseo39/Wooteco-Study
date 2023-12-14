package util;

import view.ErrorPhrase;

public class Util {
    public static int stringToInteger(String input) {
        try {
            int i = Integer.parseInt(input);
            if (i < 0) {
                throw new IllegalArgumentException(ErrorPhrase.STRING_TO_INTEGER.getPhrase());
            }
            return i;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorPhrase.STRING_TO_INTEGER.getPhrase());
        }
    }
}
