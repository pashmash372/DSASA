package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Unique2DpointsTest {

    @Test
    public void solve() {
        int[][] A = {{5, 6}, {2, 8}, {-1, -1}, {2, -3}, {2, 8}, {7, 7}, {2, -3}};
        int expected = 5;
        Unique2Dpoints u = new Unique2Dpoints();
        int ans = u.solve(A);
        Assert.assertEquals(expected, ans);
    }
}