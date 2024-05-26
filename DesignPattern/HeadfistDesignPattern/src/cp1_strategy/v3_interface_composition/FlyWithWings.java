package cp1_strategy.v3_interface_composition;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("FlyWithWings.fly");
    }
}
