package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class FoodPacketsDistributionTest {

    @Test
    public void solve() {
        int[] A = {10000, 20000, 30000};
        int B = 6;
        FoodPacketsDistribution f = new FoodPacketsDistribution();
        int ans = f.solve(A, B);
        int expected = 10000;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {1, 1, 1};
        int B = 4;
        FoodPacketsDistribution f = new FoodPacketsDistribution();
        int ans = f.solve(A, B);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}