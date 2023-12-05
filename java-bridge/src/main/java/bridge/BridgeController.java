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
}
