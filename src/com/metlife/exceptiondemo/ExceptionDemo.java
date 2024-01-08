package com.metlife.exceptiondemo;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            int a=10;
            int b=0;
            String name=null;
            System.out.println(name.toUpperCase());
            System.out.println(a/b);
            int[] arr1={10,20,30,45};
            System.out.println(arr1[5]); //new ArrayIndexOutOfBoundsException()

        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        catch (NullPointerException ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println("close browser & close all records");
    }
}
