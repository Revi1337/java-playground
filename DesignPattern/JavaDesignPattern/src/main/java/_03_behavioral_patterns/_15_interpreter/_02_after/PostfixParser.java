package _03_behavioral_patterns._15_interpreter._02_after;

import java.util.Stack;

public class PostfixParser {

    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        return switch (c) {
            case '+' -> PostfixExpression.plus(stack.pop(), stack.pop());
            case '-' -> {
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                yield PostfixExpression.minus(left, right);
            }
            default -> PostfixExpression.variable(c);
        };
    }
}


//package _03_behavioral_patterns._15_interpreter._02_after;
//
//import java.util.Stack;
//
//public class PostfixParser {
//
//    public static PostfixExpression parse(String expression) {
//        Stack<PostfixExpression> stack = new Stack<>();
//        for (char c : expression.toCharArray()) {
//            stack.push(getExpression(c, stack));
//        }
//        return stack.pop();
//    }
//
//    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
//        return switch (c) {
//            case '+' -> new PlusExpression(stack.pop(), stack.pop());
//            case '-' -> {
//                PostfixExpression right = stack.pop();
//                PostfixExpression left = stack.pop();
//                yield new MinusExpression(left, right);
//            }
//            default -> new VariableExpression(c);
//        };
//    }
//}
