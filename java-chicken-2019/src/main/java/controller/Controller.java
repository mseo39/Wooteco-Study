package controller;

import domain.*;
import view.InputView;
import view.OutputView;

public class Controller {
    private Orders orders;

    public Controller() {
        orders = new Orders();
    }

    public void startProgram() {
        while(requestReadFunction()){

        }
    }

    public boolean requestReadFunction(){
        OutputView.printFunctionList();
        int input = InputView.readFunction();
        if(Pos.EXIT.getNum()==input){
            return false;
        }
        if(Pos.ORDER.getNum()==input){
            requestOrder();
        }
        if(Pos.PAY.getNum()==input){
            requestPay();
        }
        return true;
    }

    public void requestPay(){
        Table table = requestReadTable();
        OutputView.printOrderMenu(orders.getTableByOrder(table));
        OutputView.printTableNumber(table);
        OutputView.printTotalMoney(Pay.totalMoney(table, orders,InputView.readPay()));
        orders.deleteOrder(table);
    }

    public void requestOrder(){
        orders.addOrders(new Order(requestReadTable(),requestReadMenu(),InputView.readNum()));
    }

    public Table requestReadTable(){
        OutputView.printTables(orders.TableByValidateOrder());
        return TableRepository.getTable(InputView.readTableNumber());
    }

    public Menu requestReadMenu(){
        OutputView.printMenus(MenuRepository.menus());
        return MenuRepository.getMenu(InputView.readMenu());
    }
}