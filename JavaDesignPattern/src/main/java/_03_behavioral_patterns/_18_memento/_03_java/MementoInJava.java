package _03_behavioral_patterns._18_memento._03_java;

import java.io.*;

public class MementoInJava {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO Serializable
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        // TODO 직렬화
        try(
                FileOutputStream fileOut = new FileOutputStream("GameSave");
                ObjectOutputStream out = new ObjectOutputStream(fileOut)
        ) {
            out.writeObject(game);
        }

        game.setBlueTeamScore(25);
        game.setRedTeamScore(15);

        // TODO 역직렬화
        try(
                FileInputStream fileIn = new FileInputStream("GameSave");
                ObjectInputStream in = new ObjectInputStream(fileIn)
        ) {
            game = (Game) in.readObject();
            System.out.println(game.getBlueTeamScore());
            System.out.println(game.getRedTeamScore());
        }
    }
}
