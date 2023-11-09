package _02_structural_patterns._12_proxy._03_java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

    @Around("bean(gameService)")
    public Object timeStamp(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long before = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        System.out.println(System.currentTimeMillis() - before);
        return result;
    }
}
