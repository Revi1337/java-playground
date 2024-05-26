package cp1_strategy.v1_extends;

/**
 * Conclusion
 *
 * 상속을 사용하게 되면 규격(Duck) 이 바뀔때마다 영원히 Duck 의 서브 클래스 fly() 와 quack() 같은 메서드들을 일일히 살펴보고 상황에 따라 오버라이딩 해야 함.
 * --> 특정 형식의 오리만 날거나 꽥꽥거릴 수 있도록 하는 깔끔한 방법을 찾아야 함.
 */
public class DecoyDuck extends Duck {

    @Override
    public void quack() {
        // ignored
    }

    @Override
    public void fly() {
        // ignored
    }
}
