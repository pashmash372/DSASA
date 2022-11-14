package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class PairswithgivensumIITest {

    @Test
    public void solve() {
        int[] A = {1, 1, 1};
        int B = 2;
        PairswithgivensumII p = new PairswithgivensumII();
        int ans = p.solve(A, B);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {1,  1};
        int B = 2;
        PairswithgivensumII p = new PairswithgivensumII();
        int ans = p.solve(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }
}