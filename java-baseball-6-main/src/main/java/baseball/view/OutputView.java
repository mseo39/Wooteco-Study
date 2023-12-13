package baseball.view;

import baseball.view.OutputPhrase;

public class OutputView {
    public static void printStart(){
        System.out.println(OutputPhrase.START.getPhrase());
    }

    public static void printCheckResult(boolean nothing, int ball, int strike){
        if(nothing){
            System.out.println(OutputPhrase.NOTHING.getPhrase());
            return;
        }
        if(ball==0 && strike!=0){
            System.out.println(strike+OutputPhrase.STRIKE.getPhrase());
            return;
        }
        if(ball!=0 && strike==0){
            System.out.println(ball+OutputPhrase.BALL.getPhrase());
            return;
        }
        System.out.println(ball+OutputPhrase.BALL.getPhrase()+" "+strike+OutputPhrase.STRIKE.getPhrase());
    }
}