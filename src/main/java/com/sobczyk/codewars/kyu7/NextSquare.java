package com.sobczyk.codewars.kyu7;

import org.springframework.stereotype.Service;

@Service
public class NextSquare {
    public static long findNextSquare(long sq) {
        if (Math.sqrt(sq) % 1 != 0) {
            return -1;
        } else {
        return (long) (sq + 1 + 2*Math.sqrt(sq));
        }
    }
}
