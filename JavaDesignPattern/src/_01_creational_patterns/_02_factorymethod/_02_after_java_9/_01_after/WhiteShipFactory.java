package _01_creational_patterns._02_factorymethod._02_after_java_9._01_after;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
