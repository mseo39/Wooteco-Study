package lotto.view;

import lotto.util.Util;

import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static int readMoney() {
        System.out.println(InputPhrase.MONEY.getPhrase());
        return Util.stringToInteger(readLine());
    }
}