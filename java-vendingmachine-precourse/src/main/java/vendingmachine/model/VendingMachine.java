package vendingmachine.model;

import vendingmachine.util.Alter;
import vendingmachine.view.ErrorPhrase;

import java.util.*;
import java.util.stream.Collectors;

public class VendingMachine {
    private int price;
    private List<Integer> coins;
    private List<Product> products;

    public VendingMachine(int price) {
        this.price = price;
        this.coins = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public List<Integer> getCoins() {
        return coins;
    }

    public void GenerateCoins() {
        int money = this.price;
        int tmp = 0;
        while (money != 0) {
            tmp = Coin.generateCoin();
            if (money - tmp < 0) {
                continue;
            }
            this.coins.add(tmp);
            money -= tmp;
        }
    }

    public void generateProduct(List<String> products) {
        for (String i : products) {
            List<String> tmp = Arrays.stream(i.substring(1, i.length() - 1).split(",")).collect(Collectors.toList());
            this.products.add(new Product(tmp.get(0),
                    Alter.stringToInteger(tmp.get(1)),
                    Alter.stringToInteger(tmp.get(2))));
        }
    }

    public int getProductMinPrice() {
        return Collections.min(products.stream().map(Product::getPrice).collect(Collectors.toList()));
    }

    public Product getProduct(String name) {
        List<Product> result = products.stream().filter(product -> product.getName().equals(name)).collect(Collectors.toList());
        validateProduct(result);
        return result.get(0);
    }

    public void validateProduct(List<Product> result) {
        if (result.size() == 0 || result.get(0).getNum() == 0) {
            throw new IllegalArgumentException(ErrorPhrase.EXIST_PRODUCT.getPhrase());
        }
    }

    public int getSumProductNum() {
        return products.stream().mapToInt(Product::getNum).sum();
    }

    public List<Integer> getChanges(int money) {
        List<Integer> result = new ArrayList<>();
        int tmp = money;
        for (int coin : Coin.getCoinType()) {
            if (coin >= money || Collections.frequency(this.coins, coin) == 0) {
                continue;
            }
            tmp = checkChanges(coin, tmp, result);
        }
        return result;
    }

    public int checkChanges(int coin, int tmp, List<Integer> result) {
        for (int i = 0; i < Collections.frequency(this.coins, coin); i++) {
            if (tmp - coin < 0) {
                break;
            }
            result.add(coin);
            tmp = tmp - coin;
        }
        return tmp;
    }
}