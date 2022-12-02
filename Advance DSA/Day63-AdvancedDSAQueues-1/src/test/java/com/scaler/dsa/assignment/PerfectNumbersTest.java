package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class PerfectNumbersTest {

    @Test
    public void solve() {
        PerfectNumbers p = new PerfectNumbers();
        int A = 2;
        String ans = p.solve(A);
        String expected = "22";
        Assert.assertEquals(expected, ans);
    }


}