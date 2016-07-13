package com.company;

/**
 * Created by disachde on 7/12/2016.
 */
public class WithdrawalforMortgage implements GrantWithdrawalStrategy {
    @Override
    public long withdrawMoney(long balance, long amount) {
        return 0;
    }

    @Override
    public boolean isWithdrawalPossible(long balance, long amount, int no_of_withdrawals) {
        System.out.println("No withdrawals allowed for Mortgage account");
        return false;
    }


}
