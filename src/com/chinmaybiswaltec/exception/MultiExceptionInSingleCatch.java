package com.chinmaybiswaltec.exception;

public class MultiExceptionInSingleCatch {
    public void method(){
        System.out.println("Inside method");
    }
    public static void main(String[] args) {
        MultiExceptionInSingleCatch obj= new MultiExceptionInSingleCatch();
        try{
            System.out.println("Inside try block");
            obj.method();
            int res = 10/0;

        }catch (ArithmeticException  ex){
            ex.printStackTrace();
        }
    }
}
