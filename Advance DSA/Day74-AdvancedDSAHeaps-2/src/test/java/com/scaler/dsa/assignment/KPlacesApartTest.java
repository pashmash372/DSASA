package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class KPlacesApartTest {

    @Test
    public void solve() {
        int[] A = {1, 40, 2, 3};
        int B = 2;
        KPlacesApart k = new KPlacesApart();
        int[] ans = k.solve(A, B);
        int[] expected = {1, 2, 3, 40};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {2, 1, 17, 10, 21, 95};
        int B = 1;
        KPlacesApart k = new KPlacesApart();
        int[] ans = k.solve(A, B);
        int[] expected = {1, 2, 10, 17, 21, 95};
        Assert.assertArrayEquals(expected, ans);
    }
}