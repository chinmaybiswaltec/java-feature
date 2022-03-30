package com.chinmaybiswaltec.exception;

public class ExceptionPropagationExample {

    public static void main(String[] args) {
        System.out.println("Inside Main method which has no Exception Handler");
        // So Exception Propagates to the JVM for default Handler
        method1();
    }
   static  void method1(){
        // No Handler provided for the exception,hence it propagates to its parent method
       System.out.println("Inside method1 which has no Exception Handler");
       method2();
    }
    static  void method2(){
        System.out.println("Inside method2 where exception happened");
        // This throws DivideByZero Runtime Exception.
        //No Handler provided for the exception,hence it propagates to its parent method
        int x = 10/0;
    }
}
