package _03_abstractfactory._02_after;


import _02_factorymethod._01_before_java_9._01_after.DefaultShipFactory;
import _02_factorymethod._01_before_java_9._01_after.Ship;
import _02_factorymethod._01_before_java_9._01_after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }

}
