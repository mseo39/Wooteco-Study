package template.view;

public enum ErrorPhrase {
    EXIST_MISSION("존재하지 않는 미션입니다.");

    private String phrase;
    private static String error = "[ERROR]";

    ErrorPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return error+" "+this.phrase;
    }
}