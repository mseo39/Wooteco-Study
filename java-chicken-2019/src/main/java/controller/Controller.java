package controller;

import domain.Orders;
import domain.Pos;
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
        int input = InputView.readFunction();
        if(Pos.EXIT.getNum()==input){
            return false;
        }
        if(Pos.ORDER.getNum()==input){

        }
        if(Pos.PAY.getNum()==input){

        }
        return true;
    }

    public void requestOrder(){
        OutputView.printTables(orders.TableByValidateOrder());
    }
}