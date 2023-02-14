package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class PrimeSumTest {

    @Test
    public void solve() {
        PrimeSum1 p = new PrimeSum1();
        int A = 4;
        int[] ans = p.primesum(A);
        int[] expected = {2, 2};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {
        PrimeSum1 p = new PrimeSum1();
        int A = 78;
        int[] ans = p.primesum(A);
        int[] expected = {5, 73};
        Assert.assertArrayEquals(expected, ans);
    }

}