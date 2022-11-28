package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class PassinggameTest {

    @Test
    public void solve() {
        int A = 10;
        int B = 23;
        int[] C = {86, 63, 60, 0, 47, 0, 99, 9, 0, 0};
        Passinggame p = new Passinggame();
        int ans = p.solve(A, B, C);
        int expected = 63;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int A = 1;
        int B = 1;
        int[] C = {2};
        Passinggame p = new Passinggame();
        int ans = p.solve(A, B, C);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }
}