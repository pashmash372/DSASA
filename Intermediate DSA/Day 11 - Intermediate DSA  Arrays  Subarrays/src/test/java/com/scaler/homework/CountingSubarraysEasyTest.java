package com.scaler.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSubarraysEasyTest {

    @Test
    void solve() {

//        A = [2, 5, 6]
//        B = 10

        CountingSubarraysEasy c = new CountingSubarraysEasy();
        int A[]={2, 5, 6};
        int B=10;
        int ans = c.solve(A, B);
        int expected=4;
        assertEquals(expected,ans);
    }

    @Test
    void solve1() {

//        A = [1, 11, 2, 3, 15]
//        B = 10

        CountingSubarraysEasy c = new CountingSubarraysEasy();
        int A[]={1, 11, 2, 3, 15};
        int B=10;
        int ans = c.solve(A, B);
        int expected=4;
        assertEquals(expected,ans);
    }
}