package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class ReversepairsTest {

    @Test
    public void solve() {
        int[] A = {1, 3, 2, 3, 1};
        Reversepairs r = new Reversepairs();
        int ans = r.solve(A);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {4, 1, 2};
        Reversepairs r = new Reversepairs();
        int ans = r.solve(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }
}