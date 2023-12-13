package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Baseball {
    private List<Integer> baseballNum;
    private int size;
    private int minSize=2;

    public Baseball(){
        baseballNum = new ArrayList<>();
    }

    public List<Integer> getBaseballNum() {
        return baseballNum;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void initBaseballNum(){
        this.baseballNum.clear();
    }

    public void randomBaseballNum(){
        while (baseballNum.size() < size) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!baseballNum.contains(randomNumber)) {
                baseballNum.add(randomNumber);
            }
        }
    }

    public boolean checkNothing(List<Integer> input){
        if(!this.baseballNum.stream().anyMatch(integer -> input.contains(integer))){
            return true;
        }
        return false;
    }

    public int checkStrike(List<Integer> input){
        int check = 0;
        for(int i=0; i<input.size();i++){
            if(this.baseballNum.contains(input.get(i)) && this.baseballNum.indexOf(input.get(i)) == i){
                check++;
            }
        }
        return check;
    }

    public int checkBall(List<Integer> input){
        int check = 0;
        for(int i=0; i<input.size();i++){
            if(this.baseballNum.contains(input.get(i)) && this.baseballNum.indexOf(input.get(i)) != i){
                check++;
            }
        }
        return check;
    }
}
