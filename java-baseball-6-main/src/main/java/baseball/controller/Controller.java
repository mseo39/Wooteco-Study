package baseball.controller;

import baseball.model.Baseball;
import baseball.model.User;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.Collections;
import java.util.stream.Collectors;

public class Controller {
    Baseball baseball;
    User user;

    public Controller() {
        baseball = new Baseball();
        user = new User();
    }

    public void startProgram() {
        boolean repeat = true;
        requestStart();
        requestRandomComputer();
        while (repeat) {
            requestInputUser();
            requestInputCheck();
            if (this.baseball.checkStrike(user.getLastInput()) == this.baseball.getSize()) {
                requestGameContent();
                repeat = requestRestart();
            }
        }
    }

    public void requestInit() {
        this.baseball.initBaseballNum();
        this.user.initInputBaseball();
    }

    public void requestRandomComputer() {
        this.baseball.randomBaseballNum();
    }

    public boolean requestRestart() {
        if (InputView.readRestart() == 1) {
            requestInit();
            requestRandomComputer();
            return true;
        }
        return false;
    }

    public void requestGameContent() {
        OutputView.printThreeStrike();
        OutputView.printGameResult(this.baseball.getBaseballNum(), this.user.getInputBaseball());
    }

    public void requestInputCheck() {
        boolean nothing = this.baseball.checkNothing(user.getLastInput());

        int strike = 0;
        if (!nothing) {
            strike = this.baseball.checkStrike(user.getLastInput());
        }
        int ball = 0;
        if (!nothing && strike < checkMatchNum()) {
            ball = this.baseball.checkBall(user.getLastInput());
        }
        OutputView.printCheckResult(nothing, ball, strike);
    }

    public int checkMatchNum() {
        return this.baseball.getBaseballNum().stream().
                map(integer -> Collections.frequency(user.getLastInput(), integer)).
                collect(Collectors.toList()).stream().
                mapToInt(Integer::intValue).sum();
    }

    public void requestInputUser() {
        while (true) {
            try {
                user.addInputBaseball(InputView.readUserBaseball(this.baseball.getSize()));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        user.addInputBaseball(InputView.readUserBaseball(this.baseball.getSize()));
    }

    public void requestStart() {
        OutputView.printStart();
        requestReadBaseballSize();
    }

    public void requestReadBaseballSize() {
        while (true) {
            try {
                this.baseball.setSize(InputView.readBaseballSize(this.baseball.getMinSize()));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}