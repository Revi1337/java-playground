package cp1_strategy.v3_interface_composition;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings(); // 3. 상속된 인스턴스 변수를 특정한 행동으로 초기화
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck.display");
    }
}
