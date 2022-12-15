package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class AthlargestelementTest {

    @Test
    public void solve() {

        int[] B = {1, 2, 3, 4, 5, 6};
        int A = 4;
        Athlargestelement a = new Athlargestelement();
        int[] ans = a.solve(A, B);
        int[] expected = {-1, -1, -1, 1, 2, 3};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {

        int[] B = {15, 20, 99, 1};
        int A = 2;
        Athlargestelement a = new Athlargestelement();
        int[] ans = a.solve(A, B);
        int[] expected = {-1, 15, 20, 20};
        Assert.assertArrayEquals(expected, ans);
    }
}