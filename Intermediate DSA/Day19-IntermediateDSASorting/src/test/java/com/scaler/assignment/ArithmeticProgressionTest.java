package com.scaler.assignment;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticProgressionTest {

    @Test
    void solve() {
        ArrayList<Integer> A = new ArrayList<>(List.of(3, 5, 1));
        ArithmeticProgression a = new ArithmeticProgression();
        int ans = a.solve(A);
        int expected = 1;
        assertEquals(expected, ans);
    }

    @Test
    void solve1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(2, 4, 1));
        ArithmeticProgression a = new ArithmeticProgression();
        int ans = a.solve(A);
        int expected = 0;
        assertEquals(expected, ans);
    }

}