package com.chinmaybiswaltec.exception;

public class MultipleCatchBlocksExample2 {

    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            int res = 10/0;
        }catch (RuntimeException ex){
            System.out.println("Runtime exception");
        }
    }
}
