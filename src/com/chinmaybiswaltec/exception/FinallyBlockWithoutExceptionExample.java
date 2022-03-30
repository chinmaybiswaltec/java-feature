package com.chinmaybiswaltec.exception;

public class FinallyBlockWithoutExceptionExample {
    public static void main(String[] args) {
        try{
            System.out.println("Some statements before exception");
            int x= 10/2;
        }catch(Exception ex){
            System.out.println("In catch block");
            ex.printStackTrace();
        } finally{
            System.out.println("In Finally block");
        }
    }
}
