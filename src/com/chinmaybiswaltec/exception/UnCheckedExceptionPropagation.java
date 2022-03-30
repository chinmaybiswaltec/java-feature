package com.chinmaybiswaltec.exception;

public class UnCheckedExceptionPropagation {
    public static void main(String[] args) {
        System.out.println("In main method, calling method 1");
        method1();
    }

    static void method1(){
        System.out.println("In main method1, calling method2");
        method2();
    }

    static void method2(){
        System.out.println("In main method2");
        throw new NullPointerException();
    }
}
