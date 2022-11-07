package com.scaler.assignment;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class MergeTwoSortedArraysTest {

    @Test
    public void solve() {
        ArrayList<Integer> A = new ArrayList<>(List.of(4, 7, 9));
        ArrayList<Integer> B = new ArrayList<>(List.of(2, 11, 19));
        MergeTwoSortedArrays m = new MergeTwoSortedArrays();
        ArrayList<Integer> ans = m.solve(A, B);
        ArrayList<Integer> expected = new ArrayList<>(List.of(2, 4, 7, 9, 11, 19));
        assertTrue(expected.equals(ans));
    }@Test
    public void solve1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1));
        ArrayList<Integer> B = new ArrayList<>(List.of(2));
        MergeTwoSortedArrays m = new MergeTwoSortedArrays();
        ArrayList<Integer> ans = m.solve(A, B);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1,2));
        assertTrue(expected.equals(ans));
    }
}