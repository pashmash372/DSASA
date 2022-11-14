package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AnotherCountRectanglesTest {

    @Test
    public void solve() {

        int B = 5;
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2));
        AnotherCountRectangles a = new AnotherCountRectangles();
        int ans = a.solve(A, B);
        int expected = 4;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {

        int B = 1;
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2));
        AnotherCountRectangles a = new AnotherCountRectangles();
        int ans = a.solve(A, B);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}