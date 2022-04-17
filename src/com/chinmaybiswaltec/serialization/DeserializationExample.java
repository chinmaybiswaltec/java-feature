package com.chinmaybiswaltec.serialization;

import java.io.*;

public class DeserializationExample {

    public static void main(String[] args) {
        InputStream fin;
        try {
            fin = new FileInputStream("empSer.txt");
            ObjectInput oin = new ObjectInputStream(fin);
            System.out.println("Deserializing Employee Object");
            Employee emp ;
            while ((emp = (Employee) oin.readObject()) != null){
                System.out.println(emp);
            }
            oin.close();
        } catch (EOFException e) {
            System.out.println("Reading file ended");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Deserialization process completed");
    }
}
