package com.sobczyk.codewars.kyu5;

import java.util.Arrays;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        return CountIPAddresses.calculateAddress(end) - CountIPAddresses.calculateAddress(start);
    }

    private static long calculateAddress(String address) {
        var wrapper = new Object(){int ord = 3;};
        return Arrays.stream(address.split("\\."))
                .mapToLong(n -> (long) Math.pow(256,wrapper.ord--) * Long.valueOf(n))
                .sum();
    }
}
