package template.view;

import template.util.Validator;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static String readChoice() {
        System.out.println(InputPhrase.INPUT_CHOICE.getPhrase());
        return Validator.choiceValidate(readLine());
    }
}