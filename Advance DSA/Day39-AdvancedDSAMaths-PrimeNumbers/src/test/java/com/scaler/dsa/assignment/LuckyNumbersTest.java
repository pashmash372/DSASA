package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class LuckyNumbersTest {

    @Test
    public void solve() {
        LuckyNumbers1 l = new LuckyNumbers1();
        int A = 8;
        int ans = l.solve(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);

    }

    @Test
    public void solve1() {
        LuckyNumbers1 l = new LuckyNumbers1();
        int A = 523;
        int ans = l.solve(A);
        int expected = 277;
        Assert.assertEquals(expected, ans);

    }

}