package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class RatInaMazeTest {

    @Test
    public void solve() {
        RatInaMaze r = new RatInaMaze();
        int[][] A = {{1, 0}, {1, 1}};
        int[][] ans = r.solve(A);
        int[][] expected = {{1, 0}, {1, 1}};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {
        RatInaMaze r = new RatInaMaze();
        int[][] A = {{1, 1, 1}, {1, 0, 1}, {0, 0, 1}};
        int[][] ans = r.solve(A);
        int[][] expected = {{1, 1, 1}, {0, 0, 1}, {0, 0, 1}};
        Assert.assertArrayEquals(expected, ans);
    }

}