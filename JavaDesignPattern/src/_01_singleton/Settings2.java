package _01_singleton;


/**
 * Singleton 을 ThreadSafe 하게 할 수 있는 첫번째 방법.
 *
 * 단점으로는 getInstance() 로 인스턴스를 호출할때마다 동기화처리하는 작업으로인해 성능의 불이득이 생길 수 있는 단점이 있음.
 * 내부적으로 Lock, Release 개념이 반복적으로 돌아가기 때문임.
 */
public class Settings2 {

    private static Settings2 instance;

    private Settings2() {}

    public static synchronized Settings2 getInstance() {
        if (instance == null)
            instance = new Settings2();
        return instance;
    }
}
