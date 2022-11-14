package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class SubarraywithgivensumTest {

    @Test
    public void solve() {
        int[] A = {1, 2, 3, 4, 5};
        int B = 5;
        Subarraywithgivensum s = new Subarraywithgivensum();
        int[] ans = s.solve(A, B);
        int[] expected = {2, 3};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {5, 10, 20, 100, 105};
        int B = 110;
        Subarraywithgivensum s = new Subarraywithgivensum();
        int[] ans = s.solve(A, B);
        int[] expected = {-1};
        Assert.assertArrayEquals(expected, ans);
    }
}