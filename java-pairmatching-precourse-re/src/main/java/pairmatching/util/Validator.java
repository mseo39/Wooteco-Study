package pairmatching.util;

import pairmatching.view.ErrorPhrase;
import java.util.Arrays;
import java.util.List;

public class Validator {
    final private static List<String> functions = Arrays.asList("1", "2", "3", "Q");
    final private static List<String> reMatchingChoise = Arrays.asList("네", "아니오");

    public static String validateFunction(String input) {
        if(!functions.contains(input)){
            throw new IllegalArgumentException(ErrorPhrase.EXIST_FUNCTION.getPhrase());
        }
        return input;
    }
}
