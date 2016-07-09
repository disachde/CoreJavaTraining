package com.company;

/**
 * Created by DISACHDE on 7/8/2016.
 */
public abstract class Account {

    private long balance;
    private String holderName;

    public Account()
    {}

    public Account(String name)
    {
        holderName = name;
    }

    public final void transaction(String message, long amount)
    {
        System.out.println("Account Holder's name is "+holderName);
        System.out.println("Transaction Message " +message);
        System.out.println("Transaction Amount "+amount);
    }

    public long getBalance()
    {
        return balance;
    }

    public abstract boolean deposit(long amount);

    public abstract boolean withdraw(long amount);




}


