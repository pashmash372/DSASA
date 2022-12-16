package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class ShortestUniquePrefixTest {

    @Test
    public void solve() {
        String[] A = {"zebra", "dog", "duck", "dove"};
        ShortestUniquePrefix s = new ShortestUniquePrefix();
        String[] ans = s.prefix(A);
        String[] expected = {"z", "dog", "du", "dov"};
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String[] A = {"apple", "ball", "cat"};
        ShortestUniquePrefix s = new ShortestUniquePrefix();
        String[] ans = s.prefix(A);
        String[] expected = {"a", "b", "c"};
        Assert.assertEquals(expected, ans);
    }
}