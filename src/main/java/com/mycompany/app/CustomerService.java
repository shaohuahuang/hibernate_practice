package com.mycompany.app;

/**
 * Created by AirShaos on 25/12/16.
 */
public class CustomerService {
  private String name;
  private String url;
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  public void printName() {
    System.out.println("Customer name : " + this.name);
  }
  
  public void printURL() {
    System.out.println("Customer website : " + this.url);
  }
  
  public void printThrowException() {
    throw new IllegalArgumentException();
  }
}
