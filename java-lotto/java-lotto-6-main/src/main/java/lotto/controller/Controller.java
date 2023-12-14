package template.controller;

import lotto.model.Lottos;
import lotto.util.Validator;
import lotto.view.InputView;

public class Controller {
    private Lottos lottos;

    public Controller() {

    }

    public void startProgram() {

    }

    public void requestMoney(){
        lottos = new Lottos(InputView.readMoney()/1000);
    }
}