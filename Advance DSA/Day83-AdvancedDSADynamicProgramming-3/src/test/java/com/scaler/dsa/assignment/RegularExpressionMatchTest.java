package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionMatchTest {

    @Test
    public void solve() {
        RegularExpressionMatch r = new RegularExpressionMatch();
        String A = "aaa";
        String B = "a*";
        int ans = r.isMatch(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        RegularExpressionMatch r = new RegularExpressionMatch();
        String A = "acz";
        String B = "a?a";
        int ans = r.isMatch(A, B);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve2() {
        RegularExpressionMatch1 r = new RegularExpressionMatch1();
        String A = "aaa";
        String B = "a*";
        int ans = r.isMatch(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve3() {
        RegularExpressionMatch1 r = new RegularExpressionMatch1();
        String A = "acz";
        String B = "a?a";
        int ans = r.isMatch(A, B);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}