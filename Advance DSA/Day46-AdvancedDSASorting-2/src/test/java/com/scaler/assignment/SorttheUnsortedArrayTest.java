package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class SorttheUnsortedArrayTest {

    @Test
    public void solve() {
        int[] A = {0, 1, 15, 25, 6, 7, 30, 40, 50};
        SorttheUnsortedArray s = new SorttheUnsortedArray();
        int ans = s.solve(A);
        int expected=4;
        Assert.assertEquals(expected,ans);
    }

    @Test
    public void solve1() {
        int[] A = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        SorttheUnsortedArray s = new SorttheUnsortedArray();
        int ans = s.solve(A);
        int expected = 6;
        Assert.assertEquals(expected, ans);
    }
}