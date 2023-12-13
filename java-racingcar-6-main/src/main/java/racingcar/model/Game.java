package racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
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

    public int getTryNum() {
        return tryNum;
    }

    public List<Car> getCars() {
        return Cars;
    }

    public void addCar(Car car) {
        this.Cars.add(car);
    }

    public int maxDistance(){
        return Collections.max(this.Cars.stream().map(Car::getDistance).toList());
    }

    public List<Car> getWinner(){
        return this.Cars.stream().filter(car -> car.getDistance()==maxDistance()).toList();
    }
}