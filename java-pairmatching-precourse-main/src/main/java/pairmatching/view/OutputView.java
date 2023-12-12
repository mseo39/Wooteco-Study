package pairmatching.view;

import pairmatching.model.Course;
import pairmatching.model.Level;
import pairmatching.model.PairMatching;

import java.util.Collections;
import java.util.List;

public class OutputView {
    final static int CONTOUR_NUM = 45;

    static public void printInformation() {
        printContour();
        printCourse();
        printMission();
        printLevel();
        printContour();

    }

    static public void printContour(){
        System.out.println(OutputPhrase.CONTOUR.getPhrase().repeat(CONTOUR_NUM));
    }

    static public void printCourse(){
        System.out.println(OutputPhrase.COURSE.getPhrase() +
                OutputPhrase.TITLE_SEPARATOR.getPhrase() +
                OutputPhrase.TITLE_SEPARATOR.getPhrase() +
                String.join(OutputPhrase.INFORMATION_SEPARATOR.getPhrase(), Course.getCourseNames()));
    }

    static public void printMission(){
        System.out.println(OutputPhrase.MISSION.getPhrase()+
                OutputPhrase.TITLE_SEPARATOR.getPhrase());
    }

    static public void printLevel(){
        for(Level level: Level.getLevels()){
            System.out.println("  "+OutputPhrase.LEVEL_SEPARATOR.getPhrase()+
                    level.getName()+OutputPhrase.TITLE_SEPARATOR.getPhrase()+
                    String.join(OutputPhrase.INFORMATION_SEPARATOR.getPhrase(),level.getMissionList()));
        }
    }

    static public void printMatchingResult(PairMatching pairMatching){
        System.out.println(OutputPhrase.RESULT_MATCHING.getPhrase());
        for(List<String> names : pairMatching.getMatching()){
            System.out.println(String.join(OutputPhrase.CREW_SEPARATOR.getPhrase(),names));
        }
    }

    static public void printClear(){
        System.out.println(OutputPhrase.CLEAR.getPhrase());
    }
}