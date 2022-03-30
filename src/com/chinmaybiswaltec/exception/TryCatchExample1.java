package com.chinmaybiswaltec.exception;

public class TryCatchExample1 {

    public static void main(String[] args) {
        try{
            System.out.println("Some statements");
            //line that throws exception
            int i=100/0;
        }catch(RuntimeException ex){
            ex.printStackTrace();
        }
        System.out.println("Some statements after exception");
    }
}
