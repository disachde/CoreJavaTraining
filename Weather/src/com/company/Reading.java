package com.company;

/**
 * Created by DISACHDE on 7/7/2016.
 */
public class Reading {

    String day;
    int hour;
    int temp;
    int windSpeed;

    public Reading( String sample)
    {
        String[] elements = sample.split(", ");
        day = elements[0];
        hour = Integer.valueOf(elements[1]);
        temp = Integer.valueOf(elements[2]);
        windSpeed = Integer.valueOf(elements[3]);
    }

    public String rateTemperature()
    {
        if(temp <55)
            return "cold";
        else if((temp>55)&&(temp<65))
            return "mild";
        else if((temp>65)&&(temp<80))
            return "warm";
        else
            return "hot";

    }

    public String getTime()
    {
        if(hour==9)
            return day+" morning";
        else if (hour==15)
            return day+" afternoon";
        else
            return day+" night";
    }
}
