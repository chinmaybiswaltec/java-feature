package com.chinmaybiswaltec.exception;

import java.io.IOException;

public class MethodOverridingAndExceptionExample10 {
    public static void main(String[] args) throws IOException {
        Parent10 p = new Child10();
        p.parentMethod();
    }
}

class Parent10{
    public void parentMethod() throws RuntimeException {
        System.out.println("Parent class method. RuntimeException Declared");
    }
}

class Child10 extends Parent10{

    @Override
    public void parentMethod()  {
        System.out.println("Child class method. No Exception");
    }
}

