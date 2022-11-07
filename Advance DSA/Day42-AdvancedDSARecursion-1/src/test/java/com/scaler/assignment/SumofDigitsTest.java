package com.scaler.assignment;

import junit.framework.TestCase;
import org.junit.Test;

public class SumofDigitsTest extends TestCase {

    @Test
    public void testSolve() {
        int n = 46;
        SumofDigits s = new SumofDigits();
        int ans = s.solve(n);
        int expected = 10;
        assertEquals(expected, ans);
    }@Test
    public void testSolve1() {
        int n = 11;
        SumofDigits s = new SumofDigits();
        int ans = s.solve(n);
        int expected = 2;
        assertEquals(expected, ans);
    }
}