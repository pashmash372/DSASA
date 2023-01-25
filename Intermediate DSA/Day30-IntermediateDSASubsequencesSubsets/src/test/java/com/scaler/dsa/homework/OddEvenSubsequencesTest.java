package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class OddEvenSubsequencesTest {

    @Test
    public void solve() {
        OddEvenSubsequences o = new OddEvenSubsequences();
        int[] A = {1, 2, 2, 5, 6};
        int ans = o.solve(A);
        int expected = 4;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        OddEvenSubsequences o = new OddEvenSubsequences();
        int[] A = {2, 2, 2, 2, 2, 2};
        int ans = o.solve(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

}