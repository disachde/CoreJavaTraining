package com.company;

public class BadMonthException extends Exception {


    public BadMonthException(){
        super();

    }
    public BadMonthException( Throwable cause )
    {
        super( cause );

    }


    public void checkForBadMonth(String month) throws BadMonthException
    {
        try{

            Main.MonthOfYear mon = Main.MonthOfYear.valueOf(month);

        }catch(Exception e){

            throw new BadMonthException(e);
        }


    }
}
