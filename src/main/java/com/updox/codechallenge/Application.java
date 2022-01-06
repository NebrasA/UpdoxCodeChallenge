package com.updox.codechallenge;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number in range: ");
        int first = scanner.nextInt();
        System.out.println("Second number in range: ");
        int second = scanner.nextInt();

        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();
        List<Integer> result = primeNumberGenerator.generate(first, second);
        System.out.println("List of Prime Numbers are: " + result);


    }
}
