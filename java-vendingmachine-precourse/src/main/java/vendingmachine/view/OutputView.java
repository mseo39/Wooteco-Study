package vendingmachine.view;

import vendingmachine.model.Coin;

import java.util.Collections;
import java.util.List;

public class OutputView {
    static public void printCoins(List<Integer> coins) {
        System.out.println(OutputPhrase.HAVE_COINS.getPhrase());
        for (int i : Coin.getCoinType()) {
            System.out.println(i + OutputPhrase.COIN_UNIT.getPhrase() +
                    OutputPhrase.SEPARATOR.getPhrase() + Collections.frequency(coins, i) +
                    OutputPhrase.NUM_UNIT.getPhrase());
        }
    }

    static public void printUserMoney(int money) {
        System.out.println(OutputPhrase.INPUT_AMOUNT.getPhrase() + money + OutputPhrase.COIN_UNIT.getPhrase());
    }

    static public void printChanges(List<Integer> coins) {
        System.out.println(OutputPhrase.CHANGES.getPhrase());
        for (int i : Coin.getCoinType()) {
            if (Collections.frequency(coins, i) == 0) {
                continue;
            }
            System.out.println(i + OutputPhrase.COIN_UNIT.getPhrase() +
                    OutputPhrase.COIN_UNIT.getPhrase() +
                    Collections.frequency(coins, i) +
                    OutputPhrase.NUM_UNIT.getPhrase());
        }
    }
}
