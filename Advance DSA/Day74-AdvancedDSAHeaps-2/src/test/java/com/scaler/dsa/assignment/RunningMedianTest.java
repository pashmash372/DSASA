package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RunningMedianTest {

    @Test
    public void solve() {
        int[] A = {1, 2, 5, 4, 3};
        RunningMedian r = new RunningMedian();
        int[] ans = r.solve(A);
        int[] expected = {1, 1, 2, 2, 3};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve2() {
        int[] A = {11,5,2,3,6,7,81,9};
        RunningMedian r = new RunningMedian();
        int[] ans = r.solve(A);
//        System.out.println(Arrays.toString(ans));
        int[] expected = {11, 5, 5, 3, 5, 5, 6, 6};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {5, 17, 100, 11};
        RunningMedian r = new RunningMedian();
        int[] ans = r.solve(A);
        int[] expected = {5, 5, 17, 11};
        Assert.assertArrayEquals(expected, ans);
    }
}