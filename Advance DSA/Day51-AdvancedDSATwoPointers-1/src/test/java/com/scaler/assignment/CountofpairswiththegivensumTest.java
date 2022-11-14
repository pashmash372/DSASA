package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class CountofpairswiththegivensumTest {

    @Test
    public void solve() {
        int[] A = {1, 2, 3, 4, 5};
        int B = 5;
        int expected = 2;
        Countofpairswiththegivensum c = new Countofpairswiththegivensum();
        int ans = c.solve(A, B);
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {5, 10, 20, 100, 105};
        int B = 110;
        int expected = 2;
        Countofpairswiththegivensum c = new Countofpairswiththegivensum();
        int ans = c.solve(A, B);
        Assert.assertEquals(expected, ans);
    }
}