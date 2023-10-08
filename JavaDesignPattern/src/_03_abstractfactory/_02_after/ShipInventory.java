package _03_abstractfactory._02_after;

import _02_factorymethod._01_before_java_9._01_after.Ship;
import _02_factorymethod._01_before_java_9._01_after.ShipFactory;


public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println("ship.getAnchor() = " + ship.getAnchor());
        System.out.println("ship.getWheel() = " + ship.getWheel());
    }
}
