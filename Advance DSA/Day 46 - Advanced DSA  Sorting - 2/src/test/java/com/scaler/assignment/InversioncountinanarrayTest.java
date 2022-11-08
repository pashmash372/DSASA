package com.scaler.assignment;

import org.junit.Assert;

public class InversioncountinanarrayTest {

    @org.junit.Test
    public void solve() {
        int[] A = {3, 2, 1};
        Inversioncountinanarray i = new Inversioncountinanarray();
        int ans = i.solve(A);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

    @org.junit.Test
    public void solve1() {
        int[] A = {1, 2, 3};
        Inversioncountinanarray i = new Inversioncountinanarray();
        int ans = i.solve(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }

    @org.junit.Test
    public void solv2() {
        int[] A = {5, 4, 3, 2, 1};
        Inversioncountinanarray i = new Inversioncountinanarray();
        int ans = i.solve(A);
        int expected = 10;
        Assert.assertEquals(expected, ans);
    }

    @org.junit.Test
    public void solv3() {
        int[] A = {1, 5, 2, 8, 3, 4};
        Inversioncountinanarray i = new Inversioncountinanarray();
        int ans = i.solve(A);
        int expected = 5;
        Assert.assertEquals(expected, ans);
    }

    @org.junit.Test
    public void solv4() {
        int[] A = {10,3,8,15,6,12,2,18,7,1};
        Inversioncountinanarray i = new Inversioncountinanarray();
        int ans = i.solve(A);
        int expected = 26;
        Assert.assertEquals(expected, ans);
    }
}