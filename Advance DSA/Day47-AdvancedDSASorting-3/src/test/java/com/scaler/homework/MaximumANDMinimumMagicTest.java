package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MaximumANDMinimumMagicTest {

    @Test
    public void solve() {
        ArrayList<Integer> A = new ArrayList<>(List.of(3, 11, -1, 5));
        ArrayList<Integer> expected = new ArrayList<>(List.of(14, 10));
        MaximumANDMinimumMagic m = new MaximumANDMinimumMagic();
        ArrayList<Integer> ans = m.solve(A);
        Assert.assertTrue(expected.equals(ans));
    }

    @Test
    public void solve1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(2, 2));
        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 0));
        MaximumANDMinimumMagic m = new MaximumANDMinimumMagic();
        ArrayList<Integer> ans = m.solve(A);
        Assert.assertTrue(expected.equals(ans));
    }
}