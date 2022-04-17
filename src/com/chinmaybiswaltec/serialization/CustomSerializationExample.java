package com.chinmaybiswaltec.serialization;

import java.io.*;

public class CustomSerializationExample {

    public static void main(String[] args) {
        CustomEmployee emp1 = new CustomEmployee(1, "Rahul");
        CustomEmployee emp2 = new CustomEmployee(2, "Dravid");

        try {
            OutputStream fout = new FileOutputStream("empSer.txt");
            ObjectOutput oout = new ObjectOutputStream(fout);
            System.out.println("Serializing CustomEmployee Object");
            oout.writeObject(emp1);oout.writeObject(emp2);
            oout.close();
            System.out.println("Serializing process of Employee Object completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
