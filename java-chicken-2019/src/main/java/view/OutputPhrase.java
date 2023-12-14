package view;

public enum OutputPhrase {
    MAIN_DISPLAY("메인화면"),
    TABLE_LIST("테이블 목록"),
    ORDER_LIST("주문 내역"),
    CONTOUR("%s번 테이블의 결제를 진행합니다."),
    TOTAL_MONEY("최종 결제할 금액");

    private String phrase;
    private final static String MARK = "##";

    OutputPhrase(String phrase) {
        this.phrase = MARK + " " + phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}