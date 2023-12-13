package pairmatching.model;

import pairmatching.view.ErrorPhrase;

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
        try {
            return Course.valueOf(name);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ErrorPhrase.EXIST_COURSE.getPhrase());
        }
    }
}