package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class TheshipcompanyTest {
    @Test
    public void solve() {
        int A = 4;
        int B = 3;
        int[] C = {2, 1, 1};
        Theshipcompany t = new Theshipcompany();
        int[] ans = t.solve(A, B, C);
        int[] expected = {5, 5};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int A = 4;
        int B = 3;
        int[] C = {2, 2, 2};
        Theshipcompany t = new Theshipcompany();
        int[] ans = t.solve(A, B, C);
        int[] expected = {7, 6};
        Assert.assertArrayEquals(expected, ans);
    }
}