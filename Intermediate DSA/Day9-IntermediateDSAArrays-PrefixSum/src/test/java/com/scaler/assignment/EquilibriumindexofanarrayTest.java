package com.scaler.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquilibriumindexofanarrayTest {

    @Test
    public void solve() {
//        A=[-7, 1, 5, 2, -4, 3, 0]
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        Equilibriumindexofanarray e = new Equilibriumindexofanarray();
        int ans = e.solve(A);
        int expected = 3;
        assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
//        A=[1,2,3]
        int[] A = {1, 2, 3};
        Equilibriumindexofanarray e = new Equilibriumindexofanarray();
        int ans = e.solve(A);
        int expected = -1;
        assertEquals(expected, ans);
    }
}