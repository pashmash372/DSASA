package com.scaler.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthSymbolTest {

    @Test
    public void solve() {
        int A = 2, B = 1;
        KthSymbol k = new KthSymbol();
        int ans = k.solve(A, B);
        int expected = 0;
        assertEquals(expected, ans);
    }
    @Test
    public void solve1() {
        int A = 2, B = 2;
        KthSymbol k = new KthSymbol();
        int ans = k.solve(A, B);
        int expected = 1;
        assertEquals(expected, ans);
    }
}