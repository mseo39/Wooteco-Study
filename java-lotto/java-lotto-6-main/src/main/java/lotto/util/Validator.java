package lotto.util;

import lotto.view.ErrorPhrase;

public class Validator {

    private final static int LOTTO_RANGE_MIN = 1;
    private final static int LOTTO_RANGE_MAX = 2;

    public static int NumValidate(int input){
        if(input<LOTTO_RANGE_MIN || input>LOTTO_RANGE_MAX){
            throw new IllegalArgumentException(ErrorPhrase.LOTTO_NUM_RANGE.getPhrase());
        }
        return input;
    }
}
