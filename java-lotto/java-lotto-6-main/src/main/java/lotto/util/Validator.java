package lotto.util;

import lotto.model.Lottos;
import lotto.view.ErrorPhrase;

import java.util.List;
import java.util.stream.Collectors;

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

    public static void duplicateNumber(List<Integer> number){
        if(number.size()!=number.stream().distinct().collect(Collectors.toList()).size()){
            throw new IllegalArgumentException(ErrorPhrase.DUPLICATE.getPhrase());
        }

    }
}
