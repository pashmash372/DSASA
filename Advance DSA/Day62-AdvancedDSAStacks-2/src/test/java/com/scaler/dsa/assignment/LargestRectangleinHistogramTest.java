package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class LargestRectangleinHistogramTest {

    @Test
    public void largestRectangleArea() {
        int[] A = {2, 1, 5, 6, 2, 3};
        LargestRectangleinHistogram l = new LargestRectangleinHistogram();
        int ans = l.largestRectangleArea(A);
        int expected = 10;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void largestRectangleArea1() {
        int[] A = {2};
        LargestRectangleinHistogram l = new LargestRectangleinHistogram();
        int ans = l.largestRectangleArea(A);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }
}