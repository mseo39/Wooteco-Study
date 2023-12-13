package pairmatching.controller;

import pairmatching.model.Course;
import pairmatching.model.Crew;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.nio.file.Paths;

public class Controller {
    private Crew backendCrew;
    private Crew frontendCrew;

    public Controller() {
        backendCrew = new Crew(Paths.get("src/main/resources/backend-crew.md"), Course.BACKEND);
        frontendCrew = new Crew(Paths.get("src/main/resources/frontend-crew.md"), Course.FRONTEND);
    }

    public void startProgram() {
        requestReadFunction();
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
}