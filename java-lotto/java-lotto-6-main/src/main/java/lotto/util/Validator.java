package lotto.util;

import lotto.view.ErrorPhrase;

public class Validator {

    private final static int LOTTO_RANGE_MIN = 1;
    private final static int LOTTO_RANGE_MAX = 2;
    private final static int MONEY_DIVIDE = 1000;

    public static void NumValidate(int input){
        if(input<LOTTO_RANGE_MIN || input>LOTTO_RANGE_MAX){
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
