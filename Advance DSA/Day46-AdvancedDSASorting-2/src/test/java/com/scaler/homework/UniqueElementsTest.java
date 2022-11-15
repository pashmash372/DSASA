package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class UniqueElementsTest {

    @Test
    public void solve() {
        int[] A = {1, 1, 3};
        UniqueElements u = new UniqueElements();
        int ans = u.solve(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {2, 4, 5};
        UniqueElements u = new UniqueElements();
        int ans = u.solve(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}