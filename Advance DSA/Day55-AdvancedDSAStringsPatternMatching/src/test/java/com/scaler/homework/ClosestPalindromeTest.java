package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class ClosestPalindromeTest {

    @Test
    public void solve() {
        String A = "abbba";
        ClosestPalindrome c = new ClosestPalindrome();
        String ans = c.solve(A);
        String expected = "YES";
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String A = "adaddb";
        ClosestPalindrome c = new ClosestPalindrome();
        String ans = c.solve(A);
        String expected = "NO";
        Assert.assertEquals(expected, ans);
    }
}