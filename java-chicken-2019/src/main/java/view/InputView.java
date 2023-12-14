package view;

import util.Util;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static int readTableNumber() {
        System.out.println(InputPhrase.CHOICE_TABLE.getPhrase());
        return Util.stringToInteger(readLine());
    }

    public static int readFunction(){
        System.out.println(InputPhrase.CHOICE_FUNCTION.getPhrase());
        return Util.stringToInteger(readLine());
    }

    public static int readMenu(){
        System.out.println(InputPhrase.CHOICE_MENU.getPhrase());
        return Util.stringToInteger(readLine());
    }

    public static int readNum(){
        System.out.println(InputPhrase.CHOICE_MENU_NUM.getPhrase());
        return Util.stringToInteger(readLine());
    }

    public static int readPay(){
        System.out.println(InputPhrase.CHOICE_PAY.getPhrase());
        return Util.stringToInteger(readLine());
    }
}
