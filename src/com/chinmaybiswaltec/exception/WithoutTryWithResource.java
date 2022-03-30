package com.chinmaybiswaltec.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class WithoutTryWithResource {
    public static void main(String[] args) {
        Scanner scan = null;
        try{
            scan = new Scanner(new File("hello.txt"));
            while(scan.hasNext()){
                System.out.println(scan.nextLine());
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }finally {
            //Close the connection
            if(Objects.nonNull(scan)){
                scan.close();
            }
        }
    }
}
