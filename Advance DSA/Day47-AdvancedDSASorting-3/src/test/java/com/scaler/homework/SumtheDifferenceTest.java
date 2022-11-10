package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SumtheDifferenceTest {

    @Test
    public void solve() {
        SumtheDifference s = new SumtheDifference();
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2));
        int expected = 1;
        int ans = s.solve(A);
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        SumtheDifference s = new SumtheDifference();
        ArrayList<Integer> A = new ArrayList<>(List.of(1));
        int expected = 0;
        int ans = s.solve(A);
        Assert.assertEquals(expected, ans);
    }
}