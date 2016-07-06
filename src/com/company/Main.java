package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        String line = sc.nextLine();
        double f = Double.valueOf(line);
        double c = 5*(f-32)/9;
        System.out.println("Temperature in celsius is : " +c);

    }
}
