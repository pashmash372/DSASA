package com.scaler.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpecialIndexTest {

    @Test
    public void solve() {
//        A=[2, 1, 6, 4]
        int[] A = {2, 1, 6, 4};
        SpecialIndex s = new SpecialIndex();
        int ans = s.solve(A);
        int expected = 1;
        assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
//        A=[1, 1, 1]
        int A[] = {1, 1, 1};
        SpecialIndex s = new SpecialIndex();
        int ans = s.solve(A);
        int expected = 3;
        assertEquals(expected, ans);
    }
}