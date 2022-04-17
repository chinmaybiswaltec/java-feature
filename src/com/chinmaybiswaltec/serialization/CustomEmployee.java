package com.chinmaybiswaltec.serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomEmployee implements Serializable {
    private static final long serialVersionUID = 1L;
    private  int empId;
    private String empName;

    public CustomEmployee(int empId, String empName ){
        this.empId = empId;
        this.empName = empName;
    }

    private void writeObject(ObjectOutputStream oos){
        System.out.println("In writeObject method");
        try{
            oos.writeInt(this.empId);
            oos.writeObject(this.empName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        System.out.println("In readObject method");
        try{
            empId = ois.readInt();
            empName = (String) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
