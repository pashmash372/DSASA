package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class SumofminandmaxTest {

    @Test
    public void solve() {
        int[] A = {2, 5, -1, 7, -3, -1, -2};
        int B = 4;
        Sumofminandmax s = new Sumofminandmax();
        int ans = s.solve(A, B);
        int expected = 18;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {2, -1, 3};
        int B = 2;
        Sumofminandmax s = new Sumofminandmax();
        int ans = s.solve(A, B);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }
}