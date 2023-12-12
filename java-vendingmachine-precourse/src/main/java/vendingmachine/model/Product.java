package vendingmachine.model;

import vendingmachine.view.ErrorPhrase;

public class Product {
    private String name;
    private int price;
    private int num;

    public Product(String name, int price, int num) {
        validate(price);
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }

    public void validate(int price) {
        if (price < 100 && price % 10 != 0) {
            throw new IllegalArgumentException(ErrorPhrase.VALIDATE_PRODUCT.getPhrase());
        }
    }

    public void reduceNum() {
        this.num -= 1;
    }
}