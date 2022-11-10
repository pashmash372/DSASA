package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class CeilinginasortedarrayTest {

    @Test
    public void solve() {
        int A = 5;
        int[] B = {2, 5, 6, 9, 18};
        int C = 7;
        Ceilinginasortedarray c = new Ceilinginasortedarray();
        int ans = c.solve(A, B, C);
        int expected = 9;
        Assert.assertEquals(expected, ans);
    }
}