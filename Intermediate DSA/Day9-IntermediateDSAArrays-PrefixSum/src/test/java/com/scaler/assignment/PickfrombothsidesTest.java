package com.scaler.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class PickfrombothsidesTest {

    @Test
    public void solve() {

//        A = [5, -2, 3 , 1, 2]
//        B = 3

        int A[]={5, -2, 3 , 1, 2};
        int B=3;
        Pickfrombothsides p = new Pickfrombothsides();
        int ans = p.solve(A, B);
        int expected=8;
        assertEquals(expected,ans);
    }

    @Test
    public void solve1() {

//        A = [1, 2]
//        B = 1

        int A[]={1, 2};
        int B=1;
        Pickfrombothsides p = new Pickfrombothsides();
        int ans = p.solve(A, B);
        int expected=2;
        assertEquals(expected,ans);
    }
}