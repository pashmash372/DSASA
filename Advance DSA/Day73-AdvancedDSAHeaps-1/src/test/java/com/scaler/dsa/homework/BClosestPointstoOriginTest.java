package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BClosestPointstoOriginTest {

    @Test
    public void solve() {

        List<List<Integer>> lists = List.of(List.of(1, 3), List.of(-2, 2));
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        lists.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            A.add(temp);
        });
        int B = 1;
        BClosestPointstoOrigin b = new BClosestPointstoOrigin();
        ArrayList<ArrayList<Integer>> ans = b.solve(A, B);

        List<List<Integer>> lists1 = List.of(List.of(-2, 2));
        ArrayList<ArrayList<Integer>> A1 = new ArrayList<>();
        lists1.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            A1.add(temp);
        });

        Assert.assertEquals(A1, ans);

    }

    @Test
    public void solve1() {

        List<List<Integer>> lists = List.of(List.of(1, -1), List.of(2, -1));
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        lists.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            A.add(temp);
        });
        int B = 1;
        BClosestPointstoOrigin b = new BClosestPointstoOrigin();
        ArrayList<ArrayList<Integer>> ans = b.solve(A, B);

        List<List<Integer>> lists1 = List.of(List.of(1, -1));
        ArrayList<ArrayList<Integer>> A1 = new ArrayList<>();
        lists1.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            A1.add(temp);
        });

        Assert.assertEquals(A1, ans);

    }
}