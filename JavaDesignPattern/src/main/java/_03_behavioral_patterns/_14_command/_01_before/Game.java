package _03_behavioral_patterns._14_command._01_before;

public class Game {

    private boolean isStart;

    public void start() {
        System.out.println("Start Game");
        this.isStart = true;
    }

    public void end() {
        System.out.println("End Game");
        this.isStart = false;
    }
}
