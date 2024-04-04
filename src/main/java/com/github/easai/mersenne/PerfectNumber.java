package com.github.easai.mersenne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A class that checks if a number is a perfect number.
 */
public class PerfectNumber {

    /**
     * Calculates the root of a given number using the Heron's method.
     * 
     * @param x the number to calculate the root for
     * @return the root
     */
    public static int sqrt(int x) {
        double y = 1;
        double prev = 0;
        while (1 <= Math.abs(y - prev)) {
            prev = y;
            y = 1.0 / 2 * (prev + x / prev);
        }
        while ((y + 1) * (y + 1) < x) {
            y++;
        }
        return (int) y;
    }

    /**
     * Calculates the factors of a given number.
     *
     * @param x the number to calculate the factors for
     * @return a list of the factors
     */
    public static List<Integer> factor(int x) {
        int n = sqrt(x);
        List<Integer> set = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (x % i == 0) {
                set.add(i);
                if (i != x / i) {
                    set.add(x / i);
                }
            }
        }
        Collections.sort(set);
        return set;
    }

    /**
     * Calculates the sum of the k-th powers of the elements in the list.
     *
     * @param d the list of elements
     * @param k the power to raise the elements to
     * @return the sum of the k-th powers
     */
    public static int divisorFunction(List<Integer> d, int k) {
        int res = 0;
        for (int i = 0; i < d.size(); i++) {
            res += Math.pow(d.get(i), k);
        }
        return res;
    }

    /**
     * Checks if a given number is a perfect number.
     *
     * @param n the number to check
     * @return true if the number is perfect, false otherwise
     */
    public static boolean isPerfect(int n) {
        List<Integer> lst = factor(n);
        int sum = divisorFunction(lst, 1);
        return 2 * n == sum;
    }

    /**
     * Main method to test the PerfectNumber class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int num = 28;
        if (PerfectNumber.isPerfect(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
