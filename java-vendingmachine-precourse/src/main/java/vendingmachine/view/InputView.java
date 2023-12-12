package vendingmachine.view;

import vendingmachine.util.Alter;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static int readMoney() {
        System.out.println(InputPhrase.HAVE_COINS.getPhrase());
        return Alter.stringToInteger(readLine());
    }

    public static List<String> readProducts() {
        System.out.println(InputPhrase.INPUT_PRODUCTS.getPhrase());
        return Arrays.stream(readLine().split(InputPhrase.SEPARATOR.getPhrase())).toList();
    }

    public static int readUserMoney() {
        System.out.println(InputPhrase.INPUT_AMOUNT.getPhrase());
        return Alter.stringToInteger(readLine());
    }

    public static String readProduct() {
        System.out.println(InputPhrase.NUM_UNIT.getPhrase());
        return readLine();
    }
}