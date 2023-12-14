package view;

public enum ErrorPhrase {
    EXIST_TABLE("존재하지 않는 테이블입니다."),
    EXIST_FUNCTION("존재하지 않는 기능입니다."),
    EXIST_MENU("존재하지 않는 메뉴입니다."),
    MENU_MAX_NUM("한 테이블에서 주문할 수 있는 한 메뉴의 최대 수량은 99개 입니다."),
    CHOICE_PAY("결제 방식은 신용카드는 1, 현금은 2를 입력해야 합니다."),
    EXIST_ORDER("결제할 주문 목록이 없습니다."),
    STRING_TO_INTEGER("양수를 입력해야 합니다.");

    private String phrase;
    private static String error = "[ERROR]";

    ErrorPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return error + " " + this.phrase;
    }
}