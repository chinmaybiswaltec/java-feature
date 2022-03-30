package com.chinmaybiswaltec.exception;

import java.io.IOException;

public class MethodOverridingAndExceptionExample6 {
    public static void main(String[] args) throws IOException {
        Parent6 p = new Child6();
        p.parentMethod();
    }
}

class Parent6{
    public void parentMethod() throws IOException {
        System.out.println("Parent class method. IOException Declared");
    }
}

class Child6 extends Parent6{

    @Override
    public void parentMethod() throws IOException{
        System.out.println("Child class method. IOException");
    }
}

