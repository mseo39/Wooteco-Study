package pairmatching.controller;

import pairmatching.model.Course;
import pairmatching.model.Crew;

import java.nio.file.Paths;

public class Controller {
    private Crew backendCrew;
    private Crew frontendCrew;

    public Controller() {
        backendCrew = new Crew(Paths.get("src/main/resources/backend-crew.md"), Course.BACKEND);
        frontendCrew = new Crew(Paths.get("src/main/resources/frontend-crew.md"), Course.FRONTEND);
    }

    public void startProgram() {

    }
}