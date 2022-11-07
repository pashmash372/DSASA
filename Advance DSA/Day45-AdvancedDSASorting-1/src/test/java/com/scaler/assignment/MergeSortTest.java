package com.scaler.assignment;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class MergeSortTest {

    @Test
    public void solve() {
        int[] A = {1, 4, 10, 2, 1, 5};
        int[] expected = {1, 1, 2, 4, 5, 10};
        MergeSort m = new MergeSort();
        int[] ans = m.solve(A);
        assertArrayEquals(expected,ans);
    }@Test
    public void solve1() {
        int[] A = {3, 7, 1};
        int[] expected = {1, 3, 7};
        MergeSort m = new MergeSort();
        int[] ans = m.solve(A);
        assertArrayEquals(expected,ans);
    }
}