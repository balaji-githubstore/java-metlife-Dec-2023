package com.metlife.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {

        List<String> colors=new ArrayList<String >();
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
//        colors.add(20);
        System.out.println(colors);
        System.out.println(colors.size());
        colors.remove("yellow");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.get(1));
    }
}
