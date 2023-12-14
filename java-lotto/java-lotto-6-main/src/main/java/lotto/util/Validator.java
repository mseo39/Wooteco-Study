package template.util;

import template.view.ErrorPhrase;

import java.util.Arrays;
import java.util.List;

public class Validator {
    static List<String> choice= Arrays.asList("1", "2", "3", "Q");
    public static String choiceValidate(String userChoice){
        if(!choice.contains(userChoice)){
            throw new IllegalArgumentException("");
        }
        return userChoice;
    }
}
