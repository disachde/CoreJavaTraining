package com.company;

public class Main {

    public static void main(String[] args) {

        //Withdrawing $50 from checking
        Account CheckingAccount = new Account(new WithdrawalForChecking(), new ApplyFeesForChecking());
        System.out.println("Executing Grant Withdrawal Strategy for Checking");
        System.out.println(CheckingAccount.executeGrantWithdrawalStrategy(1000,50));
        System.out.println("Executing Apply Fees Strategy for Checking");
        System.out.println(CheckingAccount.executeApplyFeesStrategy(1000,25));


        //Withdrawing from Mortgage
        Account MortgageAccount = new Account(new WithdrawalforMortgage(), new ApplyFeesForMortgage());
        System.out.println("Executing Grant Withdrawal Strategy for Mortgage");
        System.out.println(MortgageAccount.executeGrantWithdrawalStrategy(1000,50));
        System.out.println("Executing Apply Fees Strategy for Mortgage");
        System.out.println(MortgageAccount.executeApplyFeesStrategy(1000,25));


    }
}
