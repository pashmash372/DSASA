package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SubsetsIITest {
    @Test
    public void solve() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 2));
        SubsetsII s = new SubsetsII();
        ArrayList<ArrayList<Integer>> ans = s.subsetsWithDup(A);
        /*
           [
                [],
                [1],
                [1, 2],
                [1, 2, 2],
                [2],
                [2, 2]
           ]
        */
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        List<List<Integer>> lists = List.of(List.of(), List.of(1), List.of(1, 2), List.of(1, 2, 2), List.of(2), List.of(2, 2));
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
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 1));
        SubsetsII s = new SubsetsII();
        ArrayList<ArrayList<Integer>> ans = s.subsetsWithDup(A);
        /*
            [
                [],
                [1],
                [1, 1]
            ]
        */
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        List<List<Integer>> lists = List.of(List.of(), List.of(1), List.of(1, 1));
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
    public void solve2() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 2));
        SubsetsII1 s = new SubsetsII1();
        ArrayList<ArrayList<Integer>> ans = s.subsetsWithDup(A);
        /*
           [
                [],
                [1],
                [1, 2],
                [1, 2, 2],
                [2],
                [2, 2]
           ]
        */
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        List<List<Integer>> lists = List.of(List.of(), List.of(1), List.of(1, 2), List.of(1, 2, 2), List.of(2), List.of(2, 2));
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
    public void solve3() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 1));
        SubsetsII1 s = new SubsetsII1();
        ArrayList<ArrayList<Integer>> ans = s.subsetsWithDup(A);
        /*
            [
                [],
                [1],
                [1, 1]
            ]
        */
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        List<List<Integer>> lists = List.of(List.of(), List.of(1), List.of(1, 1));
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