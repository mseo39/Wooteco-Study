package view;

public enum InputPhrase {
    CHOICE_FUNCTION("원하는 기능을 선택하세요."),
    CHOICE_TABLE("테이블을 선택하세요."),
    CHOICE_MENU("등록할 메뉴를 선택하세요."),
    CHOICE_MENU_NUM("메뉴의 수량을 입력하세요."),
    CHOICE_PAY("신용카드는 1번, 현금은 2번");

    private String phrase;
    private final static String MARK = "##";

    InputPhrase(String phrase) {
        this.phrase = MARK + " " + phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}