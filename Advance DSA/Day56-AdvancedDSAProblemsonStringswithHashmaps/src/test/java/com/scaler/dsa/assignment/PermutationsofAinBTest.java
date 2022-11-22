package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class PermutationsofAinBTest {

    @Test
    public void solve() {
        String A = "abc";
        String B = "abcbacabc";
        PermutationsofAinB p = new PermutationsofAinB();
        int ans = p.solve(A, B);
        int expected = 5;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String A = "aca";
        String B = "acaa";
        PermutationsofAinB p = new PermutationsofAinB();
        int ans = p.solve(A, B);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }
}