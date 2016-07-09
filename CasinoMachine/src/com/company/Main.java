package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static final int LEAST_STATE_VALUE=0;


    public enum stateOfWheel {
        BAR, MEDAL, COIN, TRIPLEBAR, CHERRY
    }

    public static int[] returnRandomNumber()
    {
        int[] randNumbers = new int[3];

        for(int i=0;i<randNumbers.length;i++)
        {
            int number=ThreadLocalRandom.current().nextInt(LEAST_STATE_VALUE,stateOfWheel.values().length);
            randNumbers[i]=number;
        }

        return randNumbers;

    }

    public static void main(String[] args)
    {
        int randomNumbers[] = returnRandomNumber();
        for(int i=0;i<randomNumbers.length;i++)
        {
            if(i!=0)
                System.out.print(": ");

            System.out.print(stateOfWheel.values()[randomNumbers[i]]);
        }
    }
}
