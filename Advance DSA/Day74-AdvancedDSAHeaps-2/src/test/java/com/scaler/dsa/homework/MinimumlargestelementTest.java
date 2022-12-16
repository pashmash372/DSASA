package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class MinimumlargestelementTest {

    @Test
    public void solve() {
        int[] A = {1, 2, 3, 4};
        int B = 3;
        Minimumlargestelement m = new Minimumlargestelement();
        int ans = m.solve(A, B);
        int expected = 4;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {5, 1, 4, 2};
        int B = 5;
        Minimumlargestelement m = new Minimumlargestelement();
        int ans = m.solve(A, B);
        int expected = 5;
        Assert.assertEquals(expected, ans);
    }
}