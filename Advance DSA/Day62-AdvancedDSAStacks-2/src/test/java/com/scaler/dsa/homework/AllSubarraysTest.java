package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class AllSubarraysTest {

    @Test
    public void solve() {
        AllSubarrays a = new AllSubarrays();
        int[] A = {3, 10, 5, 25, 2, 8};
        int ans = a.solve(A);
        int expected = 28;
        Assert.assertEquals(expected, ans);
    }
}