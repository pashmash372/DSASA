package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LongestConsecutiveSequenceTest {
    @Test
    public void longestConsecutive() {
        ArrayList<Integer> A = new ArrayList<>(List.of(100, 4, 200, 1, 3, 2));
        LongestConsecutiveSequence l = new LongestConsecutiveSequence();
        int ans = l.longestConsecutive(A);
        int expected = 4;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void longestConsecutive1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(2, 1));
        LongestConsecutiveSequence l = new LongestConsecutiveSequence();
        int ans = l.longestConsecutive(A);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }
}