package com.chinmaybiswaltec.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodOverridingAndExceptionExample9 {
    public static void main(String[] args) throws IOException {
        Parent9 p = new Child9();
        p.parentMethod();
    }
}

class Parent9{
    public void parentMethod() throws RuntimeException {
        System.out.println("Parent class method. RuntimeException Declared");
    }
}

class Child9 extends Parent9{

    @Override
    public void parentMethod() throws ArithmeticException {
        System.out.println("Child class method. ArithmeticException");
    }
}

