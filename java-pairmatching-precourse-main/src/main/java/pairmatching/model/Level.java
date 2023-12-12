package pairmatching.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Level {
    LEVEL1("레벨1",Arrays.asList("자동차경주","로또","숫자야구게임")),
    LEVEL2("레벨2",Arrays.asList("장바구니", "결제", "지하철노선도")),
    LEVEL3("레벨3",new ArrayList<>()),
    LEVEL4("레벨4",Arrays.asList("성능개선","배포")),
    LEVEL5("레벨5",new ArrayList<>());

    private String name;
    private List<String> missionList;

    Level(String name, List<String> missionList) {
        this.name = name;
        this.missionList=missionList;
    }

    public String getName(){
        return this.name;
    }

    public List<String> getMissionList() {
        return missionList;
    }

    static public Level getLevel(String name){
        return Arrays.stream(Level.values()).filter(level -> level.getName().equals(name)).toList().get(0);
    }

    public static List<Level> getLevels(){
        return Arrays.stream(Level.values()).toList();
    }
}