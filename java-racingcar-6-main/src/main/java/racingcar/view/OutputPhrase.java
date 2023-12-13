package racingcar.view;

public enum OutputPhrase {
    RESULT("실행 결과"),
    SEPARATOR(" : "),
    DISTANCE("-"),
    WINNER("최종 우승자"),
    SEPARATE(",");

    private String phrase;

    OutputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}