package _03_behavioral_patterns._13_chain_of_responsibilities._02_after;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기입니다.");
        requestHandler.handle(request);
    }

    /**
     * 2. RequestHandler 를 Chain 으로 만들어주어야 한다.
     * @param args
     */
    public static void main(String[] args) {
        RequestHandler requestHandlerChain = new AuthRequestHandler(
                new LoggingRequestHandler(
                        new PrintRequestHandler(null)
                )
        );

        Client client = new Client(requestHandlerChain);
        client.doWork();
    }
}