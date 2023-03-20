package com.sobczyk.codewars.kyu5;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrambliesTest {

    @Test @Order(2)
    void test1() {
        assertEquals(false, Scramblies.scramble("aaa", "b"));
        assertEquals(true, Scramblies.scramble("aaa", "a"));
        assertEquals(false, Scramblies.scramble("aaabrdcgraeiu", "ambasada"));
        assertEquals(true, Scramblies.scramble("aaabrdcgrmsaeiu", "ambasada"));
        assertEquals(false, Scramblies.scramble("abrdcgrmseiu", "ambasada"));
    }

    @Test @Order(1)
    void test2() {
        String s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10000);
        String s2 = "zyxcba".repeat(9000);

        assertEquals(true, Scramblies.scramble(s1, s2));
    }
}