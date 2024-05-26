package cp1_strategy.v1_extends;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("RubberDuck.삐약삐약");
    }

    @Override
    public void display() {
        System.out.println("RubberDuck.display");
    }

    @Override
    public void fly() {
        // ignore
    }
}
