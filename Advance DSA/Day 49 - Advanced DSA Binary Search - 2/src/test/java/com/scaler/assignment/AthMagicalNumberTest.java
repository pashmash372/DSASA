package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class AthMagicalNumberTest {

    @Test
    public void solve() {
        int A = 1, B = 2, C = 3;
        AthMagicalNumber a = new AthMagicalNumber();
        int ans = a.solve(A, B, C);
        int expected = 2;
        Assert.assertEquals(expected, ans);

    }

    @Test
    public void solve1() {
        int A = 4, B = 2, C = 3;
        AthMagicalNumber a = new AthMagicalNumber();
        int ans = a.solve(A, B, C);
        int expected = 6;
        Assert.assertEquals(expected, ans);

    }
}