package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class RotatedSortedArraySearchTest {

    @Test
    public void search() {
        int[] A = {4, 5, 6, 7, 0, 1, 2, 3};
        int B = 4;
        RotatedSortedArraySearch r = new RotatedSortedArraySearch();
        int ans = r.search(A, B);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}