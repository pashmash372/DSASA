package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SubsetTest {

    @Test
    public void solve() {
        Subset s = new Subset();
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<ArrayList<Integer>> ans = s.subsets(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();

        List<List<Integer>> lists = List.of(List.of(), List.of(1), List.of(1, 2), List.of(1, 2, 3), List.of(1, 3), List.of(2), List.of(2, 3), List.of(3));
        lists.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            expected.add(temp);
        });

        Assert.assertEquals(expected, ans);

    }

    @Test
    public void solve1() {
        Subset1 s = new Subset1();
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<ArrayList<Integer>> ans = s.subsets(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();

        List<List<Integer>> lists = List.of(List.of(), List.of(1), List.of(1, 2), List.of(1, 2, 3), List.of(1, 3), List.of(2), List.of(2, 3), List.of(3));
        lists.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            expected.add(temp);
        });

        Assert.assertEquals(expected, ans);

    }
}