package pairmatching.view;

import pairmatching.validate.InputValidate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static String readChoice() {
        System.out.println(InputPhrase.INPUT_CHOICE.getPhrase());
        return InputValidate.choiceValidate(readLine());
    }

    public static List<String> readPairMatching(){
        System.out.println(InputPhrase.INPUT_PAIRMATCHING.getPhrase());
        return Arrays.stream(readLine().split(",")).map(String::strip).collect(Collectors.toList());
    }

    public static String readRestart(){
        System.out.println(InputPhrase.RESTART_PAIRMATCHING.getPhrase());
        return readLine();
    }
}