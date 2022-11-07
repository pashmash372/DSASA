package com.scaler.assignment;

import junit.framework.TestCase;

public class IsmagicTest extends TestCase {

    public void testSolve() {
        int A = 83557;
        Ismagic i= new Ismagic();
        int ans = i.solve(A);
        int expected=1;
        assertEquals(expected,ans);
    }public void testSolve1() {
        int A = 1291;
        Ismagic i= new Ismagic();
        int ans = i.solve(A);
        int expected=0;
        assertEquals(expected,ans);
    }
}