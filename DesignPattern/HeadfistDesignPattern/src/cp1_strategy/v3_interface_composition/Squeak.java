package cp1_strategy.v3_interface_composition;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak.quack");
    }
}
