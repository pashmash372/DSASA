package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShaggyanddistancesTest {

    @Test
    public void solve() {
        int[] A = {7, 1, 3, 4, 1, 7};
        Shaggyanddistances s = new Shaggyanddistances();
        int ans = s.solve(A);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {1, 1};
        Shaggyanddistances s = new Shaggyanddistances();
        int ans = s.solve(A);
        int expected = 1  ;
        Assert.assertEquals(expected, ans);
    }
}