package com.chinmaybiswaltec.exception;

public class MethodOverridingAndExceptionExample3 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        p.parentMethod();
    }
}

class Parent3{
    public void parentMethod(){
        System.out.println("Parent class method. No Exception Declared");
    }
}

class Child3 extends Parent3{

    @Override
    public void parentMethod(){
        System.out.println("Child class method. Runtime(checked) exception declared");
    }
}

