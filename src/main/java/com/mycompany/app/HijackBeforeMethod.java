package com.mycompany.app;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by AirShaos on 25/12/16.
 */
public class HijackBeforeMethod implements MethodBeforeAdvice {
  @Override
  public void before(Method method, Object[] objects, Object o) throws Throwable {
    System.out.println("HijackBeforeMethod: Before method hijacked");
  }
}
