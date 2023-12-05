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

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printResult(User user, BridgeGame bridgeGame) {
        System.out.println("최종 게임 결과");
        printMap(user, bridgeGame);
        System.out.println("게임 성공 여부:" + " " + user.getTryGameResult());
        System.out.println("총 시도한 횟수:" + " " + user.getTryNum());
    }

    public static void printStart() {
        System.out.println("다리 건너기 게임을 시작합니다.");
    }

    public static void printSize() {
        System.out.println("다리의 길이를 입력해주세요.");
    }

    public static void printMoveChoice() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
    }

    public static void printRetryChoice() {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
    }
}
