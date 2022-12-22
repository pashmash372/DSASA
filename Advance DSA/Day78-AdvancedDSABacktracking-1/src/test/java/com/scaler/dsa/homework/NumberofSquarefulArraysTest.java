package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberofSquarefulArraysTest {

    @Test
    public void solve() {
        NumberofSquarefulArrays n = new NumberofSquarefulArrays();
        int[] A = {2, 2, 2};
        int ans = n.solve(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        NumberofSquarefulArrays n = new NumberofSquarefulArrays();
        int[] A = {1, 17, 8};
        int ans = n.solve(A);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve2() {
        NumberofSquarefulArrays1 n = new NumberofSquarefulArrays1();
        ArrayList<Integer> A = new ArrayList<>(List.of(2, 2, 2));
        int ans = n.solve(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve3() {
        NumberofSquarefulArrays1 n = new NumberofSquarefulArrays1();
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 17, 8));
        int ans = n.solve(A);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }
}