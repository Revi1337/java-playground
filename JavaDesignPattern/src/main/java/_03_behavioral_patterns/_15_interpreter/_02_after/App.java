package _03_behavioral_patterns._15_interpreter._02_after;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        PostfixExpression expression = PostfixParser.parse("xyz+-");
        Map<Character, Integer> x = Map.of('x', 1, 'y', 2, 'z', 3);
        int result = expression.interpret(x);
        System.out.println("result = " + result);
    }

//    public static void main(String[] args) {
//        PostfixExpression expression = PostfixParser.parse("xyz+-a+");
//        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3, 'a', 4));
//        System.out.println(result);
//    }
}
