package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    private OutputView() {
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printMap(User user, BridgeGame bridgeGame) {
        List<String> up = new ArrayList<>();
        List<String> down = new ArrayList<>();

        for (int i = 0; i < user.getMoveChoiceResult().size(); i++) {
            addUp(up, user, bridgeGame, i);
            addDown(down, user, bridgeGame, i);
        }
        System.out.println("[ " + String.join(" | ", up) + " ]");
        System.out.println("[ " + String.join(" | ", down) + " ]\n");
    }

    public static void addUp(List<String> up, User user, BridgeGame bridgeGame, int i) {
        if (bridgeGame.getBridgeList().get(i).equals("U") && user.getMoveChoiceResult().get(i).equals("O") ||
                (bridgeGame.getBridgeList().get(i).equals("D") && user.getMoveChoiceResult().get(i).equals("X"))) {
            up.add(user.getMoveChoiceResult().get(i));
            return;
        }
        up.add(" ");
    }

    public static void addDown(List<String> down, User user, BridgeGame bridgeGame, int i) {
        if (bridgeGame.getBridgeList().get(i).equals("D") && user.getMoveChoiceResult().get(i).equals("O") ||
                (bridgeGame.getBridgeList().get(i).equals("U") && user.getMoveChoiceResult().get(i).equals("X"))) {
            down.add(user.getMoveChoiceResult().get(i));
            return;
        }
        down.add(" ");
    }
}
