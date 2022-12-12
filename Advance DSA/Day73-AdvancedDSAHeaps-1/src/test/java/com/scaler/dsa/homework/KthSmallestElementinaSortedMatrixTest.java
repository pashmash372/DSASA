package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class KthSmallestElementinaSortedMatrixTest {

    @Test
    public void solve() {
        int[][] A = {{9, 11, 15}, {10, 15, 17}};
        int B = 6;
        KthSmallestElementinaSortedMatrix k = new KthSmallestElementinaSortedMatrix();
        int ans = k.solve(A, B);
        int expected = 17;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[][] A = {{5, 9, 11}, {9, 11, 13}, {10, 12, 15}, {13, 14, 16}, {16, 20, 21}};
        int B = 12;
        KthSmallestElementinaSortedMatrix k = new KthSmallestElementinaSortedMatrix();
        int ans = k.solve(A, B);
        int expected = 16;
        Assert.assertEquals(expected, ans);
    }
}