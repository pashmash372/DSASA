package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class SortstackusinganotherstackTest {

    @Test
    public void solve() {
        int[] A = {5, 4, 3, 2, 1};
        Sortstackusinganotherstack s = new Sortstackusinganotherstack();
        int[] ans = s.solve(A);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {5, 17, 100, 11};
        Sortstackusinganotherstack s = new Sortstackusinganotherstack();
        int[] ans = s.solve(A);
        int[] expected = {5, 11, 17, 100};
        Assert.assertArrayEquals(expected, ans);
    }
}