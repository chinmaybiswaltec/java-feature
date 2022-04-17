package com.chinmaybiswaltec.serialization;

import java.io.*;

public class SerializationExample {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Rahul");
        Employee emp2 = new Employee(2, "Dravid");

        try {
            OutputStream fout = new FileOutputStream("empSer.txt");
            ObjectOutput oout = new ObjectOutputStream(fout);
            System.out.println("Serializing Employee Object");
            oout.writeObject(emp1);oout.writeObject(emp2);
            oout.close();
            System.out.println("Serializing process of Employee Object completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
