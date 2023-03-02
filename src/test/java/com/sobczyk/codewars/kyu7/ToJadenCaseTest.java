package com.sobczyk.codewars.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToJadenCaseTest {

    ToJadenCase toJadenCase = new ToJadenCase();

    @Test
    void test1() {
        assertEquals("How Can Mirrors Be Real If Our Eyes Aren't Real",
                this.toJadenCase.toJadenCase("How can mirrors be real if our eyes aren't real"));
    }

    @Test
    public void test2() {
        assertEquals("Most Trees Are Blue", this.toJadenCase.toJadenCase("most trees are blue"));
    }

    @Test
    public void test3() {
        assertNull(null, this.toJadenCase.toJadenCase(null));
    }

    @Test
    public void test4() {
        assertNull(null, this.toJadenCase.toJadenCase(""));
    }
}