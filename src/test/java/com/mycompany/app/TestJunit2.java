package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AirShaos on 25/12/16.
 */
public class TestJunit2 {
  String message = "Robert";
  
  MessageUtil messageUtil = new MessageUtil(message);
  
  @Test
  public void testSalutationMessage(){
    System.out.println("Inside testSalutationMessage()");
    message = "Hi!" + " Robert";
    assertEquals(message, messageUtil.salutationMessage());
  }
}
