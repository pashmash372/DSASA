package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LongestConsecutiveSequenceTest {

    @Test
    public void solve() {
        LongestConsecutiveSequence l = new LongestConsecutiveSequence();
        ArrayList<Integer> A = new ArrayList<>(List.of(100, 4, 200, 1, 3, 2));
        int ans = l.longestConsecutive(A);
        int expected = 4;
        Assert.assertEquals(expected, ans);
    }
}