package com.mycompany.app;

/**
 * Created by AirShaos on 25/12/16.
 */
public class MessageUtil {
  private String message;
  
  public MessageUtil(String message){
    this.message = message;
  }
  
  public String printMessage(){
    System.out.println(message);
    return message;
  }
  
  public String salutationMessage() {
    return "Hi! " + message;
  }
}
