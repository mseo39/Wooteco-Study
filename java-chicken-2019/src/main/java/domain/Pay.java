package domain;

public enum Pay {
    CARD(1),
    CASH(2);

    private int num;

    Pay(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int totalMoney(){

    }
}