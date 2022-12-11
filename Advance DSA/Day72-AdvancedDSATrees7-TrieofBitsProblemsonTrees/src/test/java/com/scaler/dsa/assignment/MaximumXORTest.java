package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class MaximumXORTest {

    @Test
    public void solve() {
        int[] A = {1, 2, 3, 4, 5};
        MaximumXOR m = new MaximumXOR();
        int ans = m.solve(A);
        int expected = 7;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {5, 17, 100, 11};
        MaximumXOR m = new MaximumXOR();
        int ans = m.solve(A);
        int expected = 117;
        Assert.assertEquals(expected, ans);
    }

}