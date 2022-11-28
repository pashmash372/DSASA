package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class ChecktwobracketexpressionsTest {

    @Test
    public void solve() {
        String A = "-(a+b+c)";
        String B = "-a-b-c";
        Checktwobracketexpressions c = new Checktwobracketexpressions();
        int ans = c.solve(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String A = "a-b-(c-d)";
        String B = "a-b-c-d";
        Checktwobracketexpressions c = new Checktwobracketexpressions();
        int ans = c.solve(A, B);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}