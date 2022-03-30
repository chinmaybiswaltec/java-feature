package com.chinmaybiswaltec.exception;

public class MultipleCatchBlocksExample1 {

    public void method(){
        System.out.println("Inside method");
    }

    public static void main(String[] args) {
        MultipleCatchBlocksExample1 obj=null;
        try{
            System.out.println("Inside try block");
            obj.method();
            int res = 10/0;

        }catch (ArithmeticException ex){
            System.out.println("Arithmetic exception");
        }catch(NullPointerException ex){
            System.out.println("NullPointer exception");
        }catch(Exception ex){
            System.out.println("Exception exception");
        }
    }
}
