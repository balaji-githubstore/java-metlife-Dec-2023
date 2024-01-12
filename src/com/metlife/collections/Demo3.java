package com.metlife.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {

        //create a arraylist for storing 50,60,44,889,43,23,190
        //remove 60
        //write a logic to print only values greater than or equal to 50

        List<Integer> arr=new ArrayList<>();
        arr.add(50);
        arr.add(60);
        arr.add(44);
        arr.add(889);
        arr.add(43);
        arr.add(23);
        arr.add(190);

        arr.remove((Object)60);
//        arr.remove(60);

        System.out.println(arr);

        for (int val : arr)
        {
            if(val>=50)
            {
                System.out.println(val);
            }

        }
    }
}
