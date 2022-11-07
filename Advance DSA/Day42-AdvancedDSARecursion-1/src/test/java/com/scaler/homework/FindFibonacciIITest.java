package com.scaler.homework;

import junit.framework.TestCase;

public class FindFibonacciIITest extends TestCase {

   public void test() {
        int A = 2;
        FindFibonacciII f = new FindFibonacciII();
        int ans = f.findAthFibonacci(A);
        int expected = 1;
        assertEquals(expected, ans);
    }

    public void test1() {
        int A = 9;
        FindFibonacciII f = new FindFibonacciII();
        int ans = f.findAthFibonacci(A);
        int expected = 34;
        assertEquals(expected, ans);
    }

}