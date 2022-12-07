package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShortestUniquePrefixTest {

    @Test
    public void solve() {
        ArrayList<String> A = new ArrayList<>(List.of("zebra", "dog", "duck", "dove"));
        ShortestUniquePrefix s = new ShortestUniquePrefix();
        ArrayList<String> ans = s.prefix(A);
        ArrayList<String> expected = new ArrayList<>(List.of("z", "dog", "du", "dov"));
        Assert.assertEquals(expected, ans);
    }
}