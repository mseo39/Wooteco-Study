package pairmatching.view;

public enum OutputPhrase {
    RESULT_MATCHING("페어 매칭 결과입니다."),
    COIN_UNIT("원"),
    CREW_SEPARATOR(" : "),
    TITLE_SEPARATOR(": "),
    LEVEL_SEPARATOR("- "),
    INFORMATION_SEPARATOR(" | "),
    CONTOUR("#"),
    COURSE("과정"),
    MISSION("미션"),
    CLEAR("초기화 되었습니다.");


    private String phrase;

    OutputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}