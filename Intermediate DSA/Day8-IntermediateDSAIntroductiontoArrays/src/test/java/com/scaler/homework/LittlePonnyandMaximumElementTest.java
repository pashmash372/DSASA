package com.scaler.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class LittlePonnyandMaximumElementTest {

    @Test
    public void solve() {
        int[] A = {2, 4, 3, 1, 5};
        int B = 3;
        int expected = 2;

        LittlePonnyandMaximumElement l = new LittlePonnyandMaximumElement();
        int ans = l.solve(A, B);
        assertEquals("FALSE", ans, expected);
    }

    @Test
    public void solve1() {

        int[] A = {1, 4, 2};
        int B = 3;
        int expected = -1;

        LittlePonnyandMaximumElement l = new LittlePonnyandMaximumElement();
        int ans = l.solve(A, B);
        assertEquals("FALSE", ans, expected);
    }
}