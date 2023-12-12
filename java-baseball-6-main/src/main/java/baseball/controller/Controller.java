package baseball.controller;

import baseball.model.Baseball;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Controller {
    Baseball baseball;
    public Controller() {
        baseball = new Baseball();
    }

    public void startProgram() {
        requestStart();
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