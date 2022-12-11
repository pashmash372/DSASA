package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class ContactFinderTest {

    @Test
    public void testSolve() {
        int[] A = {0, 0, 1, 1};
        String[] B = {"hack", "hacker", "hac", "hak"};

        ContactFinder c = new ContactFinder();
        int[] ans = c.solve(A, B);
        int[] expected = {2, 0};

        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void testSolve1() {
        int[] A = {0, 1};
        String[] B = {"abcde", "abc"};

        ContactFinder c = new ContactFinder();
        int[] ans = c.solve(A, B);
        int[] expected = {1};

        Assert.assertArrayEquals(expected, ans);
    }
}