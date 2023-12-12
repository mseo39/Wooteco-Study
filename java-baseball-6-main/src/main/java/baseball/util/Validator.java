package baseball.util;

import baseball.view.ErrorPhrase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Validator {
    public static int baseballSize(int num, int size){
        if(num<size){
            throw new IllegalArgumentException(ErrorPhrase.BASEBALL_SIZE.getPhrase());
        }
        return num;
    }

    public static List<Integer> inputDuplicate(String input){
        if(input.length()!=input.chars().distinct().count()){
            throw new IllegalArgumentException(ErrorPhrase.INPUT_DUPLICATE.getPhrase());
        }
        return Stream.of(input.split("")).map(Integer::parseInt).collect(Collectors.toList());
    }
}
