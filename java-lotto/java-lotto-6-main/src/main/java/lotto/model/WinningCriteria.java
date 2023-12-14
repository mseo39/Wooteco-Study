package lotto.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum WinningCriteria {
    FIRST("1등", 6, 0, 2000000000),
    TWO("2등", 5, 1, 30000000),
    THREE("3등", 5, 0, 1500000),
    FOUR("4등", 4, 0, 50000),
    FIVE("5등", 3, 0, 5000);

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

    public static List<WinningCriteria> getWinningCriteria() {
        return Arrays.stream(WinningCriteria.values()).toList();
    }

    public static List<WinningCriteria> getReverse(){
        List<WinningCriteria> reversedWinningCriterias = new ArrayList<>(WinningCriteria.getWinningCriteria());
        Collections.reverse(reversedWinningCriterias);
        return reversedWinningCriterias;
    }

    public void winningCriteriaToString() {
        System.out.print(
                match + "개 일치");
        if (bonus == 1) {
            System.out.print(", 보너스 볼 일치");
        }
        System.out.print(String.format(" (%,d원)", money));
    }

    public static WinningCriteria getMatch(int num, int bonus) {
       return Arrays.stream(WinningCriteria.values())
               .filter(
                       winningCriteria -> winningCriteria.match==num
                               && winningCriteria.bonus==bonus)
               .findFirst().orElseThrow();
    }
}