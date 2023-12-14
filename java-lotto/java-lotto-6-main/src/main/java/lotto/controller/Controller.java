package lotto.controller;

import lotto.model.Lottos;
import lotto.model.Winning;
import lotto.model.WinningCriteria;
import lotto.util.Validator;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.List;

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
        requestPrintResult();
    }

    public void requestMoney(){
        while (true) {
            try {
                lottos = new Lottos(InputView.readMoney()/1000);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
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
        while (true) {
            try {
                winning = new Winning(InputView.readWinningNum(), InputView.readBonus());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void requestPrintResult(){
        List<WinningCriteria> winningCriteria = winning.matchResult(lottos);
        OutputView.printWinningResult(winningCriteria);
        OutputView.printRevenue(
                winning.getRevenue(winningCriteria,lottos.getLottoNum()*1000)
        );
    }
}