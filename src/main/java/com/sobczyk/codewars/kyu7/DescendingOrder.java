package com.sobczyk.codewars.kyu7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        String sortedString = Arrays.stream(String.valueOf(num).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(""));
        return Integer.valueOf(sortedString);
    }

}
