package lotto.util;

import lotto.view.ErrorPhrase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
