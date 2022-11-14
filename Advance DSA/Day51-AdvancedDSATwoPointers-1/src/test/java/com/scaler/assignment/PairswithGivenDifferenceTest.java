package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PairswithGivenDifferenceTest {

    @Test
    public void solve() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 5, 3, 4, 2));
        int B = 3;
        PairswithGivenDifference p = new PairswithGivenDifference();
        int ans = p.solve(A, B);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(8, 12, 16, 4, 0, 20));
        int B = 4;
        PairswithGivenDifference p = new PairswithGivenDifference();
        int ans = p.solve(A, B);
        int expected = 5;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve2() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 1, 1, 2, 2));
        int B = 0;
        PairswithGivenDifference p = new PairswithGivenDifference();
        int ans = p.solve(A, B);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }
}