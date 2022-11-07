package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MaxModTest {

    @Test
    public void solve() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 44, 3));
        int expected = 3;
        MaxMod m = new MaxMod();
        int ans = m.solve(A);
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(2, 6, 4));
        int expected = 4;
        MaxMod m = new MaxMod();
        int ans = m.solve(A);
        Assert.assertEquals(expected, ans);
    }
}