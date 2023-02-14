package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class ComputenCrmTest {

    @Test
    public void solve() {
        ComputenCrm c = new ComputenCrm();
        int A = 5;
        int B = 2;
        int C = 13;
        int ans = c.solve(A, B, C);
        int expected = 10;
        Assert.assertEquals(expected, ans);
    }
}