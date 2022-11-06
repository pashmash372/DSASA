package com.scaler.assignement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraywithleastaverageTest {

    @Test
    void solve() {
//        A=[3, 7, 90, 20, 10, 50, 40]
//        B=3

        Subarraywithleastaverage s = new Subarraywithleastaverage();
        int A[]={3, 7, 90, 20, 10, 50, 40};
        int B=3;
        int ans = s.solve(A, B);
        int expected=3;
        assertEquals(expected,ans);
    }
    @Test
    void solve1() {
//        A=[3, 7, 5, 20, -10, 0, 12]
//        B=2

        Subarraywithleastaverage s = new Subarraywithleastaverage();
        int A[]={3, 7, 5, 20, -10, 0, 12};
        int B=2;
        int ans = s.solve(A, B);
        int expected=4;
        assertEquals(expected,ans);
    }
}