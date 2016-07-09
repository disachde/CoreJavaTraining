package com.company;

/**
 * Created by DISACHDE on 7/8/2016.
 */
public class CheckingAccount extends Account
{
    private long overdraftAmount;

    public CheckingAccount(String holderName, long overdraftAmount)
    {
        super(holderName);
        this.overdraftAmount=overdraftAmount;
    }

    public boolean withdraw(long amount)
    {
        if (amount > getBalance() + overdraftAmount)
            return false;

        else {
            transaction("Checking Withdrawal", amount);
            return true;
        }
    }


    public boolean deposit(long amount)
    {
        transaction("Checking Deposit",amount);
        return true;
    }

}
