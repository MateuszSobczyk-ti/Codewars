package com.sobczyk.codewars.kyu5;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HumanReadableTime {

    final static int SECINHOUR = 60*60;
    final static int SECINMIN = 60;

    public static String makeReadable(int seconds) {
        NumberFormat formatter = new DecimalFormat("00");
        int h = seconds/HumanReadableTime.SECINHOUR;
        int m = (seconds - h*HumanReadableTime.SECINHOUR)/HumanReadableTime.SECINMIN;
        int s = seconds - h*HumanReadableTime.SECINHOUR - m*HumanReadableTime.SECINMIN;
        return formatter.format(h)+":"+formatter.format(m)+":"+formatter.format(s);
    }

}
