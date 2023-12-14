package template.view;

public enum OutputPhrase {
    RESULT_MATCHING("페어 매칭 결과입니다."),
    LEVEL_SEPARATOR("- "),
    INFORMATION_SEPARATOR(" | "),
    CONTOUR("#");

    private String phrase;

    OutputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}