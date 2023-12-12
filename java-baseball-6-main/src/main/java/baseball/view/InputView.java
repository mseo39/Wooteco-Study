package baseball.view;

import baseball.util.Util;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static int readBaseballSize() {
        System.out.println(InputPhrase.BASEBALL_SIZE);
        return Util.stringToInteger(readLine());
    }
}