package com.scaler.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialSubsequencesAGTest {

    @Test
    void solve() {
        String A = "ABCGAG";
        SpecialSubsequencesAG s = new SpecialSubsequencesAG();
        int ans = s.solve(A);
        int expected= 3;
        assertEquals(expected,ans);
    }

    @Test
    void solve1() {
        String A = "GAB";
        SpecialSubsequencesAG s = new SpecialSubsequencesAG();
        int ans = s.solve(A);
        int expected= 0;
        assertEquals(expected,ans);
    }
}