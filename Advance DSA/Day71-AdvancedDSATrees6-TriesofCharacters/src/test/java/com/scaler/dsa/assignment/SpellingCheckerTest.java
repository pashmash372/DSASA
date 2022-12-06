package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class SpellingCheckerTest {

    @Test
    public void solve() {
        String[] A = {"hat", "cat", "rat"};
        String[] B = {"cat", "ball"};
        SpellingChecker s = new SpellingChecker();
        int[] ans = s.solve(A, B);
        int[] expected = {1, 0};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String[] A = {"tape", "bcci"};
        String[] B = {"table", "cci"};
        SpellingChecker s = new SpellingChecker();
        int[] ans = s.solve(A, B);
        int[] expected = {0, 0};
        Assert.assertArrayEquals(expected, ans);
    }
}