package com.scaler.assignment;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReversetheArrayTest {

    @Test
    public void solve() {
//        A = [1,2,3,2,1]

        ReversetheArray r = new ReversetheArray();
        int[] A = {1, 2, 3, 2, 1};
        int[] ans = r.solve(A);
        int []expected={1,2,3,2,1};

        assertEquals("FAILED",Arrays.toString(expected),Arrays.toString(ans));

    }

    @Test
    public void solve1() {
//        A = [1,1,10]

        ReversetheArray r = new ReversetheArray();
        int[] A = {1,1,10};
        int[] ans = r.solve(A);
        int []expected={10,1,1};

        assertEquals("FAILED",Arrays.toString(expected),Arrays.toString(ans));

    }
}