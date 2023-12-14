package lotto.view;

import lotto.model.Lotto;
import lotto.model.WinningCriteria;

import java.util.ArrayList;
import java.util.Collections;
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

    public static void printWinningResult(List<WinningCriteria> winningCriterias){
        System.out.println("");
        System.out.println(OutputPhrase.PURCHASE_NUM.getPhrase());
        System.out.println(CONTOUR);

        for(WinningCriteria winningCriteria: WinningCriteria.getReverse()){
            winningCriteria.winningCriteriaToString();
            System.out.println(SEPARATE
                    +Collections.frequency(winningCriterias, winningCriteria)
                    +OutputPhrase.UNIT.getPhrase());
        }
    }

    public static void printRevenue(double num){
        System.out.println(String.format(OutputPhrase.REVENUE.getPhrase(),num));
    }
}