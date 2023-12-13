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
        requestStart();
        while(true) {
            requestInputUser();
            requestInputCheck();
            if(this.baseball.checkStrike(user.getLastInput())==this.baseball.getSize()){
                break;
            }
        }
    }

    public void requestInputCheck(){
        boolean nothing = this.baseball.checkNothing(user.getLastInput());

        int strike=0;
        if(!nothing){
            strike = this.baseball.checkStrike(user.getLastInput());
        }
        int ball=0;
        if(!nothing && strike<checkMatchNum()){
            ball = this.baseball.checkBall(user.getLastInput());
        }
        OutputView.printCheckResult(nothing,ball,strike);
    }

    public int checkMatchNum(){
        return this.baseball.getBaseballNum().stream().
                map(integer ->  Collections.frequency(user.getLastInput(),integer)).
                collect(Collectors.toList()).stream().
                mapToInt(Integer::intValue).sum();
    }

    public void requestInputUser(){
        while (true) {
            try {
                user.addInputBaseball(InputView.readUserBaseball());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void requestStart(){
        OutputView.printStart();
        requestReadBaseballSize();
        this.baseball.randomBaseballNum();
    }

    public void requestReadBaseballSize(){
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