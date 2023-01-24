package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class ImplementPowerFunctionTest {

    @Test
    public void solve() {
        ImplementPowerFunction i = new ImplementPowerFunction();
        ImplementPowerFunction.Solution i1 = new ImplementPowerFunction.Solution();
        int x = 2;
        int n = 4;
        int d = 10005;
        int ans = i1.pow(x, n, d);
        int expected = 2;

        Assert.assertEquals(expected, ans);

    }

    @Test
    public void solve1() {
        ImplementPowerFunction i = new ImplementPowerFunction();
        ImplementPowerFunction.Solution i1 = new ImplementPowerFunction.Solution();
        int x = 2;
        int n = 5;
        int d = 10005;
        int ans = i1.pow(x, n, d);
        int expected = 2;

        Assert.assertEquals(expected, ans);

    }

}