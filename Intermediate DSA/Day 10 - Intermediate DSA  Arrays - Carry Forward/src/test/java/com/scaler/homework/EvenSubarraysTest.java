package com.scaler.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenSubarraysTest {

    @Test
    void solve() {
//        A = [2, 4, 8, 6]
        int []A={2, 4, 8, 6};
        String expected="YES";
        EvenSubarrays e= new EvenSubarrays();
        String ans = e.solve(A);
        assertEquals(expected,ans);
    }

    @Test
    void solve1() {
//        A = [2, 4, 8, 7, 6]
        int []A={2, 4, 8, 7, 6};
        String expected="NO";
        EvenSubarrays e= new EvenSubarrays();
        String ans = e.solve(A);
        assertEquals(expected,ans);
    }
}