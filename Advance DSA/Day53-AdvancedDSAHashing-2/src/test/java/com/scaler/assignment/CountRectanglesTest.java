package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class CountRectanglesTest {

    @Test
    public void solve() {
        int[] A = {1, 1, 2, 2};
        int[] B = {1, 2, 1, 2};
        CountRectangles c = new CountRectangles();
        int ans = c.solve(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {1, 1, 2, 2, 3, 3};
        int[] B = {1, 2, 1, 2, 1, 2};
        CountRectangles c = new CountRectangles();
        int ans = c.solve(A, B);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }
}