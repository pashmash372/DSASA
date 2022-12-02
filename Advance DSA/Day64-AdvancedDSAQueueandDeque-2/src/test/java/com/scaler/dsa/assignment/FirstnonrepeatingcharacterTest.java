package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class FirstnonrepeatingcharacterTest {

    @Test
    public void solve() {
        String A = "abadbc";
        Firstnonrepeatingcharacter f = new Firstnonrepeatingcharacter();
        String ans = f.solve(A);
        String expected = "aabbdd";
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String A = "abcabc";
        Firstnonrepeatingcharacter f = new Firstnonrepeatingcharacter();
        String ans = f.solve(A);
        String expected = "aaabc#";
        Assert.assertEquals(expected, ans);
    }
}