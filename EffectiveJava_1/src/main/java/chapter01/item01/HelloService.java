package chapter01.item01;

public interface HelloService {

    String hello();

    /**
     * 정적 팩토리 메서드 장점 3 --> 정적 팩토리 메서드의 매개변수를 통해 리턴 타입과 호환되는 상위 혹은 하위 타입의 인스턴스를 반환할 수 있다. (Interface 기반 프레임워크, Interface 에 정적 메서드 를 선언하는 것을 의미)
     * 정적 팩토리 메서드 장점 4 --> 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다. (구체적인 타입을 Client 가 모르게 숨길 수 있다.)
     * @param lang
     * @return
     */
    static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }

    static private void prepareMessage() {}

    static String hi() {
        prepareMessage();
        return "hi";
    }

    static String h2() {
        prepareMessage();
        return "hi2";
    }

    default String bye() {
        return "bye";
    }
}
