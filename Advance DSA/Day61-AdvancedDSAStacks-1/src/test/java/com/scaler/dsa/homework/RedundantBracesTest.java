package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class RedundantBracesTest {

    @Test
    public void braces() {
        String A = "((a+b))";
        RedundantBraces r = new RedundantBraces();
        int ans = r.braces(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void braces1() {
        String A = "(a+(a+b))";
        RedundantBraces r = new RedundantBraces();
        int ans = r.braces(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}