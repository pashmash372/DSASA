package com.scaler.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodSubarraysEasyTest {

    @Test
    void solve() {
//        A = [1, 2, 3, 4, 5]
//        B = 4

        GoodSubarraysEasy g = new GoodSubarraysEasy();
        int []A={1, 2, 3, 4, 5};
        int B=4;
        int ans = g.solve(A, B);
        int expected=6;
        assertEquals(expected,ans);
    }
    @Test
    void solve1() {
//        A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
//        B = 65

        GoodSubarraysEasy g = new GoodSubarraysEasy();
        int []A={13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int B=65;
        int ans = g.solve(A, B);
        int expected=36;
        assertEquals(expected,ans);
    }
}