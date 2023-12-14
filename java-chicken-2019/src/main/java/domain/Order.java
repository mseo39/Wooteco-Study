package domain;

import view.ErrorPhrase;

public class Order {
    final static int MAX = 99;
    private Menu menu;
    private int num;
    private Table table;

    public Order(Table table, Menu menu, int num) {
        validate(num);
        this.menu = menu;
        this.num = num;
        this.table = table;
    }

    public int getNum() {
        return num;
    }

    public Menu getMenu() {
        return menu;
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