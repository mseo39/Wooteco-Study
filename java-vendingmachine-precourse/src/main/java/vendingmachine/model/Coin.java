package vendingmachine.model;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInList;

public enum Coin {
    COIN_500(500), COIN_100(100), COIN_50(50), COIN_10(10);

    //private 변경 불가
    private final int amount;

    Coin(final int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    static public List<Integer> getCoinType() {
        return Arrays.stream(Coin.values()).map(Coin::getAmount).toList();
    }

    static public int generateCoin() {
        return pickNumberInList(Arrays.stream(Coin.values()).map(Coin::getAmount).toList());
    }
}
