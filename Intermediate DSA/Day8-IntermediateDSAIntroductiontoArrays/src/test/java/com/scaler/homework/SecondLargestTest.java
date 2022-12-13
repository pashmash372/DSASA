package com.scaler.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecondLargestTest {

    @Test
    public void solve() {

        int []A = {2, 1, 2};
        SecondLargest s = new SecondLargest();
        int expected=1;
        int ans = s.solve(A);
        assertEquals("FAILED",ans,expected);
    }

    @Test
    public void solve1() {

        int []A = {2};
        SecondLargest s = new SecondLargest();
        int expected=-1;
        int ans = s.solve(A);
        assertEquals("FAILED",ans,expected);
    }
}