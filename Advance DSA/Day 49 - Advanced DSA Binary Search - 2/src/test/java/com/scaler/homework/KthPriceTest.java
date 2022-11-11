package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class KthPriceTest {

    @Test
    public void solve() {
        int[] A = {2, 1, 4, 3, 2};
        int B = 3;
        int expected = 2;
        KthPrice k = new KthPrice();
        int ans = k.solve(A, B);
        Assert.assertEquals(expected, ans);


    }
}