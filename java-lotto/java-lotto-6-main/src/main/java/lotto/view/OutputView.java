package lotto.view;

import lotto.model.Lotto;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    private final static String CONTOUR = "---";
    private final static String SEPARATE = " - ";
    public static void printLotto(List<Lotto> lottos){
        for(Lotto lotto: lottos){
            System.out.println("["+
                    lotto.getNumbers()
                            .stream()
                            .map(Object::toString)
                            .collect(Collectors.joining(", "))+"]");
        }
    }

    public static void printNum(int num){
        System.out.println("");
        System.out.println(String.format(OutputPhrase.LOTTO_NUM.getPhrase(),num));
    }
}