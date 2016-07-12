package com.company;

public class Main {

    public static int[] numberOfDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};


    public enum MonthOfYear {
        January(1), February(2), March(3), April(4), May(5), June(6), July(7),
        August(8), September(9), October(10), November(11), December(12);


        private int _value;

        MonthOfYear(int Value) {
            this._value = Value;
        }

        public int getValue() {
            return _value;
        }


    }

    public static void acceptInput(String month, int days){

        BadMonthException bm = new BadMonthException();

        try {
            bm.checkForBadMonth(month);
        } catch (BadMonthException e) {
            System.out.println(e.getMessage());
            System.out.println("Bad Month Exception");
            System.exit(0);
        }

        BadDayException bde = new BadDayException();
        try {
            bde.checkForBadDay(month, days);
        } catch (BadDayException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        acceptInput("Jun", 31);

    }
}

