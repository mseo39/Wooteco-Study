package pairmatching.validate;

import pairmatching.view.ErrorPhrase;

import java.util.Arrays;
import java.util.List;

public class InputValidate {
    static List<String> choice= Arrays.asList("1", "2", "3", "Q");
    public static String choiceValidate(String userChoice){
        if(!choice.contains(userChoice)){
            throw new IllegalArgumentException(ErrorPhrase.EXIST_CHOICE.getPhrase());
        }
        return userChoice;
    }
}
