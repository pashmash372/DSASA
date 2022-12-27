package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class Knapsack01Test {

    @Test
    public void solve() {
        int[] A = {60, 100, 120};
        int[] B = {10, 20, 30};
        int C = 50;
        Knapsack01 k = new Knapsack01();
        int ans = k.solve(A, B, C);
        int expected = 220;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {10, 20, 30, 40};
        int[] B = {12, 13, 15, 19};
        int C = 10;
        Knapsack01 k = new Knapsack01();
        int ans = k.solve(A, B, C);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }


}