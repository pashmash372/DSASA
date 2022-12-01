package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MaximumRectangleTest {

    @Test
    public void maximalRectangle() {
       /* A = [   [0, 0, 1]
            [0, 1, 1]
            [1, 1, 1]   ]*/

        List<List<Integer>> lists = List.of(List.of(0, 0, 1), List.of(0, 1, 1), List.of(1, 1, 1));
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        lists.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            A.add(temp);
        });
        MaximumRectangle m = new MaximumRectangle();
        int ans = m.maximalRectangle(A);
        int expected = 4;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void maximalRectangle1() {

        /*A = [   [0, 1, 0, 1]
            [1, 0, 1, 0]    ]*/

        List<List<Integer>> lists = List.of(List.of(0, 1, 0, 1), List.of(1, 0, 1, 0));
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        lists.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            A.add(temp);
        });
        MaximumRectangle m = new MaximumRectangle();
        int ans = m.maximalRectangle(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }
}