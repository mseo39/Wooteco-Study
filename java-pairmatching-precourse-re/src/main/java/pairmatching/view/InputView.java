package pairmatching.view;

import pairmatching.util.Validator;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static String readFunction() {
        System.out.println(InputPhrase.CHOICE_FUNCTION.getPhrase());
        return Validator.validateFunction(readLine());
    }
}