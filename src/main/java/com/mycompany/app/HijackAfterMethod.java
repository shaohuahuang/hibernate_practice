package com.mycompany.app;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by AirShaos on 25/12/16.
 */
public class HijackAfterMethod implements AfterReturningAdvice{
  @Override
  public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
    System.out.println("HijackAfterMethod : After method hijacked!");
  }
}
