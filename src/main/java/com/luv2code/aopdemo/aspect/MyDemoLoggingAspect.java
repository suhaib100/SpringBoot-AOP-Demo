package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

 // @Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")

  //@Before("execution(public void add*())")
  @Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
//@Before("execution(public void updateAccount() )")
    public void beforeAddAccountAdvice(){
    System.out.println("\n====>>> Executing @before advice on method");
}

}
