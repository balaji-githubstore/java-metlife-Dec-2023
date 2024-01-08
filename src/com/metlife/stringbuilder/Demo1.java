package com.metlife.stringbuilder;

public class Demo1 {
    public static void main(String[] args) {

       String c1="red";
       String c2="black";

       String c3="red";

       c1=c1.replace("r","b");
       c1=c1.toUpperCase();

       String c4=new String("red");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        //mutable
        StringBuilder b1=new StringBuilder("red");
        b1.replace(0,1,"b");
        System.out.println(b1);

    }
}
