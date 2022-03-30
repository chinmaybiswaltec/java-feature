
package com.chinmaybiswaltec.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodOverridingAndExceptionExample8 {
    public static void main(String[] args) throws IOException {
        Parent8 p = new Child8();
        p.parentMethod();
    }
}

class Parent8{
    public void parentMethod() throws IOException {
        System.out.println("Parent class method. IOException Declared");
    }
}

class Child8 extends Parent8{

    @Override
    public void parentMethod() throws Exception {
        System.out.println("Child class method. FileNotFoundException");
    }
}

