package domain;

public enum Pos {
    ORDER(1),
    PAY(2),
    EXIT(3);

    private final int num;

    Pos(final int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
