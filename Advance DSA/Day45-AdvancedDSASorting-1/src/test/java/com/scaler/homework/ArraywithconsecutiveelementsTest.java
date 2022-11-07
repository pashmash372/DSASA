package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArraywithconsecutiveelementsTest {

    @Test
    public void solve() {
        ArrayList<Integer> A = new ArrayList<>(List.of(3, 2, 1, 4, 5));
        Arraywithconsecutiveelements a = new Arraywithconsecutiveelements();
        int ans = a.solve(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }@Test
    public void solve1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 3, 2, 5));
        Arraywithconsecutiveelements a = new Arraywithconsecutiveelements();
        int ans = a.solve(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}