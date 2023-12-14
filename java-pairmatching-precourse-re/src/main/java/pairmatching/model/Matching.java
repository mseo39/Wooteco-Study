package pairmatching.model;

import java.util.ArrayList;
import java.util.List;

public class Matching {
    private Course course;
    private Level level;
    private String mission;
    private List<List<String>> names;

    public Matching(String course, String level, String mission) {
        this.course = Course.validateCourse(course);
        this.level = Level.validateLevel(level);
        this.mission = Level.validateMission(this.level, mission);
        this.names = new ArrayList<>();
    }

    public List<List<String>> getNames() {
        return names;
    }

    public Level getLevel() {
        return level;
    }

    public Course getCourse() {
        return course;
    }
}
