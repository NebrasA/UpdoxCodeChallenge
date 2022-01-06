package com.updox.codechallenge;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneratorImpl implements PrimeNumberGenerator {

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {

        List<Integer> listOfPrimes = new ArrayList<>();

        if(startingValue > endingValue) {
            for(int i = startingValue; i >= endingValue; i--) {
                if(isPrime(i)) listOfPrimes.add(i);
            }
        } else {
            for(int i = startingValue; i <= endingValue; i++) {
                if(isPrime(i)) listOfPrimes.add(i);
            }
        }

        return listOfPrimes;
    }

    @Override
    public boolean isPrime(int value) {

        boolean result = true;

        // zero and one are not considered prime numbers, so we check for them first
        if (value == 0 || value == 1) {
            result = false;
        } else {

            for (int i = 1; i <= value; i++) {

                // if the value is divisible by the current integer and the current integer is not 1 or the value,
                // it is not a prime number.
                if (value % i == 0
                        && i != 1
                        && i != value) {
                    result = false;
                    break;
                }

            }
        }

        return result;
    }
}
