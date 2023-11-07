package _01_creational_patterns._01_singleton;

/**
 * Singleton 을 ThreadSafe 하게 할 수 있는 두번째 방법.
 * 인스턴스를 미리 만들어놓고 반환하는 방법. (이른 초기화 (Eager Initialization) 이라고 한다)
 * 어떠한 로직도없고 인스턴스만 반환하면 되기때문에 Thread Safe 하다.
 *
 * 하지만 미리 인스턴스를 만들어놓는다는 것 자체가 단점이 될 수 있다.
 * 만약 이 인스턴스를 만들어왔는데 사용하지않으면 불필요한 인스턴스를 미리 만들어놓은꼴임 --> 인스턴스를 만드는 비용이 더 크면 리스크가 커지겠지
 * 한마디로, getInstance() 를 호출했을떄 인스턴스를 만들고 싶은데 그럴수가 없다는 것임.
 */
public class Settings3 {

    private static final Settings3 INSTANCE = new Settings3();

    private Settings3() {}

    public static Settings3 getInstance() {
        return INSTANCE;
    }

}
