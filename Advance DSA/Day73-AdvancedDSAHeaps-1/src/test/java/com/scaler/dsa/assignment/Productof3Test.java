package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class Productof3Test {

    @Test
    public void solve() {
        int[] A = {1, 2, 3, 4, 5};
        Productof3 p = new Productof3();
        int[] ans = p.solve(A);
        int[] expected = {-1, -1, 6, 24, 60};
        Assert.assertArrayEquals(expected, ans);
    } @Test
    public void solve1() {
        int[] A = {10, 2, 13, 4};
        Productof3 p = new Productof3();
        int[] ans = p.solve(A);
        int[] expected = {-1, -1, 260, 520};
        Assert.assertArrayEquals(expected, ans);
    }
}