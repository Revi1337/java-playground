package _01_creational_patterns._02_factorymethod._01_before_java_9._01_after;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
