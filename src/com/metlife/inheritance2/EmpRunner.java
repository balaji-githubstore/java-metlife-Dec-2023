package com.metlife.inheritance2;

public class EmpRunner {
    public static void main(String[] args) {

//        Employee e=new Employee();

        PermanentEmployee p=new PermanentEmployee();
        p.setEmpId(101);

        p.calculateSalary(1500);
        p.displayEmployeeRecords();
        p.printEmployeeType();

        ContractEmployee c=new ContractEmployee();
        c.setEmpId(1001);
        c.calculateSalary(10,30);
        c.displayEmployeeRecords();
        c.printEmployeeType();
    }
}
