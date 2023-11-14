package _03_behavioral_patterns._13_chain_of_responsibilities._03_java;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = "/hello")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        // TODO 전처리
        System.out.println("게임에 참가하신 여러분 모두 진심으로 환영합니다.");
        chain.doFilter(request, response);
        // TODO 후처리
        System.out.println("꽝!");
    }
}
