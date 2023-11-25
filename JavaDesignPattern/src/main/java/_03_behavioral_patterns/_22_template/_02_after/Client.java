package _03_behavioral_patterns._22_template._02_after;

public class Client {

    public static void main(String[] args) {
        FileProcessor plus = new Plus("number.txt");
        int result1 = plus.process();
        System.out.println(result1);

        FileProcessor multiply = new Multiply("number.txt");
        int result2 = multiply.process();
        System.out.println(result2);
    }
}
