package pairmatching.model;

import pairmatching.view.ErrorPhrase;

import java.util.ArrayList;
import java.util.List;

public class PairMatching {
    private Course course;
    private Level level;
    private String name;
    private List<List<String>> matching;

    public PairMatching(Course course, Level level, String name) {
        this.course = course;
        this.level = levelValidate(level);
        this.name =  missionValidate(level, name);
        this.matching = new ArrayList<>();
    }

    public Course getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public List<List<String>> getMatching() {
        return matching;
    }

    public String missionValidate(Level level, String name){
        if(!level.getMissionList().contains(name)){
            throw new IllegalArgumentException(ErrorPhrase.EXIST_MISSION.getPhrase());
        }
        return name;
    }

    public Level levelValidate(Level level){
        if(!Level.getLevels().contains(level)){
            throw new IllegalArgumentException(ErrorPhrase.EXIST_LEVEL.getPhrase());
        }
        return level;
    }

    public List<List<String>> randomMatching(Crew crew){
        this.matching.clear();
        List<String> names = crew.getCrewNames();
        for(int i=0; i< names.size(); i+=2){
            this.matching.add(new ArrayList<>(List.of(names.get(i), names.get(i+1))));
        }
        if(names.size()%2!=0){
            this.matching.get(this.matching.size()-1).add(names.get(names.size()-1));
        }
        return this.matching;
    }
}