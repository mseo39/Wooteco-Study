package pairmatching.controller;

import pairmatching.model.Course;
import pairmatching.model.Crew;
import pairmatching.model.Matching;
import pairmatching.model.PairMatching;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.nio.file.Paths;
import java.util.List;

public class Controller {
    private Crew backendCrew;
    private Crew frontendCrew;
    private PairMatching pairMatching;

    public Controller() {
        backendCrew = new Crew(Paths.get("src/main/resources/backend-crew.md"), Course.BACKEND);
        frontendCrew = new Crew(Paths.get("src/main/resources/frontend-crew.md"), Course.FRONTEND);
        pairMatching = new PairMatching();
    }

    public void startProgram() {
        while (requestFunction(requestReadFunction())){

        }
    }

    public boolean requestFunction(String input){
        if(input.equals(1)) {
            requestMatching();
            return true;
        }
        if(input.equals(2)) {
            return true;
        }
        if(input.equals(3)) {
            return true;
        }
        return false;
    }

    public String requestReadFunction(){
        while (true) {
            try {
                return InputView.readFunction();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public Matching requestReadMatchingType(){
        Matching matching;
        while (true) {
            try {
                OutputView.printInformation();
                List<String> input =InputView.readMatchingType();
                matching = new Matching(input.get(0), input.get(1),input.get(2));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return matching;
    }

    public void requestMatching(){
        this.pairMatching.addMatchings(requestReadMatchingType());
    }
}