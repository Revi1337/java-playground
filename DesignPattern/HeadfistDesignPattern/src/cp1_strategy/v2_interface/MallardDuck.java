package cp1_strategy.v2_interface;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("MallardDuck.display");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck.fly");
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck.quack");
    }
}
