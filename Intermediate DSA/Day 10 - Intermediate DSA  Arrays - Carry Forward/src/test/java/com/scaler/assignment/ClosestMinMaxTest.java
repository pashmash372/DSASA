package com.scaler.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClosestMinMaxTest {

    @Test
    void solve() {
//        A = [1, 3]
        int A[]={1, 3};
        ClosestMinMax c = new ClosestMinMax();
        int ans = c.solve(A);
        int expected=2;
        assertEquals(expected,ans);

    }

    @Test
    void solve1() {

        int A[]={2};
        ClosestMinMax c = new ClosestMinMax();
        int ans = c.solve(A);
        int expected=1;
        assertEquals(expected,ans);

    }
}