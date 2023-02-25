package com.sobczyk.codewars.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExesOhsTest {

    @Test
    void test1() {
        assertEquals(true, new ExesOhs().getResult("xxxooo"));
    }

    @Test
    void test2() {
        assertEquals(false, new ExesOhs().getResult(null));
    }

    @Test
    void test3() {
        assertEquals(true, new ExesOhs().getResult(""));
    }

    @Test
    void test4() {
        assertEquals(true, new ExesOhs().getResult("==!'"));
    }

    @Test
    void test5() {
        assertEquals(true, new ExesOhs().getResult("XxXoOo"));
    }

    @Test
    void test6() {
        assertEquals(false, new ExesOhs().getResult("xxxozo"));
    }
}