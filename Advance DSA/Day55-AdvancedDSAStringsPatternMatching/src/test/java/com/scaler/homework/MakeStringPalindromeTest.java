package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class MakeStringPalindromeTest {

    @Test
    public void solve() {
        String A = "abc";
        MakeStringPalindrome m = new MakeStringPalindrome();
        int ans = m.solve(A);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String A = "bb";
        MakeStringPalindrome m = new MakeStringPalindrome();
        int ans = m.solve(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}