package cp1_strategy.v2_interface;

public class RedheadDuck extends Duck implements Quackable, Flyable {

    @Override
    public void fly() {
        System.out.println("RedheadDuck.fly");
    }

    @Override
    public void quack() {
        System.out.println("RedheadDuck.quack");
    }

    @Override
    public void display() {
        System.out.println("RedheadDuck.display");
    }
}
