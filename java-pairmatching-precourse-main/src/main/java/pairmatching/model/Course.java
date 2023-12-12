package pairmatching.model;

import java.util.Arrays;
import java.util.List;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private String name;

    Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static public Course getCourse(String name){
        return Arrays.stream(Course.values()).filter(course -> course.getName().equals(name)).toList().get(0);
    }

    static public List<String> getCourseNames(){
        return Arrays.stream(Course.values()).map(Course::getName).toList();
    }
}