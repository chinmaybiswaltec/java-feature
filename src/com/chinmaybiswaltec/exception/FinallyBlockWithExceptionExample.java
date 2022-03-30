package com.chinmaybiswaltec.exception;

import java.sql.SQLOutput;

public class FinallyBlockWithExceptionExample {
    public static void main(String[] args) {
        try{
            System.out.println("Some statements before exception");
            int x= 10/0;
        }catch(Exception ex){
            System.out.println("In catch block");
            ex.printStackTrace();
        } finally{
            System.out.println("In Finally block");
        }
    }
}
