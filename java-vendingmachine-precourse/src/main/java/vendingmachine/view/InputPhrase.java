package vendingmachine.view;

public enum InputPhrase {
    HAVE_COINS("자판기가 보유하고 있는 금액을 입력해 주세요."),
    INPUT_PRODUCTS("상품명과 가격, 수량을 입력해 주세요."),
    SEPARATOR(";"),
    INPUT_AMOUNT("투입 금액을 입력해 주세요."),
    NUM_UNIT("구매할 상품명을 입력해 주세요.");

    private String phrase;

    InputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}