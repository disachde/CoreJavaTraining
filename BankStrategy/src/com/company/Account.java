package com.company;

/**
 * Created by disachde on 7/12/2016.
 */
public class Account {

    private long balance;
    private long amount;
    private int no_of_withdrawals;




    private GrantWithdrawalStrategy gwStrategy;
    private ApplyFeesStrategy afStrategy;

    public Account(GrantWithdrawalStrategy gws, ApplyFeesStrategy afs)
    {
        gwStrategy=gws;
        afStrategy=afs;

    }

    public long executeGrantWithdrawalStrategy(long balance, long amount)
    {
        if(gwStrategy.isWithdrawalPossible(balance, amount, no_of_withdrawals)) {
            no_of_withdrawals++;
            System.out.println("Amount withdrawn"+amount);
            return gwStrategy.withdrawMoney(balance, amount);
        }
        else
            return 0;
    }

    public long executeApplyFeesStrategy(long balance, double threshold)
    {
        System.out.println("Fees applied");
        return afStrategy.incurFees(balance,threshold);
    }

    public void depositAmount(long amtToBeDeposited)
    {
        balance=balance+amtToBeDeposited;
        System.out.println("Amount deposited");
    }

    private void transaction(String message, long amount)
    {
        System.out.println(message);
    }
}
