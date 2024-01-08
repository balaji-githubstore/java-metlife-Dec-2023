package com.metlife.inheritance2;

public abstract class Employee {
    private int empId;
    private String empName;
    protected double empSalary;

    public void displayEmployeeRecords()
    {
        System.out.println("Employee Id: "+ getEmpId());
        System.out.println("Employee Name:"+ getEmpName());
        System.out.println("Employee Salary:"+empSalary);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    //rules to be implemented in the inherited class
    public abstract void printEmployeeType();


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
