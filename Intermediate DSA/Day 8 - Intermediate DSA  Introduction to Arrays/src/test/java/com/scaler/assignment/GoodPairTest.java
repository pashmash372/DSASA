package com.scaler.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoodPairTest {

    @Test
    public void solve() {

//        A = [1,2,3,4]
//        B = 7

        int[] A = new int[]{1, 2, 3, 4};
        int B = 7;
        int expected=1;

        GoodPair g  = new GoodPair();
        int ans = g.solve(A, B);
        assertEquals("FAILED",expected,ans);


    }

    @Test
    public void solve1() {

        /*A = [1,2,4]
        B = 4*/


        int[] A = new int[]{1, 2,4};
        int B = 4;
        int expected=0;

        GoodPair g  = new GoodPair();
        int ans = g.solve(A, B);
        assertEquals("FAILED",expected,ans);


    }

    @Test
    public void solve2() {

        /*A = [1,2,2]
B = 4*/


        int[] A = new int[]{1, 2,2};
        int B = 4;
        int expected=1;

        GoodPair g  = new GoodPair();
        int ans = g.solve(A, B);
        assertEquals("FAILED",expected,ans);


    }
}