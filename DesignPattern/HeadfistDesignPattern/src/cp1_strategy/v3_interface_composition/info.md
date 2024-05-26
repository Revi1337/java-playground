### Conclusion

오리의 행동을 디자인 및 구현하였음. (오리의 행동과 관련된 유연성을 개선)

> 디자인 원칙 : 구현보다는 인터페이스에 맞춰서 프로그래밍한다. (상위 형식에 맞춰 다형성을 활용하며 프로그래밍 한다는 의미)

1. FlyBehavior, FlyWithWings, FlyNoWay, QuakBehavior, Quack, Squeak, MuteQuack
   - 다른 형식의 객체에서도 나는행동과 꽥꽥거리는 행동을 재사용할 수 있음. 그 이유는 행동이 더 이상 Dock 클래스 안에 숨겨져 있지 않기 때문.
   - 또한, 기존 Dock 을 수정하지 않고 새로운 행동을 추가할 수 있음. (OCP)

2. Duck 에 행동들을 통합.(`두 클래스를 통합`) (Duck 의 인스턴스에 행동을 할당할 수 있게 만듬)
   - 행동들을 Duck 클래스에서 정의한 메서드를 써서 구현하지 않고, `다른 클래스에 위임`.
   - Duck 의 필드 변수를 의미.
    
3. 행동을 동적으로 바꿀 수 있게끔 setter 설정 (Duck)

각 행동들의 집합을 `알고리즘군` 으로 생각할 수 있음.

### 두 클래스를 합치는 방법 (Composition) (매우 중요한 테크닉)
두 클래스를 합치는 방법 (Composition)

> 디자인 원칙 : 상속보다는 구현을 활용한다. ("A 는 B 이다" 보다 "A 에는 B가 있다" 가 나을 수 있다.)

Duck 은 FlyBehavior, QuackBehavior 가 있고, 행동들을 위임받고 있음. 이런식으로 두 클래스를
합치는 것을 구성(Composition) 이라고 함.


> [!note] 전략 패턴
> Strategy 패턴은 알고리즘군(행동들)을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해준다.
전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있다. (OCP, SRP)