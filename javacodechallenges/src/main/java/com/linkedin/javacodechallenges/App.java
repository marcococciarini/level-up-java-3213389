package com.linkedin.javacodechallenges;

import java.time.LocalDate;
import java.time.ZoneId;
//import java.util.Date;

public class App 
{
    // Create function to calculate the date that's 
    // 100 days from now

    public static LocalDate getDateFromToday(LocalDate from, int numberOfDaysFromToday){
        //LocalDate today =  LocalDate.now(ZoneId.of("Europe/Rome"));
        return from.plusDays(numberOfDaysFromToday);
    }

    public static void main( String[] args )
    {
        LocalDate today = LocalDate.now(ZoneId.of("Europe/Rome"));

        System.out.println("100 days from now is... " +
            getDateFromToday(today, 100));
    }
}
