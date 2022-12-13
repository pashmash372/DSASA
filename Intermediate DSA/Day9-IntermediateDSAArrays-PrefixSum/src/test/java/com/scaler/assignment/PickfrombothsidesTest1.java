package com.scaler.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PickfrombothsidesTest1 {


    @Test
    public void solve() {

//        A = [5, -2, 3 , 1, 2]
//        B = 3

        int[] A = {5, -2, 3, 1, 2};
        int B = 3;
        Pickfrombothsides.Pickfrombothsides1 p = new Pickfrombothsides.Pickfrombothsides1();
        int ans = p.solve(A, B);
        int expected = 8;
        assertEquals(expected, ans);
    }

    @Test
    public void solve1() {

//        A = [1, 2]
//        B = 1

        int[] A = {1, 2};
        int B = 1;
        Pickfrombothsides.Pickfrombothsides1 p = new Pickfrombothsides.Pickfrombothsides1();
        int ans = p.solve(A, B);
        int expected = 2;
        assertEquals(expected, ans);
    }
}