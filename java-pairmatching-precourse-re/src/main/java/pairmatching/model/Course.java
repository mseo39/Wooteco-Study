package pairmatching.model;

import pairmatching.view.ErrorPhrase;

import java.util.Arrays;
import java.util.stream.Collectors;

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

    public static Course validateCourse(String name) {
        if(Arrays.stream(Course.values()).map(Course::getName).toList().contains(name)){
            return Arrays.stream(Course.values())
                    .filter(course -> course.getName().equals(name))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException(ErrorPhrase.EXIST_COURSE.getPhrase());
        }
    }
}