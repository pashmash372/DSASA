package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CompareSortedSubarraysTest {

    @Test
    public void solve() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 7, 11, 8, 11, 7, 1));
        List<List<Integer>> lists = List.of(List.of(0, 2, 4, 6));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        lists.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            B.add(temp);
        });
        CompareSortedSubarrays c = new CompareSortedSubarrays();
        ArrayList<Integer> ans = c.solve(A, B);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1));
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 3, 2));
        List<List<Integer>> lists = List.of(List.of(0, 1, 1, 2));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        lists.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            B.add(temp);
        });
        CompareSortedSubarrays c = new CompareSortedSubarrays();
        ArrayList<Integer> ans = c.solve(A, B);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0));
        Assert.assertEquals(expected, ans);
    }
}