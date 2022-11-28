package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class BalancedParanthesisTest {

    @Test
    public void solve() {
        String A = "{([])}";
        BalancedParanthesis b = new BalancedParanthesis();
        int ans = b.solve(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String A = "(){";
        BalancedParanthesis b = new BalancedParanthesis();
        int ans = b.solve(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    } @Test
    public void solve2() {
        String A = "()[]";
        BalancedParanthesis b = new BalancedParanthesis();
        int ans = b.solve(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }
}