package cp1_strategy.v3_interface_composition;

public abstract class Duck {

    protected QuackBehavior quackBehavior; // 1. 오리의 행동 통합
    protected FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) { // 4. 행동을 동적으로 변경할 수 있게 Setter 생성
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) { // 4. 행동을 동적으로 변경할 수 있게 Setter 생성
        this.flyBehavior = flyBehavior;
    }

    public abstract void display();

    public void swim() {
        System.out.println("Duck.swim");
    }

    public void performQuack() {
        quackBehavior.quack();  // 2. 꽥꽥 행동을 직접 처리하는 대신, 참조되는 객체에 행동을 위임.
    }

    public void performFly() {
        flyBehavior.fly();  // 2. 꽥꽥 행동을 직접 처리하는 대신, 참조되는 객체에 행동을 위임.
    }
}
