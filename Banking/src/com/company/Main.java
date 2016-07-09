package com.company;

public class Main {

    public static void main(String[] args) {

        Account[] accountArray = {new MortgageAccount("Divya",100000), new CheckingAccount("Ankit",200), new CheckingAccount("Dolly",1000)};

        for(int i =0;i<accountArray.length;i++)
        {
            System.out.println("Amount after Deposit 1000 "+accountArray[i].deposit(1000));
            System.out.println("Amount after Withdraw 500 "+accountArray[i].withdraw(500));
            System.out.println("Amount after Withdraw 1000 " +accountArray[i].withdraw(1000));
            System.out.println("Amount after Withdraw 2000 " +accountArray[i].withdraw(2000));
        }


    }
}
