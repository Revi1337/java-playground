package _03_behavioral_patterns._13_chain_of_responsibilities._01_before;

/**
 * 책임 연쇄 패턴 적용 전
 * --> RequestHandler 를 상속하고 인증로직을 추가하고 부모를 호출한다.
 *
 * 단점 (1)
 * --> SRP 를 지킬 수 있지만, Client 가 기존의 RequestHandler 를 사용할지 AuthRequestHandler 를 사용할지 선택을 해야한다는 것이다.
 */
public class AuthRequestHandler extends RequestHandler {

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었나?");
        System.out.println("이 핸들러를 사용할 수 있는 유저인가?");
        super.handle(request);
    }
}
