package lotto.view;

public enum InputPhrase {
    MONEY("구입금액을 입력해 주세요."),
    WINNING_NUMBER("당첨 번호를 입력해 주세요."),
    BONUS("보너스 번호를 입력해 주세요.");


    private String phrase;

    InputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}