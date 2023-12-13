package pairmatching.view;

public enum OutputPhrase {
    DIVISION("#############################################"),
    COURSE("과정"),
    MISSION("미션"),
    TITLE_SEPARATE(":"),
    CREW_SEPARATE(":"),
    TYPE_SEPARATE(" | "),
    LEVEL_SEPARATE("- "),
    RESULT_MATCHING("페어 매칭 결과입니다."),
    CLEAR_MATCHING("초기화 되었습니다. ");

    private String phrase;

    OutputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}