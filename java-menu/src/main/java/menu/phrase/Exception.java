package menu.phrase;

public enum Exception {
    ERROR_NAME_SIZE("이름은 최소 2글자, 최대 4글자입니다."),
    ERROR_COACH_NUM("코치는 최소 2명, 최대 5명입니다."),
    ERROR_MENU_NAME("존재하지 않는 메뉴입니다"),
    ERROR_MENU_SIZE("메뉴는 최소 0개, 최대 2개입니다."),
    ERROR_CATEGORY("존재하지 않는 카테고리입니다")
    ;

    private String phrase;
    private static String error = "[ERROR]";

    Exception(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.error+" "+this.phrase;
    }
}