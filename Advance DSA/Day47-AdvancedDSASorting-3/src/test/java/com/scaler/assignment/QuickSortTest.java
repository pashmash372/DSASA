package com.scaler.assignment;

import org.junit.Assert;

public class QuickSortTest {

    @org.junit.Test
    public void solve() {
        int[] A = {1, 4, 10, 2, 1, 5};
        QuickSort q = new QuickSort();
        int[] ans = q.solve(A);
        int[] expected = {1, 1, 2, 4, 5, 10};
        Assert.assertArrayEquals(expected, ans);
    }

    @org.junit.Test
    public void solve1() {
        int[] A = {3, 7, 1};
        QuickSort q = new QuickSort();
        int[] ans = q.solve(A);
        int[] expected = {1, 3, 7};
        Assert.assertArrayEquals(expected, ans);
    }
}