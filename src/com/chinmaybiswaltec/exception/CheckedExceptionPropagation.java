package com.chinmaybiswaltec.exception;

import java.io.FileNotFoundException;

public class CheckedExceptionPropagation {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("In main method, calling method1");
        method1();
    }
    static void method1() throws FileNotFoundException {
        System.out.println("In method1 , calling method 2");
        method2();
    }
    static void method2() throws FileNotFoundException {
        System.out.println("In method 2");
        throw new FileNotFoundException();
    }
}
