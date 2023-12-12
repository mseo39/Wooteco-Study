package baseball.util;

import baseball.view.ErrorPhrase;

public class Util {
    public static int stringToInteger(String input, int min) {
        try {
            int i = Integer.parseInt(input);
            if (i < min) {
                throw new IllegalArgumentException(ErrorPhrase.BASEBALL_SIZE.getPhrase());
            }
            return i;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorPhrase.STRING_TO_INTEGER.getPhrase());
        }
    }
}
