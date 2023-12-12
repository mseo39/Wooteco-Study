package vendingmachine.controller;

import vendingmachine.model.Product;
import vendingmachine.model.User;
import vendingmachine.model.VendingMachine;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

public class Controller {
    private VendingMachine vendingMachine;
    private User user;

    public void gameStart() {
        requestGenerateVending();
        requestGenerateCoins();
        requestGenerateProducts();
        requestUserMoney();
        requestUserProduct();
        requestEnd();
    }

    public void requestGenerateVending() {
        while (true) {
            try {
                vendingMachine = new VendingMachine(InputView.readMoney());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void requestGenerateCoins() {
        vendingMachine.GenerateCoins();
        OutputView.printCoins(vendingMachine.getCoins());
    }

    public void requestGenerateProducts() {
        while (true) {
            try {
                vendingMachine.generateProduct(InputView.readProducts());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void requestUserMoney() {
        while (true) {
            try {
                user = new User(InputView.readUserMoney());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void requestUserProduct() {
        while (isRepeat(user.getMoney())) {
            Product tmp = requestReadProduct();
            tmp.reduceNum();
            user.setMoney(user.getMoney() - tmp.getPrice());
        }
    }

    public Product requestReadProduct() {
        while (true) {
            try {
                OutputView.printUserMoney(user.getMoney());
                return vendingMachine.getProduct(InputView.readProduct());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public boolean isRepeat(int price) {
        if (price < vendingMachine.getProductMinPrice() || vendingMachine.getSumProductNum() == 0) {
            return false;
        }
        return true;
    }

    public void requestEnd() {
        OutputView.printUserMoney(user.getMoney());
        OutputView.printChanges(vendingMachine.getChanges(user.getMoney()));
    }
}
