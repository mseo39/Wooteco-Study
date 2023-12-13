package baseball.view;

import baseball.util.Util;
import baseball.util.Validator;

import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static int readBaseballSize(int min) {
        System.out.println(InputPhrase.BASEBALL_SIZE.getPhrase());
        return Validator.baseballSize(Util.stringToInteger(readLine()), min);
    }

    public static List<Integer> readUserBaseball(){
        System.out.print(InputPhrase.BASEBALL_INPUT.getPhrase());
        return Validator.inputDuplicate(readLine());
    }

    public static int readRestart(){
        System.out.println(InputPhrase.RESTART_CHOICE.getPhrase());
        return Validator.restartChoice(Util.stringToInteger(readLine()));
    }
}