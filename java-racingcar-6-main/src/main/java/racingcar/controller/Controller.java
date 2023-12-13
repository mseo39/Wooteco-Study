package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Game;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Controller {
    Game game;

    public Controller() {
        game = new Game();
    }

    public void gameStart(){
        requestCarName();
        requestTryNum();
        OutputView.printResultPhrase();
        for(int i=0; i< game.getTryNum();i++) {
            requestMoveCar();
            requestPrintResult();
        }
        requestWinner();
    }

    public void requestCarName(){
        InputView.readCarName().forEach(s -> game.addCar(new Car(s)));
    }

    public void requestTryNum(){
        game.setTryNum(InputView.readTryNum());
    }

    public void requestMoveCar(){
        game.getCars().stream().forEach(Car::moveCar);
    }

    public void requestPrintResult(){
        OutputView.printResult(game.getCars());
    }

    public void requestWinner(){
        OutputView.printWinner(game.getWinner());
    }
}