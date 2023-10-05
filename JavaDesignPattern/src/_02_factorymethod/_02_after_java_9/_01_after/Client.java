package _02_factorymethod._02_after_java_9._01_after;

public class Client {

    public static void main(String[] args) {
        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "keesun@mail.com");
        System.out.println("whiteShip = " + whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "keesun@mail.com");
        System.out.println("blackShip = " + blackShip);
    }

}
