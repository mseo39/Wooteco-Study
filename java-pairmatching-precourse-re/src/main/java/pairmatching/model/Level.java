package pairmatching.model;

import pairmatching.view.ErrorPhrase;

import java.util.Arrays;
import java.util.List;

public enum Level {
    LEVEL1("레벨1", Arrays.asList("자동차경주", "로또", "숫자야구게임")),
    LEVEL2("레벨2", Arrays.asList("장바구니", "결제", "지하철노선도")),
    LEVEL3("레벨3", Arrays.asList()),
    LEVEL4("레벨4", Arrays.asList("성능개선", "배포")),
    LEVEL5("레벨5", Arrays.asList());

    private String name;
    private List<String> mission;

    Level(String name, List<String> mission) {
        this.name = name;
        this.mission = mission;
    }

    public String getName() {
        return name;
    }

    public List<String> getMission() {
        return mission;
    }

    public static Level validateLevel(String level){
        try{
            return Level.valueOf(level);
        }catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ErrorPhrase.EXIST_LEVEL.getPhrase());
        }
    }

    public static String validateMission(Level level, String mission){
        if(!level.mission.contains(mission)){
            throw new IllegalArgumentException(ErrorPhrase.EXIST_MISSION.getPhrase());
        }
        return mission;
    }
}