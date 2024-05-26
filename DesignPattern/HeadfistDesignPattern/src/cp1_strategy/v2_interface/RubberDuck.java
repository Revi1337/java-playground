package cp1_strategy.v2_interface;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void quack() {
        System.out.println("RubberDuck.quack");
    }

    @Override
    public void display() {
        System.out.println("RubberDuck.display");
    }
}
