package com.sobczyk.codewars.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NarcissisticNumberTest {

    @Test
    void test1() {
        assertEquals(true, NarcissisticNumber.isNarcissistic(153));
    }

    @Test
    void test2() {
        assertEquals(false, NarcissisticNumber.isNarcissistic(1938));
    }

    @Test
    void test3() {
        assertEquals(true, NarcissisticNumber.isNarcissistic(1634));
    }

    @Test
    void test4() {
        assertEquals(true, NarcissisticNumber.isNarcissistic(1));
    }
}