package com.github.easai.mersenne;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertThrows;
// import static org.junit.jupiter.api.Assertions.assertThrows;

public class MersenneTest {

    @Test
    public void testMersenne() {
        assertEquals(BigInteger.valueOf(1).shiftLeft(31).subtract(BigInteger.ONE), Mersenne.MersenneNumber(31));
    }

    @Test
    public void testIsPrime() {
        assertTrue(Mersenne.isPrime(2));
        assertTrue(Mersenne.isPrime(3));
        assertFalse(Mersenne.isPrime(4));
        assertTrue(Mersenne.isPrime(5));
    }

    @Test
    public void testIsPrimeBigInteger() {
        assertTrue(Mersenne.isPrime(BigInteger.valueOf(2)));
        assertTrue(Mersenne.isPrime(BigInteger.valueOf(3)));
        assertFalse(Mersenne.isPrime(BigInteger.valueOf(4)));
        assertTrue(Mersenne.isPrime(BigInteger.valueOf(5)));
    }

    @Test
    public void testTestLucasLehmer() throws Exception {
        assertTrue(Mersenne.testLucasLehmer(7));
        assertFalse(Mersenne.testLucasLehmer(11));
    }

    // @Test
    // public void testExceptions() {
    // assertThrows(Exception.class, () -> Mersenne.testLucasLehmer(2));
    // assertThrows(Exception.class, () -> Mersenne.testLucasLehmer(4));
    // }
}
