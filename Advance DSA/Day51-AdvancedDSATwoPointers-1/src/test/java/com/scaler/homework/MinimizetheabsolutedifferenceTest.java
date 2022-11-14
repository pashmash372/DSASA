package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class MinimizetheabsolutedifferenceTest {

    @Test
    public void solve() {
        int[] A = {1, 4, 5, 8, 10};
        int[] B = {6, 9, 15};
        int[] C = {2, 3, 6, 6};
        Minimizetheabsolutedifference m = new Minimizetheabsolutedifference();
        int ans = m.solve(A, B, C);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }
}