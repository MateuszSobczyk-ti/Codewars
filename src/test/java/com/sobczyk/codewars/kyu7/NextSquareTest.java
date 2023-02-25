package com.sobczyk.codewars.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextSquareTest {

    @Test
    void test1() {
        assertEquals(-1, NextSquare.findNextSquare(120));
    }

    @Test
    void test2() {
        assertEquals(144, NextSquare.findNextSquare(121));
    }

    @Test
    void test3() {
        assertEquals(1, NextSquare.findNextSquare(0));
    }

    @Test
    void test4() {
        assertEquals(4, NextSquare.findNextSquare(1));
    }

    @Test
    void test5() {
        assertEquals(676, NextSquare.findNextSquare(625));
    }

}