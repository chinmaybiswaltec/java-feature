package com.chinmaybiswaltec.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodOverridingAndExceptionExample7 {
    public static void main(String[] args) throws IOException {
        Parent7 p = new Child7();
        p.parentMethod();
    }
}

class Parent7{
    public void parentMethod() throws IOException {
        System.out.println("Parent class method. IOException Declared");
    }
}

class Child7 extends Parent7{

    @Override
    public void parentMethod() throws FileNotFoundException {
        System.out.println("Child class method. FileNotFoundException");
    }
}

