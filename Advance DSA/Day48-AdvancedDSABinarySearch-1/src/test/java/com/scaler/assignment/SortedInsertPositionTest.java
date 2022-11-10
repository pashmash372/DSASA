package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class SortedInsertPositionTest {

    @Test
    public void searchInsert() {
        int[] A = {1, 3, 5, 6};
        int B = 5;
        int expected = 2;
        SortedInsertPosition s = new SortedInsertPosition();
        int ans = s.searchInsert(A, B);
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void searchInsert1() {
        int[] A = {1};
        int B = 1;
        int expected = 0;
        SortedInsertPosition s = new SortedInsertPosition();
        int ans = s.searchInsert(A, B);
        Assert.assertEquals(expected, ans);
    }
}