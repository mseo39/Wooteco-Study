package lotto.model;

import lotto.view.OutputPhrase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Winning {
    private List<Integer> winningNumber;
    private int bonusNumber;

    public Winning(List<Integer> winningNumber, int bonusNumber) {
        this.winningNumber = winningNumber;
        this.bonusNumber = bonusNumber;
    }

    public List<WinningCriteria> matchResult(Lottos lottos){
        List<WinningCriteria> result = new ArrayList<>();
        for(Lotto lotto : lottos.getLottos()){
            if(matchNum(lotto.getNumbers())<3){
                continue;
            }
            result.add(WinningCriteria.getMatch(
                    matchNum(lotto.getNumbers()),
                    matchBonus(lotto.getNumbers())));
        }
        return result;
    }

    public double getRevenue(List<WinningCriteria> winningCriteria, int money){
        return ((double) winningCriteria.stream().mapToInt(value -> value.getMoney()).sum()/(double)money*100);
    }

    public int matchNum(List<Integer> number){
        return number.stream().mapToInt(value -> Collections.frequency(winningNumber,value)).sum();
    }

    public int matchBonus(List<Integer> number){
        if(number.contains(bonusNumber)){
            return 1;
        }
        return 0;
    }
}
