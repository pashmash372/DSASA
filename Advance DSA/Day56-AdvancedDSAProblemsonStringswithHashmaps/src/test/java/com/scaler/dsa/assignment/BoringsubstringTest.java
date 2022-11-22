package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class BoringsubstringTest {

    @Test
    public void solve() {
        String A = "abcd";
        Boringsubstring b = new Boringsubstring();
        int ans = b.solve(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String A = "aab";
        Boringsubstring b = new Boringsubstring();
        int ans = b.solve(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}