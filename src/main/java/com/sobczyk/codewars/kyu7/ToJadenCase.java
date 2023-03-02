package com.sobczyk.codewars.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ToJadenCase {

    private int counter;

    public String toJadenCase(String phrase) {
        if (phrase == null) {
            return null;
        } else if (phrase.isEmpty()) {
            return null;
        }
        this.counter = -1;
        String newPhrase = Arrays.stream(phrase.split(""))
                .map(s -> {
                    this.counter ++;
                    if (this.counter == 0) {
                        return s.toUpperCase();
                    } else if (" ".equals(String.valueOf(phrase.charAt(this.counter - 1)))) {
                        return s.toUpperCase();
                    }
                    return s;
                })
                .collect(Collectors.joining(""));
        return newPhrase;
    }
}
