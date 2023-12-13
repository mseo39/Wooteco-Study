package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Game;
import racingcar.view.InputView;

public class Controller {
    Game game;

    public Controller() {
        game = new Game();
    }

    public void gameStart(){
        requestCarName();
    }

    public void requestCarName(){
        for(String name : InputView.readCarName()){
            game.addCar(new Car(name));
        }
    }
}