package com.sobczyk.codewars.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescendingOrderTest {

    @Test
    public void test1() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test2() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }

    @Test
    public void test3() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

    @Test
    public void test4() {
        assertEquals(988544, DescendingOrder.sortDesc(889445));
    }

}