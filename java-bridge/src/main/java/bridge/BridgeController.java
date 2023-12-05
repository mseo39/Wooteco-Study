package bridge;

public class BridgeController {
    private User user;
    private static BridgeGame bridgeGame;
    private static BridgeMaker bridgeMaker;

    public BridgeController() {
        user = new User();
        bridgeGame = new BridgeGame();
        bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
    }

    public void gameStart() {
        OutputView.printStart();
        OutputView.printSize();
        requestMakeBridge(InputView.readBridgeSize());
        System.out.println(bridgeGame.getBridgeList());
        requestLogic();
        requestEnd();
    }

    public boolean requestRetryChoice(){
        OutputView.printRetryChoice();
        if(InputView.readGameCommand().equals("R")){
            return true;
        }
        return false;
    }

    public static void requestMakeBridge(int size) {
        bridgeGame.setBridgeList(bridgeMaker.makeBridge(size));
    }

    public void requestMoveChoice(int num){
        OutputView.printMoveChoice();
        if(bridgeGame.move(InputView.readMoving(), num)){
            user.getMoveChoiceResult().add("O");
            return;
        }
        user.getMoveChoiceResult().add("X");
    }

    public void requestLogic(){
        while(requestMoveChoiceLogic()) {
            bridgeGame.retry(user);
        }
    }

    public boolean requestMoveChoiceLogic(){
        for (int num = 0; num < bridgeGame.getBridgeList().size(); num++) {
            requestMoveChoice(num);
            OutputView.printMap(user, bridgeGame);
            if (user.getMoveChoiceResult().get(user.getMoveChoiceResult().size() - 1).equals("X")) {
                return requestRetryChoice();
            }
        }
        user.setTryGameResult("성공");
        return false;
    }

    public void requestEnd(){
        OutputView.printResult(user, bridgeGame);
    }
}
