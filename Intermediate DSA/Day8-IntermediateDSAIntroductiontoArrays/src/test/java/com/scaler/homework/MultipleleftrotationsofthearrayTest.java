package com.scaler.homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MultipleleftrotationsofthearrayTest {

    @Test
    public void solve() {

//        A = [1, 2, 3, 4, 5]
//        B = [2, 3]
        ArrayList<Integer> A = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> B = new ArrayList<Integer>(List.of(2, 3));

//          [ [3, 4, 5, 1, 2]
//     [4, 5, 1, 2, 3] ]

        List<List<Integer>> expected = List.of(List.of(3, 4, 5, 1, 2), List.of(4, 5, 1, 2, 3));
        Multipleleftrotationsofthearray m = new Multipleleftrotationsofthearray();
        ArrayList<ArrayList<Integer>> ans = m.solve(A, B);

        assertEquals("FAILED", expected, ans);


    }

    @Test
    public void solve1() {

//        A = [5, 17, 100, 11]
//        B = [1]
        ArrayList<Integer> A = new ArrayList<Integer>(List.of(5, 17, 100, 11));
        ArrayList<Integer> B = new ArrayList<Integer>(List.of(1));


//    [ [17, 100, 11, 5] ]

        List<List<Integer>> expected = List.of(List.of(17, 100, 11, 5));
        Multipleleftrotationsofthearray m = new Multipleleftrotationsofthearray();
        ArrayList<ArrayList<Integer>> ans = m.solve(A, B);

        assertEquals("FAILED", expected, ans);


    }
}