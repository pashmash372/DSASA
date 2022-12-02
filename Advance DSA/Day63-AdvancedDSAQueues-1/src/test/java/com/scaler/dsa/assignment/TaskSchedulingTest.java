package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class TaskSchedulingTest {

    @Test
    public void solve() {
        int[] A = {2, 3, 1, 5, 4};
        int[] B = {1, 3, 5, 4, 2};
        TaskScheduling t = new TaskScheduling();
        int ans = t.solve(A, B);
        int expected = 10;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {1};
        int[] B = {1};
        TaskScheduling t = new TaskScheduling();
        int ans = t.solve(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }
}