package com.metlife.collections;

import java.util.HashMap;
import java.util.Map;

public class Demo4 {
    public static void main(String[] args) {

        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(101,"saul");
        map1.put(102,"peter");
        map1.put(103,"ken");
        map1.put(103,"kim");

        System.out.println(map1.get(103));
        System.out.println(map1.size());
        map1.remove(102);

        System.out.println(map1);

        //will start at 4:20 PM IST
    }
}
