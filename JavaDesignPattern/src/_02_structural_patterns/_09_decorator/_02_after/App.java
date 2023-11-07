package _02_structural_patterns._09_decorator._02_after;


public class App {

    private static boolean enabledSpamFilter = true;
    private static boolean enableTrimming = true;

    public static void main(String[] args) {
        // DefaultCommentService 만 사용
        DefaultCommentService defaultCommentService1 = new DefaultCommentService();
        Client client = new Client(defaultCommentService1);
        System.out.println("============================");
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
        System.out.println("============================");

        // DefaultCommentService 와 TrimmingCommentDecorator 사용
        DefaultCommentService defaultCommentService2 = new DefaultCommentService();
        TrimmingCommentDecorator trimmingCommentDecorator = new TrimmingCommentDecorator(defaultCommentService2);
        Client client2 = new Client(trimmingCommentDecorator);
        System.out.println("============================");
        client2.writeComment("오징어게임");
        client2.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client2.writeComment("http://whiteship.me");
        System.out.println("============================");

        // DefaultCommentService 와 TrimmingCommentDecorator, SpamFilteringCommentDecorator 모두 사용
        DefaultCommentService defaultCommentService3  = new DefaultCommentService();
        TrimmingCommentDecorator trimmingCommentDecorator2 = new TrimmingCommentDecorator(defaultCommentService3);
        SpamFilteringCommentDecorator spamFilteringCommentDecorator = new SpamFilteringCommentDecorator(trimmingCommentDecorator2);
        Client client3 = new Client(spamFilteringCommentDecorator);
        System.out.println("============================");
        client3.writeComment("오징어게임");
        client3.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client3.writeComment("http://whiteship.me");
        System.out.println("============================");

        // 또한 Runtime 시점에 동적으로 부가기능 사용 가능
        CommentService commentService = new DefaultCommentService();
        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        if (enableTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }
        Client client4 = new Client(commentService);
        System.out.println("============================");
        client4.writeComment("오징어게임");
        client4.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client4.writeComment("http://whiteship.me");
        System.out.println("============================");
    }
}
