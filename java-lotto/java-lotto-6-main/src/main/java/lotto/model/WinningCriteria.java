package lotto.model;

import java.util.Arrays;
import java.util.List;

public enum WinningCriteria {
    FIRST("1등",6,0,2000000000),
    TWO("2등",5,1,30000000),
    THREE("3등",5,0,1500000),
    FOUR("4등",4,0,50000),
    FIVE("5등",3,0,5000);

    private String name;
    private int match;
    private int bonus;
    private int money;

    WinningCriteria(String name, int match, int bonus, int money) {
        this.name = name;
        this.match = match;
        this.bonus = bonus;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public int getBonus() {
        return bonus;
    }

    public int getMatch() {
        return match;
    }

    public String getName() {
        return name;
    }

    public List<WinningCriteria> getWinningCriteria(){
        return Arrays.stream(WinningCriteria.values()).toList();
    }

    public void winningCriteriaToString(WinningCriteria winningCriteria){
        System.out.print("  - "+winningCriteria.name+": "+
                winningCriteria.match+"개 번호 ");
        if (winningCriteria.bonus==1){
            System.out.print("+ 보너스 번호 ");
        }
        System.out.println("일치 / "+String.format("%,d원",winningCriteria.money));
    }
}
