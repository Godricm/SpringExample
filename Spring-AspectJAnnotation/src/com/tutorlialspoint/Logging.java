package com.tutorlialspoint;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {
    @Pointcut("execution(* com.tutorlialspoint.*.*(..))")
    private void selectAll(){}

    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("Going to setup student profile");
    }

    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("Student profile has been setup");
    }

    @AfterReturning(pointcut = "selectAll()",returning = "retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:"+retVal.toString());
    }

    @AfterThrowing(pointcut = "selectAll()",throwing = "ex")
    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception:"+ex.toString());
    }
}
