package menu.view;

import menu.phrase.Output;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public InputView(){

    }

    static public List<String> readCoachName(){
        System.out.println(Output.COACH_INPUT.getPhrase());
        return Arrays.stream(readLine().split(",")).toList();
    }
}