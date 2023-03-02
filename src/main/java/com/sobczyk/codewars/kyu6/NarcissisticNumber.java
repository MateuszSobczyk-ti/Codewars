package com.sobczyk.codewars.kyu6;

public class NarcissisticNumber {

    public static boolean isNarcissistic(int number) {
        char[] chars = String.valueOf(number).toCharArray();
        int power = chars.length;
        int result = 0;
        for (char c : chars) {
            result += Math.pow(Character.getNumericValue(c), power);
        }
        return result == number;
    }

}
