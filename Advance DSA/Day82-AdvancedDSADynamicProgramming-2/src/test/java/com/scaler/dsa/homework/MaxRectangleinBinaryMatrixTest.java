package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MaxRectangleinBinaryMatrixTest {

    @Test
    public void solve() {
        /* A = [
       [1, 1, 1]
       [0, 1, 1]
       [1, 0, 0]
     ]*/
        MaxRectangleinBinaryMatrix m = new MaxRectangleinBinaryMatrix();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        List<List<Integer>> lists1 = List.of(List.of(1, 1, 1), List.of(0, 1, 1), List.of(1, 0, 0));
        lists1.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            A.add(temp);
        });
        int ans = m.maximalRectangle(A);
        int expected = 4;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        /*A = [
       [0, 1, 0]
       [1, 1, 1]
     ]*/
        MaxRectangleinBinaryMatrix m = new MaxRectangleinBinaryMatrix();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        List<List<Integer>> lists1 = List.of(List.of(0, 1, 0), List.of(1, 1, 1));
        lists1.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            A.add(temp);
        });
        int ans = m.maximalRectangle(A);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve2() {
        /* A = [
       [1, 1, 1]
       [0, 1, 1]
       [1, 0, 0]
     ]*/
        MaxRectangleinBinaryMatrix1 m = new MaxRectangleinBinaryMatrix1();
        int[][] A = {{1, 1, 1}, {0, 1, 1}, {1, 0, 0},};
        int ans = m.maximalRectangle(A);
        int expected = 4;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve3() {
        /*A = [
       [0, 1, 0]
       [1, 1, 1]
     ]*/
        MaxRectangleinBinaryMatrix1 m = new MaxRectangleinBinaryMatrix1();
        int[][] A = {{0, 1, 0}, {1, 1, 1}};
        int ans = m.maximalRectangle(A);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

}