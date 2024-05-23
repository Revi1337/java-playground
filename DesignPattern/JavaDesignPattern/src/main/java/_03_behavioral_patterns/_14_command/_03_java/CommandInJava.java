package _03_behavioral_patterns._14_command._03_java;

import _03_behavioral_patterns._14_command._02_after.Game;
import _03_behavioral_patterns._14_command._02_after.Light;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {

    public static void main(String[] args) {
        Light light = new Light();
        Game game = new Game();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(game::start);
        executorService.submit(game::end);
        executorService.submit(light::on);
        executorService.submit(light::off);
    }
}
