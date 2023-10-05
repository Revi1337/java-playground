package _01_singleton;

public class App {

    public static void main(String[] args) {
        Settings5 instance = Settings5.getInstance();
        Settings5 instance1 = Settings5.getInstance();
        System.out.println(instance == instance1);
    }
}
