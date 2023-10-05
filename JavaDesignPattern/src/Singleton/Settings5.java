package Singleton;

/**
 * Singleton 을 ThreadSafe 하게 할 수 있는 네번째 방법. (가장 심플하며 가장 권장되는 방법 중 하나임. --> 이는 즉 한가지만 있는것이 아니라는..)
 * 해당 방법은 static inner class  를 사용하는 방법
 *
 * 멀티스레드 환경에서도 안전하고, getInstance() 를 호출해야 Inner Class 가 로딩이되고 InnerClass 를 만들기 때문에
 * 인스턴스를 생성하고싶은 시점에 생성할 수 있는 Lazy Initialize 이 가능해진다.
 *
 *
 */
public class Settings5 {

    private Settings5() {}

    public static Settings5 getInstance() {
        return Settings5Holder.INSTANCE;
    }

    private static class Settings5Holder {
        private static final Settings5 INSTANCE = new Settings5();
    }

}
