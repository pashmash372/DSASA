package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class CyclicPermutationsTest {

    @Test
    public void solve() {
        String A = "1001";
        String B = "0011";
        CyclicPermutations c = new CyclicPermutations();
        int ans = c.solve(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String A = "111";
        String B = "111";
        CyclicPermutations c = new CyclicPermutations();
        int ans = c.solve(A, B);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve2() {
        String A = "AAACAAAAAC";
        String B = "AAACAAAAAC";
        CyclicPermutations c = new CyclicPermutations();
        int ans = c.solve(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }
}