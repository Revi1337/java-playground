package _02_structural_patterns._12_proxy._02_after_inheritance;

public class GameServiceProxy extends GameService {

    @Override
    public void startGame() {
        System.out.println("Logging..... Start");
        super.startGame();
        System.out.println("Logging..... End");
    }
}
