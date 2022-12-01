package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class NearestSmallerElementTest {


    @Test
    public void prevSmaller() {
        NearestSmallerElement n = new NearestSmallerElement();
        int[] A = {4, 5, 2, 10, 8};
        int[] ans = n.prevSmaller(A);
        int[] expected = {-1, 4, -1, 2, 2};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void prevSmaller1() {
        NearestSmallerElement n = new NearestSmallerElement();
        int[] A = {3, 2, 1};
        int[] ans = n.prevSmaller(A);
        int[] expected = {-1, -1, -1};
        Assert.assertArrayEquals(expected, ans);
    }
}