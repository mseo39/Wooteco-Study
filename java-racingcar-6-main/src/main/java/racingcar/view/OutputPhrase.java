package racingcar.view;

public enum OutputPhrase {
    RESULT("실행 결과"),
    SEPARATOR(" : "),
    DISTANCE("-");

    private String phrase;

    OutputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}