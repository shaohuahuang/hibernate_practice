package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AirShaos on 25/12/16.
 */
public class TestJunit1 {
  String message = "Robert";
  MessageUtil messageUtil = new MessageUtil(message);
  
  @Test
  public void testPrintMessage(){
    System.out.println("Inside testPrintMessage()");
    assertEquals(message, messageUtil.printMessage());
  }
}
