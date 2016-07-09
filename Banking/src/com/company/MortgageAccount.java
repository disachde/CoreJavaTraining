package com.company;

/**
 * Created by DISACHDE on 7/8/2016.
 */
public class MortgageAccount extends Account
{

    private long amountBorrowed;

    public MortgageAccount(String holderName, long amountBorrowed)
    {
        super(holderName);
        System.out.println("Initial Amount Borrowed "+amountBorrowed);
    }

    public boolean deposit(long amount)
    {
        transaction("Mortgage Payment", amount);
        return true;
    }

    public boolean withdraw(long amount)
    {
        return false;
    }
}
