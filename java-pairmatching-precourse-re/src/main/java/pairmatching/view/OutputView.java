package pairmatching.view;

import pairmatching.model.Course;
import pairmatching.model.Level;
import pairmatching.model.Matching;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public static void printInformation(){
        printDivision();
        printCourse();
        printMission();
        printDivision();
    }

    public static void printDivision(){
        System.out.println(OutputPhrase.DIVISION.getPhrase());
    }

    public static void printCourse(){
        System.out.print(OutputPhrase.COURSE.getPhrase()+OutputPhrase.TITLE_SEPARATE.getPhrase());
        System.out.println(Arrays.stream(Course.values())
                .map(Course::getName)
                .collect(Collectors.joining(OutputPhrase.TYPE_SEPARATE.getPhrase())));
    }

    public static void printMission(){
        System.out.println(OutputPhrase.MISSION.getPhrase()+OutputPhrase.TITLE_SEPARATE.getPhrase());
        for(Level level: Level.values()){
            System.out.println(
                    "  "+OutputPhrase.LEVEL_SEPARATE.getPhrase()+
                            level.getName()+OutputPhrase.TITLE_SEPARATE.getPhrase()+" "+
                            String.join(OutputPhrase.TYPE_SEPARATE.getPhrase(),level.getMission())
            );
        }
    }

    public static void printMatching(Matching matching){
        System.out.println(OutputPhrase.RESULT_MATCHING.getPhrase());
        for(List<String> names: matching.getNames()){
            System.out.println(String.join(OutputPhrase.CREW_SEPARATE.getPhrase(),names));
        }
    }
}