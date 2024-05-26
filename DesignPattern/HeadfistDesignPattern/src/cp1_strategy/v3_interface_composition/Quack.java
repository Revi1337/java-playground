package cp1_strategy.v3_interface_composition;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack.quack");
    }
}
