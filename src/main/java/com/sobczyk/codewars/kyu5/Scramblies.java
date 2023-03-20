package com.sobczyk.codewars.kyu5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1);
        String leftString = Arrays.stream(str2.split(""))
                .takeWhile(s -> {
                    if (sb.indexOf(s) == -1) {
                        return false;
                    } else {
                        sb.deleteCharAt(sb.indexOf(s));
                        return true;
                    }
                }).collect(Collectors.joining(""));
        return leftString.equals(str2);
    }

}