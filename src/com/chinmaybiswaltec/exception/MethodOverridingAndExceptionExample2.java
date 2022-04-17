/*
package com.chinmaybiswaltec.exception;

import java.io.IOException;

public class MethodOverridingAndExceptionExample2 {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        p.parentMethod();
    }
}

class Parent2{
    public void parentMethod(){
        System.out.println("Parent class method. No Exception Declared");
    }
}

class Child2 extends Parent2{

    @Override
    public void parentMethod() throws IOException {
        System.out.println("Child class method. Runtime(checked) exception declared");
    }
}

*/
