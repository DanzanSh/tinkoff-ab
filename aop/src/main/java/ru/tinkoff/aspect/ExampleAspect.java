package ru.tinkoff.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect {
    @Pointcut("execution(* ru.tinkoff.service.AspectService.*(..))")
    public void handle() {
    }

    @Before("handle()")
    public void beforeAdvice() {
        System.out.println("Advice before ");
    }

    @Around(value = "handle()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) {
        System.out.println("Advice around, start");
        try {
            joinPoint.proceed();
            System.out.println("Advice around, end");
        }
        catch (Throwable throwable) {
            System.out.println("Advice around, exception");
        }
    }

    @After("handle()")
    public void afterAdvice() {
        System.out.println("Advice after ");
    }
}
