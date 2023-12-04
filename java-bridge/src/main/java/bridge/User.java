package bridge;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int tryNum = 1;
    private String tryGameResult = "실패";
    private List<String> moveChoiceResult;

    public User() {
        moveChoiceResult = new ArrayList<>();
    }

    public void initMoveChoiceResult() {
        this.moveChoiceResult.clear();
    }

    public int getTryNum() {
        return tryNum;
    }

    public void setTryNum(int tryNum) {
        this.tryNum = tryNum;
    }

    public List<String> getMoveChoiceResult() {
        return this.moveChoiceResult;
    }

    public String getTryGameResult() {
        return tryGameResult;
    }

    public void setTryGameResult(String tryGameResult) {
        this.tryGameResult = tryGameResult;
    }
}
