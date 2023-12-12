package baseball.view;

public enum OutputPhrase {
    START("숫자 야구 게임을 시작합니다."),
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱"),
    GAME_RESULT("게임 결과"),
    ANSWER("정답"),
    THROW_NUM("던진 횟수"),
    GAME_CONTENT("게임 내용"),
    SEPARATE("<%s>");

    private String phrase;

    OutputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}