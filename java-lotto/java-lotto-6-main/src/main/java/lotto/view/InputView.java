package lotto.view;

import lotto.util.Util;
import lotto.util.Validator;

import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static int readMoney() {
        System.out.println(InputPhrase.MONEY.getPhrase());
        return Util.stringToInteger(readLine());
    }

    public static List<Integer> readWinningNum(){
        System.out.println(InputPhrase.WINNING_NUMBER.getPhrase());
        List<Integer> result = Util.stringToIntegerList(readLine());
        result.forEach(integer -> Validator.NumValidate(integer));
        return result;
    }

    public static int readBonus(){
        System.out.println(InputPhrase.BONUS.getPhrase());
        int result = Util.stringToInteger(readLine());
        return result;
    }
}