package com.metlife.inheritance2;

public class ContractEmployee extends Employee {

    public void calculateSalary(int perHourCost,int totalHour)
    {
        empSalary=8*perHourCost*totalHour;
        System.out.println(8*perHourCost*totalHour);
    }

    public void displayEmployeeRecords()
    {
        System.out.println("---Contract Emplpyee----");
        System.out.println("Employee Id: "+ getEmpId());
        System.out.println("Employee Name:"+getEmpName());
        System.out.println("Employee Salary:"+empSalary);
    }


    public void printEmployeeType() {
        System.out.println("contract type employee");
    }
}
