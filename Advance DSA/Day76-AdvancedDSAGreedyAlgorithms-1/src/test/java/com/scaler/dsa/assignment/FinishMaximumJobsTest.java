package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class FinishMaximumJobsTest {

    @Test
    public void solve() {
        int[] A = {1, 5, 7, 1};
        int[] B = {7, 8, 8, 8};
        FinishMaximumJobs f = new FinishMaximumJobs();
        int ans = f.solve(A, B);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }@Test
    public void solve1() {
        int[] A = {3, 2, 6};
        int[] B = {9, 8, 9};
        FinishMaximumJobs f = new FinishMaximumJobs();
        int ans = f.solve(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }
}