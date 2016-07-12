package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

	    printContents(args);
    }

    public static void printContents(String[] arr)
    {
        System.out.print("Contents of the array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
