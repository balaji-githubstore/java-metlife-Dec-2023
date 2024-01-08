package com.metlife.exceptiondemo;

public class ExceptionDemo2 {

    public static void main(String[] args) {

        try {
            int a=10;
            int b=0;
            String name=null;
            System.out.println(name.toUpperCase()); //new NullPointerException()
            System.out.println(a/b); //new ArithmeticException()
            int[] arr1={10,20,30,45};
            System.out.println(arr1[5]); //new ArrayIndexOutOfBoundsException()

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            throw ex;
        }
        finally {
            //runs always
            System.out.println("close browser & close all records");
        }



    }
}
