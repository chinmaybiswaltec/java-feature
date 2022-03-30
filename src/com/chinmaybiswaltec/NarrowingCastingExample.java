package com.chinmaybiswaltec;

public class NarrowingCastingExample {
    public static void main(String[] args) {
        double doubleType = 20.90;
       // int intType= doubleType;//compileation error
        int intType= (int)doubleType;//down casting
        System.out.println(intType);//
    }
}
//Output: 20
// Deciaml part data is lost
