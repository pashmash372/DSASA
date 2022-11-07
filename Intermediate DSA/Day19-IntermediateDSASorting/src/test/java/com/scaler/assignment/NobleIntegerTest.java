package com.scaler.assignment;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NobleIntegerTest {

    @Test
    void solve() {
        ArrayList<Integer> A = new ArrayList<>(List.of(3, 2, 1, 3));
        NobleInteger n = new NobleInteger();
        int ans = n.solve(A);
        int expected=1;
        assertEquals(expected,ans);
    }@Test
    void solve1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 1, 3, 3));
        NobleInteger n = new NobleInteger();
        int ans = n.solve(A);
        int expected=-1;
        assertEquals(expected,ans);
    }
}