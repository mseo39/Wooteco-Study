package pairmatching.view;

public enum ErrorPhrase {
    EXIST_MISSION("존재하지 않는 미션입니다."),
    EXIST_COURSE("존재하지 않는 과정입니다."),
    EXIST_FUNCTION("존재하지 않는 기능입니다."),
    CHOICE_REMATCHING("네 또는 아니오를 입력해야 합니다."),
    EXIST_LEVEL("존재하지 않는 레벨입니다."),
    TRY_MATCHING("3회 시도를 초과합니다."),
    NONE_CASES("매칭 가능한 경우의 수가 없습니다.");

    private String phrase;
    private static String error = "[ERROR]";

    ErrorPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return error+" "+this.phrase;
    }
}