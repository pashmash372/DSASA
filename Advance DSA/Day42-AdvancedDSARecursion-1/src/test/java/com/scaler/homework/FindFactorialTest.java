package com.scaler.homework;

import junit.framework.TestCase;

public class FindFactorialTest extends TestCase {

    public void testSolve() {
        int A = 4;
        int expected = 24;
        FindFactorial f = new FindFactorial();
        int ans = f.solve(A);
        assertEquals(expected, ans);
    } public void testSolve1() {
        int A = 1;
        int expected = 1;
        FindFactorial f = new FindFactorial();
        int ans = f.solve(A);
        assertEquals(expected, ans);
    }
}