package lotto.util;

import lotto.model.Lottos;
import lotto.view.ErrorPhrase;

public class Validator {
    private final static int MONEY_DIVIDE = 1000;

    public static void NumValidate(int input){
        if(input< Lottos.getLottoRangeMin() || input>Lottos.getLottoRangeMax()){
            throw new IllegalArgumentException(ErrorPhrase.LOTTO_NUM_RANGE.getPhrase());
        }
    }

    public static int moneyValidate(int input){
        if(input%MONEY_DIVIDE!=0){
            throw new IllegalArgumentException(ErrorPhrase.DIVIDE.getPhrase());
        }
        return input;
    }
}
