package com.sobczyk.codewars.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareDigitTest {

    @Test
    public void test1() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
    }

    @Test
    public void test2() {
        assertEquals(0, new SquareDigit().squareDigits(0));
    }

    @Test
    public void test3() {
        assertEquals(6449360, new SquareDigit().squareDigits(8760));
    }


}