package pairmatching.model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Crew {
    private Course course;
    private List<String> names;

    public Crew(Path path, Course course) {
        this.course = course;
        this.names = new ArrayList<>();
        try {
            this.names = Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
