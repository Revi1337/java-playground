package _02_structural_patterns._12_proxy._02_after_inheritance;

public class Client {

    public static void main(String[] args) {
        GameService gameServiceProxy = new GameServiceProxy();
        gameServiceProxy.startGame();
    }
}
