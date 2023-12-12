package baseball.controller;

import baseball.model.Baseball;
import baseball.model.User;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Controller {
    Baseball baseball;
    User user;
    public Controller() {
        baseball = new Baseball();
        user = new User();
    }

    public void startProgram() {
        requestStart();
        requestInputUser();
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