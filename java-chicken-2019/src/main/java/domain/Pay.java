package domain;

public enum Pay {
    CARD(1),
    CASH(2);

    private int num;
    private final static int DISCOUNT=10000;

    Pay(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int totalMoney(Table table, Orders orders, int input){
        int total = sumMoney(table,orders);
        total-=discountChicken(table, orders);
        if(discountCash(input)){
            total-=(total*5/100);
        }
        return total;
    }

    public int sumMoney(Table table, Orders orders){
        return orders.getTableByOrder(table).stream()
                .mapToInt(order ->
                        order.getMenu().getPrice()*order.getNum())
                .sum();
    }

    public int discountChicken(Table table, Orders orders){
        return (orders.TableByChickenNum(table)/10) * DISCOUNT;
    }

    public boolean discountCash(int input){
        if(Pay.CASH.num==input){
            return true;
        }
        return false;
    }
}