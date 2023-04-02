package com.sobczyk.codewars.kyu5;

import java.util.Arrays;

public class StringIncrementer {

    public static String incrementString(String str) {
        int[] revStr = Arrays.stream(new StringBuilder(str).reverse().toString().split(""))
                .takeWhile(s -> {
                    try {
                        Integer.parseInt(s);
                        return true;
                     } catch(NumberFormatException e ) {
                       return false;
                    }
            }).mapToInt(n -> Integer.parseInt(n))
                .toArray();
        str = str.substring(0,str.length() - revStr.length);
        String str2 = "";
        boolean flag = true;
        for(int i=0; i<revStr.length; i++) {
            if (revStr[i] != 9 && flag) {
                str2 += revStr[i] + 1;
                flag = false;
            } else if (revStr[i] == 9 && flag) {
                str2 += 0;
            } else {
                str2 += revStr[i];
            }
        }
        if (revStr.length == 0 || revStr[revStr.length - 1] == 9 && flag) {
            str2 += 1;
        }
        return str + new StringBuilder(str2).reverse();
    }
}
