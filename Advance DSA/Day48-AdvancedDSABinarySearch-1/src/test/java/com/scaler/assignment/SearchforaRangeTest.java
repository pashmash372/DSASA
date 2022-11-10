package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class SearchforaRangeTest {

    @Test
    public void searchRange() {
        SearchforaRange s = new SearchforaRange();
        int[] A = {5, 7, 7, 8, 8, 10};
        int B = 8;
        int[] ans = s.searchRange(A, B);
        int[] expected = {3, 4};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void searchRange1() {
        SearchforaRange s = new SearchforaRange();
        int[] A = {5, 17, 100, 111};
        int B = 3;
        int[] ans = s.searchRange(A, B);
        int[] expected = {-1, -1};
        Assert.assertArrayEquals(expected, ans);
    }
}