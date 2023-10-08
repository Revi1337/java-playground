package _03_abstractfactory._01_before;


import _02_factorymethod._01_before_java_9._01_after.DefaultShipFactory;
import _02_factorymethod._01_before_java_9._01_after.Ship;
import _02_factorymethod._01_before_java_9._01_after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }

}
