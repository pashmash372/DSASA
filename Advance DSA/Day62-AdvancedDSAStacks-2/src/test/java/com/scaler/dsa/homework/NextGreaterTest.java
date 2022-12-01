package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class NextGreaterTest {

    @Test
    public void nextGreater() {
        int[] A = {4, 5, 2, 10};
        NextGreater n = new NextGreater();
        int[] ans = n.nextGreater(A);
        int[] expected = {5, 10, 10, -1};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void nextGreater1() {
        int[] A = {3, 2, 1};
        NextGreater n = new NextGreater();
        int[] ans = n.nextGreater(A);
        int[] expected = {-1, -1, -1};
        Assert.assertArrayEquals(expected, ans);
    }
}