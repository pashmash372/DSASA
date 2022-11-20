package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class CountATest {

    @Test
    public void solve() {
        String A = "aab";
        CountA c = new CountA();
        int ans = c.solve(A);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String A = "bcbc";
        CountA c = new CountA();
        int ans = c.solve(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}