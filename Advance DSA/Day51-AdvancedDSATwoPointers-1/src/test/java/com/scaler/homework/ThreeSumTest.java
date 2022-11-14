package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class ThreeSumTest {

    @Test
    public void threeSumClosest() {
        int[] A = {-1, 2, 1, -4};
        int B = 1;
        ThreeSum t = new ThreeSum();
        int ans = t.threeSumClosest(A, B);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void threeSumClosest1() {
        int[] A = {1, 2, 3};
        int B = 6;
        ThreeSum t = new ThreeSum();
        int ans = t.threeSumClosest(A, B);
        int expected = 6;
        Assert.assertEquals(expected, ans);
    }
}