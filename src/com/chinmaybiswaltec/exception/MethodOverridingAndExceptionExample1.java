package com.chinmaybiswaltec.exception;

public class MethodOverridingAndExceptionExample1 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.parentMethod();
    }
}

class Parent{
    public void parentMethod(){
        System.out.println("Parent class method. No Exception Declared");
    }
}
class Child extends Parent{

    @Override
    public void parentMethod() throws RuntimeException{
        System.out.println("Child class method. Runtime(checked) exception declared");
    }
}

