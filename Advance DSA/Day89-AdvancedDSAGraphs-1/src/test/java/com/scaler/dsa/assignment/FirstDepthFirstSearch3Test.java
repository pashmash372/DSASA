package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class FirstDepthFirstSearch3Test {

    @Test
    public void solve() {
        FirstDepthFirstSearch3 f = new FirstDepthFirstSearch3();
        int[] A = {1, 1, 2};
        int B = 1;
        int C = 2;
        int ans = f.solve(A, B, C);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        FirstDepthFirstSearch3 f = new FirstDepthFirstSearch3();
        int[] A = {1, 1, 2};
        int B = 2;
        int C = 1;
        int ans = f.solve(A, B, C);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

}