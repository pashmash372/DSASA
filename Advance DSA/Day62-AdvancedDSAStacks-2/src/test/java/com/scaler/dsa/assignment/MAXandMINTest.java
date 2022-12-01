package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class MAXandMINTest {

    @Test
    public void solve() {
        int[] A = {1};
        MAXandMIN m = new MAXandMIN();
        int ans = m.solve(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {4, 7, 3, 8};
        MAXandMIN m = new MAXandMIN();
        int ans = m.solve(A);
        int expected = 26;
        Assert.assertEquals(expected, ans);
    }
}