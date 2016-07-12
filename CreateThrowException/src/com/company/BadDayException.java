package com.company;

public class BadDayException extends Exception {

    public BadDayException(){
        super();

    }
    public BadDayException( Throwable cause )
    {
        super( cause );

    }


    public int checkForBadDay(String month, int days) throws BadDayException
    {
        int val = 0;
        try{
            Main.MonthOfYear mon = Main.MonthOfYear.valueOf(month);
            val = mon.getValue();
            if(Main.numberOfDays[val] == days)
                System.out.println("Correct number of days");
            else
                throw new BadDayException();

        }catch(Exception e){
            throw  new BadDayException(e);
        }


        return 0;
    }


}
