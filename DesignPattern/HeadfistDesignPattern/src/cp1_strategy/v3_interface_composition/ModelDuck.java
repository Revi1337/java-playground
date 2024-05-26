package cp1_strategy.v3_interface_composition;

/**
 *  새로운 Duck 생성 (행동을 다르게 정의)
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("ModelDuck.display");
    }
}
