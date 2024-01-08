package com.metlife.inheritancedemo;

class Father
{
    public int fAge=60;
    public Father(int f)
    {
        fAge=f;
        System.out.println("father constructor");
    }

    public void fatherStyle()
    {
        System.out.println("father style-2");
    }
}
class Son extends Father
{
    public int sAge=20;

    public Son(int f,int s)
    {
        super(f);
        sAge=s;
        System.out.println("Son Constructor");

    }
    public void sonStyle()
    {
//        System.out.println(super.fAge);
//        super.fatherStyle();
        System.out.println("son style");
    }
}

public class Demo1Inheritance {
    public static void main(String[] args) {

//        Father f=new Father();
//        System.out.println(f.fAge);
//        f.fatherStyle();

        Son s=new Son(70,30);
        System.out.println(s.fAge);
        System.out.println(s.sAge);
        s.fatherStyle();
        s.sonStyle();
    }
}

