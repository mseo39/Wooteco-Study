package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Car> Cars;
    private int tryNum;

    public Game() {
        this.Cars = new ArrayList<>();
        this.tryNum = 0;
    }

    public void setTryNum(int tryNum) {
        this.tryNum = tryNum;
    }

    public List<Car> getCars() {
        return Cars;
    }

    public void addCar(Car car) {
        this.Cars.add(car);
    }
}
