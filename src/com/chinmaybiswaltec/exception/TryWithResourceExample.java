package com.chinmaybiswaltec.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(new File("hello.txt"))){
           while(scan.hasNext()){
               System.out.println(scan.nextLine());
           }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
