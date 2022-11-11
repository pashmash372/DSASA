package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class SquareRootofIntegerTest {

    @Test
    public void sqrt() {
        int A = 11;
        int expected = 3;
        SquareRootofInteger s = new SquareRootofInteger();
        int ans = s.sqrt(A);
        Assert.assertEquals(expected, ans);
    }@Test
    public void sqrt1() {
        int A = 9;
        int expected = 3;
        SquareRootofInteger s = new SquareRootofInteger();
        int ans = s.sqrt(A);
        Assert.assertEquals(expected, ans);
    }
}