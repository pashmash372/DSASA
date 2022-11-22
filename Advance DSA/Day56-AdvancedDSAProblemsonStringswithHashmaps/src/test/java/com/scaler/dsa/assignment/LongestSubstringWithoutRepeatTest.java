package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeat l = new LongestSubstringWithoutRepeat();
        String A = "abcabcbb";
        int ans = l.lengthOfLongestSubstring(A);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void lengthOfLongestSubstring1() {
        LongestSubstringWithoutRepeat l = new LongestSubstringWithoutRepeat();
        String A = "AaaA";
        int ans = l.lengthOfLongestSubstring(A);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }
}