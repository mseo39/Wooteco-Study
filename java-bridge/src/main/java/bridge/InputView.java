package bridge;

import static camp.nextstep.edu.missionutils.Console.readLine;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    private InputView() {
    }

    /**
     * 다리의 길이를 입력받는다.
     */
    public static int readBridgeSize() {
        int num = 0;
        while (true) {
            try {
                String size = readLine();
                num = Exception.checkNumberRange(Exception.stringToInteger(size));
                return num;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public static String readMoving() {
        String choice = " ";
        try {
            choice = readLine();
            Exception.checkMoveChoice(choice);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            readMoving();
        }
        return choice;
    }
}