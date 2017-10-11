package com.example.testlib;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Avinash on 11-10-2017.
 */

public class TestUtils {

    public static String getCurrentDateAndTime(){

        long currentTimeInMillis = System.currentTimeMillis();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy hh:mm", Locale.US);

        // Create a calendar object that will convert the date and time value in milliseconds to date.
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeInMillis);
        return formatter.format(calendar.getTime());
    }
}
