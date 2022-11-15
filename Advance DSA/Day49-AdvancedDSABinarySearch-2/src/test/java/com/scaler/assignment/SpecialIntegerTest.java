package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class SpecialIntegerTest {

    @Test
    public void solve() {
        int[] A = {1, 2, 3, 4, 5};
        int B = 10;
        SpecialInteger s = new SpecialInteger();
        int ans = s.solve(A, B);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {5, 17, 100, 11};
        int B = 130;
        SpecialInteger s = new SpecialInteger();
        int ans = s.solve(A, B);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }
}