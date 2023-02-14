package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeSubsequencesTest {

    @Test
    public void solve() {
        PrimeSubsequences p = new PrimeSubsequences();
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 3));
        int ans = p.solve(A);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

}