package domain;

import view.ErrorPhrase;

public class Order {
    final static int MAX = 99;
    private String name;
    private int num;
    private Table table;

    public Order(String name, int num, Table table) {
        validate(num);
        this.name = name;
        this.num = num;
        this.table = table;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public Table getTable() {
        return table;
    }

    public void validate(int num){
        if(num>MAX){
            throw new IllegalArgumentException(ErrorPhrase.MENU_MAX_NUM.getPhrase());
        }
    }
}