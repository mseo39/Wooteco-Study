package domain;

import java.util.List;

public class Orders {
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrders(Order order){
        this.orders.add(order);
    }
}
