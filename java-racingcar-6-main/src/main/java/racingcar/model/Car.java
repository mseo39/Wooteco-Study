package racingcar.model;

public class Car {
    private String name;
    private int distance;

    final private static int SIZE = 5;
    final private static int CONDITION = 4;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}