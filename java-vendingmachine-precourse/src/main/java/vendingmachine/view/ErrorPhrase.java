package vendingmachine.view;

public enum ErrorPhrase {
    VALIDATE_PRODUCT("상품가격은 100원부터 시작하며 10원으로 나눠 떨어져야 합니다."),
    EXIST_PRODUCT("존재하지 않는 상품입니다."),
    SEPARATOR(";"),
    INPUT_AMOUNT("투입 금액을 입력해 주세요."),
    NUM_UNIT("구매할 상품명을 입력해 주세요.");

    private String phrase;
    private static String error = "[ERROR]";

    ErrorPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return error+" "+this.phrase;
    }
}