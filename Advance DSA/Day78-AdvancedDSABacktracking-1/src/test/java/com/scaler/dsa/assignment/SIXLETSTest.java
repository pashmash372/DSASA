package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SIXLETSTest {

    @Test
    public void solve() {
        SIXLETS s = new SIXLETS();
        int[] A = {1, 2, 8};
        int B = 2;
        int ans = s.solve(A, B);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        SIXLETS s = new SIXLETS();
        int[] A = {5, 17, 1000, 11};
        int B = 4;
        int ans = s.solve(A, B);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve2() {
        SIXLETS1 s = new SIXLETS1();
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 8));
        int B = 2;
        int ans = s.solve(A, B);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve3() {
        SIXLETS1 s = new SIXLETS1();
        ArrayList<Integer> A = new ArrayList<>(List.of(5, 17, 1000, 11));
        int B = 4;
        int ans = s.solve(A, B);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}