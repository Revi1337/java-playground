package _03_behavioral_patterns._16_iterator._01_before;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 이터레이터 패턴을 적용하기 전.
 *
 * Board 안에 있는 Posts 를 순회할 때, Post 안의 Board 가 어떤 구조로 이루어져있는지 Client 가 알게된다.
 *  --> Client 가 Board 의 Posts 는 List 를 쓰고있다는것을 알게되는 단점.
 *  --> 이는 나중에 요구사항에 의해 Board 안의 Posts 의 데이터구조가 배열이나 Set 로 바뀌면 Client 코드 또한 고쳐야함.
 */
public class Board {

    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }
}
