package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.view.ErrorPhrase;

public class Car {
    private String name;
    private int distance;

    final private static int SIZE = 5;
    final private static int CONDITION = 4;

    public Car(String name) {
        validate(name);
        this.name = name;
        this.distance = 0;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void validate(String name) {
        if (name.length() > SIZE) {
            throw new IllegalArgumentException(String.format(ErrorPhrase.CAR_NAME_SIZE.getPhrase(), SIZE));
        }
    }

    public void moveCar() {
        if (Randoms.pickNumberInRange(0, 9) > CONDITION) {
            this.distance = +1;
        }
    }
}