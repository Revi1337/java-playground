package chapter01.item01;


import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

//    public static void main(String[] args) {
//        HelloService ko = HelloService.of("ko");
//        System.out.println(ko.hello());
//        System.out.println("ko = " + ko.getClass().getSimpleName());
//
//        HelloService eng = HelloService.of("eng");
//        System.out.println(eng.hello());
//        System.out.println("eng = " + eng.getClass().getSimpleName());
//    }

    /**
     * 정적 팩토리 메서드 장점 5 --> ServiceLoader 의 정적 팩토리 메서드(load)를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다. (서비스 제공자 프레임워크 = ServiceLoader)
     *                       --> ServiceLoader (자바에서 기본 제공) 를 사용하면 현재 참조할 수 있는 Classpath 내에 있는 모든 HelloService 의 구현체들을 모두 가져온다.
     *                       --> 무슨 말이냐.. ServiceLoader 의 팩토리 메서드(load)를 작성하는 시점에는 Interface 만 있고 Interface 의 구현체가 존재하지 않아도 참조할 수 있는다른 classpath 에서 HelloService 의 구현체들을 모두 가져올 수 있다는 의미.
     * @param args
     */
    public static void main(String[] args) {
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> helloServiceOptional = loader.findFirst();
        helloServiceOptional.ifPresent(helloService -> System.out.println(helloService.hello()));
    }
}
