package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private List<String> bridgeList = new ArrayList<>();

    public void setBridgeList(List<String> bridgeList) {
        this.bridgeList = bridgeList;
    }

    public List<String> getBridgeList() {
        return bridgeList;
    }
}
