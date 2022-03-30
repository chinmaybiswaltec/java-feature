package com.chinmaybiswaltec.exception;

import java.io.IOException;

public class MethodOverridingAndExceptionExample11 {
    public static void main(String[] args) throws IOException {
        Parent11 p = new Child11();
        p.parentMethod();
    }
}

class Parent11{
    public void parentMethod() throws RuntimeException {
        System.out.println("Parent class method. RuntimeException Declared");
    }
}
class Child11 extends Parent11{
    @Override
    public void parentMethod() throws Exception {
        System.out.println("Child class method. Exception");
    }
}

