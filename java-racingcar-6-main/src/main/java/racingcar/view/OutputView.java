package racingcar.view;

import racingcar.model.Car;

import java.util.List;

public class OutputView {
    public static void printResult(List<Car> cars){
        for(Car car : cars){
            System.out.println(car.getName()+
                    OutputPhrase.SEPARATOR.getPhrase()+
                    OutputPhrase.DISTANCE.getPhrase().repeat(car.getDistance()));
        }
        System.out.println("");
    }

    public static void printResultPhrase(){
        System.out.println("\n"+OutputPhrase.RESULT.getPhrase());
    }
}