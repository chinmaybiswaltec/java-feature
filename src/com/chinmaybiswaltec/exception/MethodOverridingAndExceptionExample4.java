package com.chinmaybiswaltec.exception;

import java.io.IOException;

public class MethodOverridingAndExceptionExample4 {
    public static void main(String[] args) throws IOException {
        Parent4 p = new Child4();
        p.parentMethod();
    }
}

class Parent4{
    public void parentMethod() throws IOException {
        System.out.println("Parent class method. IOException Declared");
    }
}

class Child4 extends Parent4{

    @Override
    public void parentMethod(){
        System.out.println("Child class method. No Exceptions");
    }
}

