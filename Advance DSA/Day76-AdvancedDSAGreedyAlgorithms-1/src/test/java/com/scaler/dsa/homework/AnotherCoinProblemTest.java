package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class AnotherCoinProblemTest {

    @Test
    public void solve() {
        int A = 47;
        AnotherCoinProblem a = new AnotherCoinProblem();
        int ans = a.solve(A);
        int expected = 7;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int A = 9;
        AnotherCoinProblem a = new AnotherCoinProblem();
        int ans = a.solve(A);
        int expected = 5;
        Assert.assertEquals(expected, ans);
    }

}