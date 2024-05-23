package _02_structural_patterns._12_proxy._02_after_interface;

public class Client {

    public static void main(String[] args) {
        DefaultGameService defaultGameService = new DefaultGameService();
        GameServiceProxy gameServiceProxy = new GameServiceProxy(defaultGameService);
        gameServiceProxy.startGame();
    }
}
