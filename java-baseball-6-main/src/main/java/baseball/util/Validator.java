package baseball.util;

import baseball.view.ErrorPhrase;
import template.view.ErrorPhrase;

import java.util.Arrays;
import java.util.List;

public class Validator {
    public static int baseballSize(int num, int size){
        if(num<size){
            throw new IllegalArgumentException(ErrorPhrase.BASEBALL_SIZE.getPhrase());
        }
        return num;
    }
}
