package lotto.controller;

import lotto.model.Lottos;
import lotto.model.Winning;
import lotto.util.Validator;
import lotto.view.InputView;
import lotto.view.OutputView;

public class Controller {
    private Lottos lottos;
    private Winning winning;

    public Controller() {

    }

    public void startProgram() {
        requestMoney();
        requestGenerateLotto();
        requestPrintLotto();
        requestReadWinning();
    }

    public void requestMoney(){
        lottos = new Lottos(InputView.readMoney()/1000);
    }

    public void requestGenerateLotto(){
        for(int i=0; i<lottos.getLottoNum(); i++){
            lottos.addLottos();
        }
    }

    public void requestPrintLotto(){
        OutputView.printNum(lottos.getLottoNum());
        OutputView.printLotto(lottos.getLottos());
    }

    public void requestReadWinning(){
        winning = new Winning(InputView.readWinningNum(), InputView.readBonus());
    }
}