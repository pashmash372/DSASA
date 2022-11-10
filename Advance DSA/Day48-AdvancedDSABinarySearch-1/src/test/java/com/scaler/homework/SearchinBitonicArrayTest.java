package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class SearchinBitonicArrayTest {

    @Test
    public void solve() {
        SearchinBitonicArray s = new SearchinBitonicArray();
        int[] A = {3, 9, 10, 20, 17, 5, 1};
        int B = 20;
        int ans = s.solve(A, B);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        SearchinBitonicArray s = new SearchinBitonicArray();
        int[] A = {5, 6, 7, 8, 9, 10, 3, 2, 1};
        int B = 30;
        int ans = s.solve(A, B);
        int expected = -1;
        Assert.assertEquals(expected, ans);
    }
}