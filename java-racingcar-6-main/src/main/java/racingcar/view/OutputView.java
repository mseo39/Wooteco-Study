package racingcar.view;

import racingcar.model.Car;

import java.util.List;
import java.util.stream.Collectors;

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

    public static void printWinner(List<Car> cars){
        System.out.print(OutputPhrase.WINNER.getPhrase()+
                OutputPhrase.SEPARATOR.getPhrase()+
                cars.stream().map(Car::getName)
                        .collect(Collectors.joining(OutputPhrase.SEPARATE.getPhrase()+" ")));
    }
}