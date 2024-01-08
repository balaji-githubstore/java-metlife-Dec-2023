package com.metlife.inheritance2;

public class PermanentEmployee extends Employee {

    public void calculateSalary(double perDaySalary)
    {
        super.empSalary=30*perDaySalary;
        System.out.println(30*perDaySalary);
    }
    public void printEmployeeType()
    {
        System.out.println("child layer - permanent employee");
    }
}
