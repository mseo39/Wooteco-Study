package lotto.view;

public enum ErrorPhrase {
    DIVIDE("구입 금액은 1000원으로 나누어 떨어져야 합니다."),
    STRING_TO_INTEGER("양수를 입력해야 합니다."),
    LOTTO_NUM_RANGE("로또 번호는 1부터 45 사이의 숫자여야 합니다.");

    private String phrase;
    private static String error = "[ERROR]";

    ErrorPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return error+" "+this.phrase;
    }
}