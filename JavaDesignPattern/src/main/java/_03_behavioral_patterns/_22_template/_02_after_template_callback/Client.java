package _03_behavioral_patterns._22_template._02_after_template_callback;

public class Client {

    public static void main(String[] args) {
        FileProcessor plus = new FileProcessor("number.txt");
        int result1 = plus.process((result, number) -> result += number);
        System.out.println(result1);

        FileProcessor multiply = new FileProcessor("number.txt");
        int result = multiply.process((result2, number) -> result2 *= number);
        System.out.println(result);
    }
}
