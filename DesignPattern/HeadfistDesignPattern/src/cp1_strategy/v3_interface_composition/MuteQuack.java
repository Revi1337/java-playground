package cp1_strategy.v3_interface_composition;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("MuteQuack.quack");
    }
}
