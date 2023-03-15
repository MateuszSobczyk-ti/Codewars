package com.sobczyk.codewars.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareDigit {

    public int squareDigits(int n) {
        String squareString = Arrays.stream(String.valueOf(n).split(""))
                .map(number -> Integer.valueOf(number))
                .map(number -> String.valueOf(number*number))
                .collect(Collectors.joining(""));
        return Integer.valueOf(squareString);
    }
}
