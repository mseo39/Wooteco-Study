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

    static public void printResult(List<String> categories, List<User> users){
        System.out.println(Output.RECOMMEND_RESULT.getPhrase());
        System.out.println("["+" 구분 | "+String.join(" | ", days)+" ]");
        System.out.println("["+" 카테고리 | "+String.join(" | ", categories)+" ]");
        for (User user: users){
            System.out.println("[ "+user.getName()+" | "+String.join(" | ", user.getAlreadyRecommendMenu())+" ]");
        }
        System.out.println(Output.PROGRAM_END.getPhrase());
    }
}