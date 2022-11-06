package com.scaler.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingSubarraysEasyTest {

    @Test
    void solve() {
//        A = [1, 0, 1, 0, 1]
//        B = 1

        int []A={1, 0, 1, 0, 1};
        int B=1;
        AlternatingSubarraysEasy a= new AlternatingSubarraysEasy();
        int[] ans = a.solve(A, B);
        int [] expected= {1, 2, 3};
        assertArrayEquals(expected,ans);
    }
    @Test
    void solve1() {
//        A = [0, 0, 0, 1, 1, 0, 1]
//        B = 0

        int []A={0, 0, 0, 1, 1, 0, 1};
        int B=0;
        AlternatingSubarraysEasy a= new AlternatingSubarraysEasy();
        int[] ans = a.solve(A, B);
        int [] expected= {0, 1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected,ans);
    }
}