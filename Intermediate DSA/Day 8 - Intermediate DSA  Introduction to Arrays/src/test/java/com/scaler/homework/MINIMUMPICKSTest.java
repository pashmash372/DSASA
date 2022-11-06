package com.scaler.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MINIMUMPICKSTest {

    @Test
    public void solve() {
        int[] A = {0, 2, 9};
        MINIMUMPICKS m = new MINIMUMPICKS();
        int expected=-7;
        int ans = m.solve(A);
        assertEquals("FAILED",ans,expected);

    }

    @Test
    public void solve1() {
        int[] A = {5, 17, 100, 1};
        MINIMUMPICKS m = new MINIMUMPICKS();
        int expected=99;
        int ans = m.solve(A);
        assertEquals("FAILED",ans,expected);

    }
}