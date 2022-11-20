package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class SmallestPrefixStringTest {

    @Test
    public void smallestPrefix() {
        String A = "abba";
        String B = "cdd";
        SmallestPrefixString s = new SmallestPrefixString();
        String ans = s.smallestPrefix(A, B);
        String expected = "abbac";
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void smallestPrefix1() {
        String A = "acd";
        String B = "bay";
        SmallestPrefixString s = new SmallestPrefixString();
        String ans = s.smallestPrefix(A, B);
        String expected = "ab";
        Assert.assertEquals(expected, ans);
    }
}