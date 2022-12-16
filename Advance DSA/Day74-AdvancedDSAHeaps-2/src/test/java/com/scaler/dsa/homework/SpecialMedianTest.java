package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class SpecialMedianTest {

    @Test
    public void solve() {
        int[] A = {4, 6, 8, 4};
        SpecialMedian s = new SpecialMedian();
        int ans = s.solve(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {2, 7, 3, 1};
        SpecialMedian s = new SpecialMedian();
        int ans = s.solve(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}