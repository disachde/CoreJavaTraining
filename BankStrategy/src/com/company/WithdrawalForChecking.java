package com.company;

/**
 * Created by disachde on 7/12/2016.
 */
public class WithdrawalForChecking implements GrantWithdrawalStrategy {
    @Override
    public long withdrawMoney(long balance, long amount) {
        return  balance-amount;
    }

    @Override
    public boolean isWithdrawalPossible(long balance, long amount, int no_of_withdrawals)
    {
        if(((balance-amount)<0)||(no_of_withdrawals>5))
            return false;
        else
            return true;
    }
}
