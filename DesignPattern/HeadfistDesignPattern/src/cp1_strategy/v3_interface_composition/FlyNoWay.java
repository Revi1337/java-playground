package cp1_strategy.v3_interface_composition;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("FlyNoWay.fly");
    }
}
