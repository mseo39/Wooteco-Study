package lotto.model;

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
