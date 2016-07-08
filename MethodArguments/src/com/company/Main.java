package com.company;

public class Main {

    public static String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

    public static void main(String[] args)
    {
        System.out.println(addUp(3.2, 2.2)); //will invoke the double method as both parameters are double
        System.out.println(addUp(1, 4)); //will invoke int method as both parameters are int
        System.out.println(addUp("one", "three")); //will invoke string method as both parameters are string
        System.out.println(addUp(2, 3.5)); //will invoke double due to type casting
        //System.out.println(addUp(1, "three")); //compile fails here as it could not find any match with respect to parameters, int and String
        //System.out.println(addUp());//will not compile as its an ambiguous method call, it is unable to figure out which method to call
        System.out.println(addUp(1));
        System.out.println(addUp(1,2));
        System.out.println(addUp("one"));
        System.out.println(addUp(1.1,2.4,7.9,4));
    }


    public static int addUp(int... numbers)
    {
        System.out.println("int method executed");
        int total =0;
		for(int i:numbers)
            total+=i;
        return total;
    }

    public static double addUp(double... numbers)
    {
        System.out.println("double method executed");
        double total =0;
        for(double i:numbers)
            total+=i;
        return total;
    }

    public static int addUp(String... numbers)
    {
        System.out.println("String method executed");
        int total =0;
        for(String i:numbers)
            total+=toNumber(i);
        return total;
    }

    /*public static int addUp(int a, int b)
    {
        System.out.println("int method executed");
        return a+b;
    }

    public static double addUp(double a, double b)
    {
        System.out.println("double method executed");
        return a+b;
    }

    public static int addUp(String a, String b)
    {
        System.out.println("String method executed");
        return (toNumber(a))+(toNumber(b));
    }*/



    public static int toNumber(String input)
    {
        for(int i=0; i<arr.length;i++)
        {
            if(input.equals(arr[i]))
                return i;
        }
        return -1;
    }

}
