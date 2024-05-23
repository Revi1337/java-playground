package _03_behavioral_patterns._13_chain_of_responsibilities._02_after;


/**
 * 1. Handler 의 역할이 되는 인터페이스 혹은 추상 클래스를 만들어준다.
 *    --> 어짜피 다음 핸들러로 넘어가기 위한 필드변수가 필요하므로 추상 클래스가 추천되는 바이다.
 *    --> 해당 클래스에서 특정한 역할을 마치고 다음 핸들러에 역할을 위임하는 형태이다.
 */
public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
