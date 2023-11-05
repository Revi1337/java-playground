package _01_creational_patterns._05_prototype._02_after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        // TODO Clone 생성. Cloneable 은 Shallow Copy (얕은 복사). 따라서 GithubIssue 내부의 GithubRepository 는 똑같음.
        //  GithubIssue 내부의 GithubRepository 까지 다르게 복사 DeepCopy 하려면, Prototype 에 오버라이딩한 clone() 메서드에서 딥카피가 발생하도록 만들면 됨.
        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());

        repository.setUser("revi1337");

        // TODO Shallow Copy 테스트
        System.out.println(clone.getRepository() == githubIssue.getRepository());
        System.out.println(clone.getUrl());

        // TODO Deep Copy 테스트
        System.out.println(githubIssue.getUrl());
        System.out.println(clone.getUrl());
    }

}
