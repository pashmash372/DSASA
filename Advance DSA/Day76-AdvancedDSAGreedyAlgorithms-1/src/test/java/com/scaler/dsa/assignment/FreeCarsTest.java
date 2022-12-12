package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class FreeCarsTest {

    @Test
    public void solve() {
        int[] A = {1, 3, 2, 3, 3};
        int[] B = {5, 6, 1, 3, 9};
        FreeCars f = new FreeCars();
        int ans = f.solve(A, B);
        int expected = 20;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {3, 8, 7, 5};
        int[] B = {3, 1, 7, 19};
        FreeCars f = new FreeCars();
        int ans = f.solve(A, B);
        int expected = 30;
        Assert.assertEquals(expected, ans);
    }

}