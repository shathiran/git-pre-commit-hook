package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* This is a demo.
* \n@author Sharan
*
*/
@SpringBootApplication
public class DemoApplication {

  /**
  * This is a main method.
  * \n@param args
  */
  public static void main(final String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
  
  private void method1() {
    String s1 = "SAMPE";
  }
  
  private void method2() {
    String s1 = "SAMPE";
  }
}
