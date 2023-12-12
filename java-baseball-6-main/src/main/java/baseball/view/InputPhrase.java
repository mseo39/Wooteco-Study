package baseball.view;

public enum InputPhrase {
    BASEBALL_INPUT("숫자를 입력해주세요 : "),
    RESTART_CHOICE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private String phrase;

    InputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}