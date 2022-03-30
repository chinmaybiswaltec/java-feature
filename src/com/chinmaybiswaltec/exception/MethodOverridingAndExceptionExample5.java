package com.chinmaybiswaltec.exception;

import java.io.IOException;

public class MethodOverridingAndExceptionExample5 {
    public static void main(String[] args) throws IOException {
        Parent5 p = new Child5();
        p.parentMethod();
    }
}

class Parent5{
    public void parentMethod() throws IOException {
        System.out.println("Parent class method. IOException Declared");
    }
}

class Child5 extends Parent5{

    @Override
    public void parentMethod() throws RuntimeException{
        System.out.println("Child class method. RuntimeException");
    }
}

