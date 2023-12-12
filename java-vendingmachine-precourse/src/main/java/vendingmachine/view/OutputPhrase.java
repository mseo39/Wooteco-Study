package vendingmachine.view;

public enum OutputPhrase {
    HAVE_COINS("자판기가 보유한 동전"),
    COIN_UNIT("원"),
    SEPARATOR(" - "),
    NUM_UNIT("개"),
    CHANGES("잔돈"),
    INPUT_AMOUNT("투입 금액: ");


    private String phrase;

    OutputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}