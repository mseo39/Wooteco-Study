package baseball.util;

import baseball.view.ErrorPhrase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Validator {
    public static int baseballSize(int num, int size) {
        if (num < size) {
            throw new IllegalArgumentException(ErrorPhrase.BASEBALL_SIZE.getPhrase());
        }
        return num;
    }

    public static List<Integer> inputDuplicate(String input) {
        if (input.length() != input.chars().distinct().count()) {
            throw new IllegalArgumentException(ErrorPhrase.INPUT_DUPLICATE.getPhrase());
        }
        return Stream.of(input.split("")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static List<Integer> inputSize(List<Integer> input, int size) {
        if (input.size() != size) {
            throw new IllegalArgumentException(String.format(ErrorPhrase.INPUT_SIZE.getPhrase(), size));
        }
        return input;
    }

    public static int restartChoice(int input) {
        if (input != 1 && input != 2) {
            throw new IllegalArgumentException(ErrorPhrase.RESTART_CHOICE.getPhrase());
        }
        return input;
    }
}
