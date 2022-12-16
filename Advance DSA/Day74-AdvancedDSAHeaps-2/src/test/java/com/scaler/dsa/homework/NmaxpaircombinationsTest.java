package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NmaxpaircombinationsTest {

    @Test
    public void solve() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 4, 2, 3));
        ArrayList<Integer> B = new ArrayList<>(List.of(2, 5, 1, 6));
        Nmaxpaircombinations m = new Nmaxpaircombinations();
        ArrayList<Integer> ans = m.solve(A, B);
        ArrayList<Integer> expected = new ArrayList<>(List.of(10, 9, 9, 8));
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(2, 4, 1, 1));
        ArrayList<Integer> B = new ArrayList<>(List.of(-2, -3, 2, 4));
        Nmaxpaircombinations m = new Nmaxpaircombinations();
        ArrayList<Integer> ans = m.solve(A, B);
        ArrayList<Integer> expected = new ArrayList<>(List.of(8, 6, 6, 5));
        Assert.assertEquals(expected, ans);
    }
}