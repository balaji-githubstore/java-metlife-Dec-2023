package com.metlife.collections;

import com.metlife.employees.Employee;

import java.util.ArrayList;

public class Demo1 {

    public static void main(String[] args) {

        //non-generic collection //non-recommeded
        ArrayList lists=new ArrayList();
        lists.add(10);
        lists.add(10.2);
        lists.add("hello"); //load values as object // boxing
//        lists.add(new Employee());

        String name= (String) lists.get(2);  //object to respective datatype //unboxing
        System.out.println(name);
        System.out.println(name.toUpperCase());

    }

}
