package _03_behavioral_patterns._16_iterator._01_before;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

        // TODO 들어간 순서대로 순회하기
        //  Board 안에 있는 Post 를 순회할 때, Post 안의 Board 가 어떤 구조로 이루어져있는지 Client 가 알게된다.
        //  --> List 를 쓰고있다는것을 알게되는 단점.
        //  --> 나중에 요구사항에 의해 Board 안의 Posts 의 데이터구조가 배열이나 Set 로 바뀌면 Client 코드 또한 고쳐야함.
        List<Post> posts = board.getPosts();
        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        System.out.println();

        // TODO 가장 최신 글 먼저 순회하기
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }
    }

}
