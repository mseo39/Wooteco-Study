package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Computer {
    private List<Integer> baseballNum;
    private int size;

    public List<Integer> getBaseballNum() {
        return baseballNum;
    }

    public void setSize(int size) {
        this.size = size;
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
