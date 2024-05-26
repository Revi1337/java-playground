package cp1_strategy.v3_interface_composition;

/**
 * 이제부터 Duck 의 행동은 해당 인터페이스를 구현한 별도의 클래스 안에 들어있음.
 * 이제 Duck 클래스에서는 그 행동을 구체적으로 구현할 필요가 없음.
 */
public interface FlyBehavior {

    void fly();

}
