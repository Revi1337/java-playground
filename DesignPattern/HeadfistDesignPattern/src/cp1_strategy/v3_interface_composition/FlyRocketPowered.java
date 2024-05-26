package cp1_strategy.v3_interface_composition;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("FlyRocketPowered.fly");
    }
}
