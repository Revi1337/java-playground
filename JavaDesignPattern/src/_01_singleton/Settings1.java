package _01_singleton;


/**
 * 가장 기초적인 싱글톤 패턴 --> 하지만 Thread Safe 하지 않음.
 */
public class Settings1 {

    private static Settings1 instance;

    private Settings1() {}

    /**
     * 해당 static 메서드에서 동시성 이슈 발생
     * 첫번째 Thread 가 instance 가 null 임을 판단하고 21 line 의 새로운 인스턴스를 할당하기 전에
     * 두번쨰 Thread 가 동일하게 20 line 에 들어오게되면, 첫번쨰 두번째 쓰레드 모두 새로운 인스턴스가 만들어지게 됨.
     * @return
     */
    public static Settings1 getInstance() {
        if (instance != null)
            instance = new Settings1();
        return instance;
    }
}
