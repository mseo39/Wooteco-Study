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
}
