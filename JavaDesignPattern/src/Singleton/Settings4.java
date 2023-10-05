package Singleton;

/**
 * Singleton 을 ThreadSafe 하게 할 수 있는 세번째 방법.
 * Double Checked Locking 을 사용한 방법을 의미한다.
 * 두개의 스레드가 동시에 인스턴스 == null 을 패스하였다하더라도, synchronized 블럭안에서 똑같이 if 를 통해 인스턴스가 null 인지 확인하고 있기 때문에
 * double checked locking 이라고 불린다. 또한, volatile 키워드를 붙여줘야 완성이 된다.
 *
 * 해당 방법이 Settings2 방법보다 성능이 유리한 이유는 인스턴스를 생성할때마다 synchronized 가 실행되는 Settings2 와 달리
 * Settings4 에서는 동시성이 터졌을때만 synchronized 를 실행하기 때문임. 또한 인스턴스가 필요한 시점에 생성할 수 있는 장점이 있다.
 *
 * 단점은 이해하기 어렵다는 것과 코드복잡도가 있으며 volatile 이 붙어야 하는 이유를 알기 위해서는 자바 1.4 이하 버전을 알아야 함.
 * 그리고 자바 1.5 이상을 사용해야 한다..
 */
public class Settings4 {

    private static volatile Settings4 instance;

    private Settings4() {}

    public static Settings4 getInstance() {
        if (instance == null) {
            synchronized (Settings4.class) {
                if (instance == null) {
                    instance = new Settings4();
                }
            }
        }
        return instance;
    }
}
