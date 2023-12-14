package lotto.view;

public enum OutputPhrase {
    PURCHASE_NUM("당첨 통계"),
    LOTTO_NUM("%d개를 구매했습니다."),
    REVENUE("총 수익률은 %.1f%%입니다."),
    UNIT("개");

    private String phrase;

    OutputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}