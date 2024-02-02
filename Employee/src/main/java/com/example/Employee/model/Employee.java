package com.example.Employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id

    private int Eid;
    private String Ename;
    private String Desgination;
    private double Salary;

    private String Address;
    private int Number;

    public Employee(int eid, String ename, String desgination, double salary, String address, int number) {
        Eid = eid;
        Ename = ename;
        Desgination = desgination;
        Salary = salary;
        Address = address;
        Number = number;
    }

    public Employee() {

    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        Eid = eid;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getDesgination() {
        return Desgination;
    }

    public void setDesgination(String desgination) {
        Desgination = desgination;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Eid=" + Eid +
                ", Ename='" + Ename + '\'' +
                ", Desgination='" + Desgination + '\'' +
                ", Salary=" + Salary +
                ", Address='" + Address + '\'' +
                ", Number=" + Number +
                '}';
    }
}
