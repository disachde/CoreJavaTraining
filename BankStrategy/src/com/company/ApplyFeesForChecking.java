package com.company;

/**
 * Created by disachde on 7/12/2016.
 */
public class ApplyFeesForChecking implements ApplyFeesStrategy {
    @Override
    public long incurFees(long balance, double threshold) {
        if(balance<25)
            return 5;
        else
            return 0;
    }
}
