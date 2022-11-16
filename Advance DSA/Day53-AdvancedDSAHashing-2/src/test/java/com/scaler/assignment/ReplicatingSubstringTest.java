package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class ReplicatingSubstringTest {

    @Test
    public void solve() {
        int A = 2;
        String B = "bbaabb";
        ReplicatingSubstring r = new ReplicatingSubstring();
        int ans = r.solve(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int A = 1;
        String B = "bc";
        ReplicatingSubstring r = new ReplicatingSubstring();
        int ans = r.solve(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }
}