package com.scaler.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimetoequalityTest {

    @Test
    public void solve() {

//        A = [2, 4, 1, 3, 2]
        int[] A = {2, 4, 1, 3, 2};
        int expected = 8;
        Timetoequality t= new Timetoequality();
        int ans = t.solve(A);
        assertEquals(expected, ans);
    }
}