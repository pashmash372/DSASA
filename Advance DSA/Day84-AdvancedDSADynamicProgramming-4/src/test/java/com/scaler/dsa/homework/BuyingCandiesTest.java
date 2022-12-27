package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class BuyingCandiesTest {

    @Test
    public void solve() {
        int[] A = {1, 2, 3};
        int[] B = {2, 2, 10};
        int[] C = {2, 3, 9};
        int D = 8;
        BuyingCandies b = new BuyingCandies();
        int ans = b.solve(A, B, C, D);
        int expected = 10;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {2};
        int[] B = {5};
        int[] C = {10};
        int D = 99;
        BuyingCandies b = new BuyingCandies();
        int ans = b.solve(A, B, C, D);
        int expected = 90;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve2() {
        int[] A = {1, 2, 3};
        int[] B = {2, 2, 10};
        int[] C = {2, 3, 9};
        int D = 8;
        BuyingCandies1 b = new BuyingCandies1();
        int ans = b.solve(A, B, C, D);
        int expected = 10;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve3() {
        int[] A = {2};
        int[] B = {5};
        int[] C = {10};
        int D = 99;
        BuyingCandies1 b = new BuyingCandies1();
        int ans = b.solve(A, B, C, D);
        int expected = 90;
        Assert.assertEquals(expected, ans);
    }

}