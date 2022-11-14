package com.scaler.assignment;

import com.scaler.homework.Array3Pointers;
import org.junit.Assert;
import org.junit.Test;

public class Array3PointersTest {

    @Test
    public void minimize() {
        int[] A = {1, 4, 10};
        int[] B = {2, 15, 20};
        int[] C = {10, 12};
        Array3Pointers a = new Array3Pointers();
        int ans = a.minimize(A, B, C);
        int expected = 5;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void minimize1() {
        int[] A = {3, 5, 6};
        int[] B = {2};
        int[] C = {3, 4};
        Array3Pointers a = new Array3Pointers();
        int ans = a.minimize(A, B, C);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }
}