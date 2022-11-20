package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class PeriodofastringTest {
    @Test
    public void solve() {
        String A = "abababab";
        Periodofastring p = new Periodofastring();
        int ans = p.solve(A);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String A = "aaaa";
        Periodofastring p = new Periodofastring();
        int ans = p.solve(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve2() {
        String A = "abacabacaba";
        Periodofastring p = new Periodofastring();
        int ans = p.solve(A);
        int expected = 4;
        Assert.assertEquals(expected, ans);
    }

}