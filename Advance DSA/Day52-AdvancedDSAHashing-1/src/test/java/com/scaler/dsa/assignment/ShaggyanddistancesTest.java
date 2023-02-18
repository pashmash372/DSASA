package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class ShaggyanddistancesTest {

    @Test
    public void solve() {
        Shaggyanddistances s = new Shaggyanddistances();
        int[] A = {7, 1, 3, 4, 1, 7};
        int ans = s.solve(A);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

}