package racingcar.view;

import racingcar.util.Util;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    final static String SEPARATE = ",";

    public static List<String> readCarName() {
        System.out.println(InputPhrase.CAR_NAME.getPhrase());
        return Arrays.stream(readLine().split(SEPARATE)).toList();
    }
}