package com.chinmaybiswaltec;

public class AutomaticTypeConversionExample {
    public static void main(String[] args) {
        double d = 10.5;
        int i = 10;
        var v = d*i;
        System.out.println(v);
    }
}
//Output : 105.0
