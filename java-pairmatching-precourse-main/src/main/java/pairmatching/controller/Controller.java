package pairmatching.controller;

import pairmatching.model.Course;
import pairmatching.model.Crew;
import pairmatching.model.Level;
import pairmatching.model.PairMatching;
import pairmatching.view.ErrorPhrase;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    Crew backendCrew;
    Crew frontendCrew;
    List<PairMatching> pairMatchings;

    public Controller() {
        backendCrew = new Crew(Course.BACKEND, Paths.get("src/main/resources/backend-crew.md"));
        frontendCrew = new Crew(Course.BACKEND, Paths.get("src/main/resources/frontend-crew.md"));
        pairMatchings = new ArrayList<>();
    }

    public void startProgram() {
        while (requestChoice(requestReadChoice())) {
        }
    }

    public String requestReadChoice() {
        while (true) {
            try {
                return InputView.readChoice();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public boolean requestChoice(String choice) {
        if (choice.equals("Q")) {
            return false;
        }
        if (choice.equals("1")) {
            OutputView.printInformation();
            requestPairMatching();
        }
        if (choice.equals("2")) {
            OutputView.printInformation();
            requestViewPairMatching();
        }
        if (choice.equals("3")) {
            requestClearPairMatching();
        }
        return true;
    }

    public void requestClearPairMatching() {
        this.pairMatchings.clear();
        OutputView.printClear();
    }

    public void requestViewPairMatching() {
        while (true) {
            try {
                requestExist(InputView.readPairMatching());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void requestExist(List<String> type) {
        for (PairMatching pairMatching : this.pairMatchings) {
            if (pairMatching.getName().equals(type.get(2)) &&
                    pairMatching.getCourse().equals(Course.getCourse(type.get(0))) &&
                    pairMatching.getLevel().equals(Level.getLevel(type.get(1)))) {
                OutputView.printMatchingResult(pairMatching);
            }
        }
    }

    public void requestPairMatching() {
        List<String> type;
        PairMatching pairMatching;
        while (true) {
            try {
                type = InputView.readPairMatching();
                pairMatching = new PairMatching(Course.getCourse(type.get(0)), Level.getLevel(type.get(1)), type.get(2));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            requestRandomMatching(pairMatching);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void requestRandomMatching(PairMatching pairMatching) {
        for (int i = 0; i < 3; i++) {
            if (pairMatching.getCourse() == Course.BACKEND) {
                pairMatching.randomMatching(backendCrew);
            } else {
                pairMatching.randomMatching(frontendCrew);
            }
            if (duplicationMatching(pairMatching.getMatching())) {
                pairMatchings.add(pairMatching);
                OutputView.printMatchingResult(pairMatching);
                return;
            }
        }
        throw new IllegalArgumentException(ErrorPhrase.IMPOSSIBLE.getPhrase());
    }

    public boolean duplicationMatching(List<List<String>> tmpMatching) {
        for (PairMatching matching : pairMatchings) {
            for (List<String> pair : tmpMatching) {
                if (matching.getMatching().contains(pair)) {
                    return false;
                }
            }
        }
        return true;
    }
}