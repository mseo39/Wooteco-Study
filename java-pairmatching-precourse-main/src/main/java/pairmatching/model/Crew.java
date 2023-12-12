package pairmatching.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Crew {
    private Course course;
    private List<String> crewNames;

    public Crew(Course course, Path fileName) {
        this.course = course;
        this.crewNames = readFile(fileName);
    }

    public List<String> readFile(Path path){
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public List<String> getCrewNames() {
        return Randoms.shuffle(crewNames);
    }
}