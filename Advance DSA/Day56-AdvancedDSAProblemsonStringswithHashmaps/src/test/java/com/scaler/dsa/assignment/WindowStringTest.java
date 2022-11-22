package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class WindowStringTest {

    @Test
    public void minWindow() {
        String A = "ADOBECODEBANC";
        String B = "ABC";
        WindowString w = new WindowString();
        String ans = w.minWindow(A, B);
        String expected = "BANC";
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void minWindow1() {
        String A = "Aa91b";
        String B = "ab";
        WindowString w = new WindowString();
        String ans = w.minWindow(A, B);
        String expected = "a91b";
        Assert.assertEquals(expected, ans);
    }
}