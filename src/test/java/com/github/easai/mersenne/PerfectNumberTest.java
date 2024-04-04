package com.github.easai.mersenne;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PerfectNumberTest {

    @Test
    public void testPerfectNumber() {
        assertTrue(PerfectNumber.isPerfect(6));
        assertTrue(PerfectNumber.isPerfect(28));
        assertTrue(PerfectNumber.isPerfect(496));
    }

    @Test
    public void testNotPerfectNumber() {
        assertFalse(PerfectNumber.isPerfect(7));
        assertFalse(PerfectNumber.isPerfect(15));
        assertFalse(PerfectNumber.isPerfect(30));
    }
}