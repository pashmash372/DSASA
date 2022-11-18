package com.scaler.homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsTest {

    @Test
    public void solve() {
        CommonElements c = new CommonElements();
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 2, 1));
        ArrayList<Integer> B = new ArrayList<>(List.of(2, 3, 1, 2));
        ArrayList<Integer> ans = c.solve(A, B);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 2, 2));
    }

    @Test
    public void solve1() {
        CommonElements c = new CommonElements();
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 2, 1));
        ArrayList<Integer> B = new ArrayList<>(List.of(2, 3, 1, 2));
        ArrayList<Integer> ans = c.solve(A, B);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 2, 2));
    }
}