package com.company;

/**
 * Created by disachde on 7/12/2016.
 */
public interface GrantWithdrawalStrategy {

    public long withdrawMoney(long balance, long amount);
    public boolean isWithdrawalPossible(long balance, long amount, int no_of_withdrawals);

}
