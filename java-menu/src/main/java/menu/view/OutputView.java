package menu.view;

import menu.model.User;
import menu.phrase.Output;

import java.util.Arrays;
import java.util.List;

public class OutputView {
    public OutputView() {

    }

    public static List<String> days = Arrays.asList("월요일", "화요일", "수요일", "목요일", "금요일");

    static public void printServiceStart() {
        System.out.println(Output.SERVICE_START.getPhrase());
    }
}