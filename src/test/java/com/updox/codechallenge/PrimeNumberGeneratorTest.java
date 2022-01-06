package com.updox.codechallenge;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PrimeNumberGeneratorTest {

    private PrimeNumberGenerator primeNumberGenerator;

    @Before
    public void setup() {
        primeNumberGenerator = new PrimeNumberGeneratorImpl();
    }

    @Test
    public void isPrime_shouldReturnFalseOnOneAndZero() {
        assertFalse(primeNumberGenerator.isPrime(1));
    }

    @Test
    public void isPrime_shouldReturnTrueOnSmallPrimeNumber() {
        assertTrue(primeNumberGenerator.isPrime(7));
    }

    @Test
    public void isPrime_shouldReturnTrueOnLargePrimeNumber() {
        assertTrue(primeNumberGenerator.isPrime(7919));
    }

    @Test
    public void isPrime_shouldReturnFalseOnSmallNonPrime() {
        assertFalse(primeNumberGenerator.isPrime(9));
    }

    @Test
    public void isPrime_shouldReturnFalseOnLargeNonPrime() {
        assertFalse(primeNumberGenerator.isPrime(817));
    }

    @Test
    public void generate_shouldReturnEmptyListOnRangeBetweenZeroAndOne() {
        List<Integer> result = primeNumberGenerator.generate(0,1);
        assertTrue(result.isEmpty());
    }

    @Test
    public void generate_shouldReturnListWithSinglePrimeIfRangeIsSameNumber() {
        List<Integer> result = primeNumberGenerator.generate(7,7);
        assertTrue(result.contains(7));
    }

    @Test
    public void generate_shouldReturnListOfOrderedPrimes() {
        List<Integer> result = primeNumberGenerator.generate(7900, 7920);

        assertFalse(result.isEmpty());
        assertTrue(result.contains(7901));
        assertTrue(result.contains(7907));
        assertTrue(result.contains(7919));
    }

    @Test
    public void generate_shouldReturnListOfOrderedPrimesWhenStartIsGreaterThanEnd() {
        List<Integer> result = primeNumberGenerator.generate(7920, 7900);

        assertFalse(result.isEmpty());
        assertTrue(result.contains(7901));
        assertTrue(result.contains(7907));
        assertTrue(result.contains(7919));
    }




}
