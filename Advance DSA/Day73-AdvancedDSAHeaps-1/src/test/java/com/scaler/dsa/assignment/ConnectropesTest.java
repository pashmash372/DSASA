package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class ConnectropesTest {

    @Test
    public void solve() {
        int[] A = {1, 2, 3, 4, 5};
        Connectropes c = new Connectropes();
        int ans = c.solve(A);
        int expected = 33;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {5, 17, 100, 11};
        Connectropes c = new Connectropes();
        int ans = c.solve(A);
        int expected = 182;
        Assert.assertEquals(expected, ans);
    }
}