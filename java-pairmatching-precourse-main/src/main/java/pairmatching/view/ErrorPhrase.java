package pairmatching.view;

public enum ErrorPhrase {
    EXIST_MISSION("존재하지 않는 미션입니다."),
    EXIST_COURSE("존재하지 않는 과정입니다."),
    EXIST_LEVEL("존재하지 않는 레벨입니다."),
    EXIST_CHOICE("존재하지 않는 기능입니다."),
    IMPOSSIBLE("매칭이 불가능합니다.");

    private String phrase;
    private static String error = "[ERROR]";

    ErrorPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return error+" "+this.phrase;
    }
}