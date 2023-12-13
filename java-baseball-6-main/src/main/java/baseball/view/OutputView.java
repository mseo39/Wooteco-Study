package baseball.view;

import baseball.view.OutputPhrase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public static void printStart() {
        System.out.println(OutputPhrase.START.getPhrase());
    }

    public static void printCheckResult(boolean nothing, int ball, int strike) {
        if (nothing) {
            System.out.println(OutputPhrase.NOTHING.getPhrase());
            return;
        }
        if (ball == 0 && strike != 0) {
            System.out.println(strike + OutputPhrase.STRIKE.getPhrase());
            return;
        }
        if (ball != 0 && strike == 0) {
            System.out.println(ball + OutputPhrase.BALL.getPhrase());
            return;
        }
        System.out.println(ball + OutputPhrase.BALL.getPhrase() + " " + strike + OutputPhrase.STRIKE.getPhrase());
    }

    public static void printThreeStrike() {
        System.out.println(OutputPhrase.THREE_STRIKE.getPhrase());
    }

    public static void printGameResult(List<Integer> computer, List<List<Integer>> user) {
        System.out.println(OutputPhrase.GAME_RESULT.getPhrase());
        System.out.println(String.format(OutputPhrase.SEPARATE.getPhrase(), OutputPhrase.ANSWER.getPhrase()));
        System.out.println(computer.stream().map(Object::toString).collect(Collectors.joining()));
        System.out.println(String.format(OutputPhrase.SEPARATE.getPhrase(), OutputPhrase.THROW_NUM.getPhrase()));
        System.out.println(user.size());
        System.out.println(String.format(OutputPhrase.SEPARATE.getPhrase(), OutputPhrase.GAME_CONTENT.getPhrase()));
        for (List<Integer> input : user) {
            System.out.println(input.stream().map(Object::toString).collect(Collectors.joining()));
        }
    }
}