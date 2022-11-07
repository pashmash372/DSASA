package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class ChocolateDistributionTest {

    @Test
    public void solve() {
        int[] A = {3, 4, 1, 9, 56, 7, 9, 12};
        int B = 5;
        ChocolateDistribution c = new ChocolateDistribution();
        int ans = c.solve(A, B);
        int expected = 6;
        Assert.assertEquals(expected,ans);
    }
}