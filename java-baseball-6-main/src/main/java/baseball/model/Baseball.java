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

    public void randomBaseballNum(){
        while (baseballNum.size() < size) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!baseballNum.contains(randomNumber)) {
                baseballNum.add(randomNumber);
            }
        }
    }
}
