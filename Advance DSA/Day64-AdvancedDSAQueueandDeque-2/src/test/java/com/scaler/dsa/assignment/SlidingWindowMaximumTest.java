package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximumTest {

    @Test
    public void slidingMaximum() {
        List<Integer> A = List.of(1, 3, -1, -3, 5, 3, 6, 7);
        int B = 3;
        SlidingWindowMaximum s = new SlidingWindowMaximum();
        ArrayList<Integer> ans = s.slidingMaximum(A, B);
        ArrayList<Integer> expected = new ArrayList<>(List.of(3, 3, 5, 5, 6, 7));
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void slidingMaximum1() {
        List<Integer> A = List.of(1, 2, 3, 4, 2, 7, 1, 3, 6);
        int B = 6;
        SlidingWindowMaximum s = new SlidingWindowMaximum();
        ArrayList<Integer> ans = s.slidingMaximum(A, B);
        ArrayList<Integer> expected = new ArrayList<>(List.of(7, 7, 7, 7));
        Assert.assertEquals(expected, ans);
    }
}