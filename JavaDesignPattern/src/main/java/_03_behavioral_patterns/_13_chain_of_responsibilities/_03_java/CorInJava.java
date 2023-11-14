package _03_behavioral_patterns._13_chain_of_responsibilities._03_java;

import jakarta.servlet.Filter;

public class CorInJava {

    public static void main(String[] args) {
        Filter filter = (request, response, chain) -> {
            // TODO 전처리
            chain.doFilter(request, response);
            // TODO 후처리
        };
    }
}
