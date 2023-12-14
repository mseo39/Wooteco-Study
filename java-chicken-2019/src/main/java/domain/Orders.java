package domain;

import view.ErrorPhrase;

import java.util.List;

public class Orders {
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrders(Order order){
        this.orders.add(order);
    }

    public List<Order> getTableByOrder(Table table){
        return this.orders.stream().filter(order -> order.getTable().equals(table)).toList();
    }

    public int TableByChickenNum(Table table){
        return getTableByOrder(table).stream()
                .filter(order -> order.getMenu()
                        .getCategory()
                        .equals(Category.CHICKEN))
                .mapToInt(Order::getNum).sum();
    }

    public void ValidateOrder(Table table){
        if(getTableByOrder(table).size()==0){
            throw new IllegalArgumentException(ErrorPhrase.EXIST_ORDER.getPhrase());
        }
    }
}
