package pairmatching.view;

import pairmatching.util.Validator;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static String readFunction() {
        System.out.println(InputPhrase.CHOICE_FUNCTION.getPhrase());
        return Validator.validateFunction(readLine());
    }

    public static List<String> readMatchingType(){
        System.out.println(InputPhrase.CHOICE_MATCHING.getPhrase());
        return Arrays.stream(readLine().split(",")).map(String::strip).toList();
    }
}