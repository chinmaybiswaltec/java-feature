package com.chinmaybiswaltec;

public class WideningCastingExample {
    public static void main(String[] args) {
        byte byteType =1; short shortType=10;
        int intType=100; long longType = 100000;
        float floatType = 10.05f; double doubleType= 20000.006;
        shortType = byteType;intType = shortType;longType = intType;
        floatType =  longType ;doubleType = floatType;
        System.out.println("byteType-->"+byteType+">>shortType-->"+
                shortType+">>intType-->"+intType+">>longType-->"+longType+
        ">>floatType-->"+floatType+">>doubleType-->"+doubleType);
    }
}
//Output
//byteType-->1>>shortType-->1>>intType-->1>>longType-->1>>floatType-->1.0>>doubleType-->1.0
