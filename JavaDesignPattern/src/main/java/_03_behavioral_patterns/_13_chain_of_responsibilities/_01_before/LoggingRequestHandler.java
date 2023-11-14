package _03_behavioral_patterns._13_chain_of_responsibilities._01_before;

/**
 * 책임 연쇄 패턴 적용 전
 * --> RequestHandler 를 상속하고 인증로직을 추가하고 부모를 호출한다.
 *
 * 단점 (2)
 * --> LoggingRequestHandler 와 AuthRequestHandler 를 둘다 사용하고싶을떄 복잡해진다는 것이다.
 *     이 이유는 Client 가 사용하려는 RequestHandler 의 종류를 직접 알아야 하기 때문이다.
 */
public class LoggingRequestHandler extends RequestHandler {

    @Override
    public void handle(Request request) {
        System.out.println("로깅");
        super.handle(request);
    }
}
