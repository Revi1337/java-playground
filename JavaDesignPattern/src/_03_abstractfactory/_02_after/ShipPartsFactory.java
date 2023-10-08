package _03_abstractfactory._02_after;


// 추상 팩토리가 생긴 것. 추상 팩토리 패턴이라고 말하는 이유중 하나. --> 가장 중요한 역할.
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}
