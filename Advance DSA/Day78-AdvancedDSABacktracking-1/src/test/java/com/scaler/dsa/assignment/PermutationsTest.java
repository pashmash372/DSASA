package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PermutationsTest {

    @Test
    public void permute() {
        Permutations p = new Permutations();
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<ArrayList<Integer>> ans = p.permute(A);

        /*[ [1, 2, 3]
  [1, 3, 2]
  [2, 1, 3]
  [2, 3, 1]
  [3, 1, 2]
  [3, 2, 1] ]*/

        List<List<Integer>> lists1 = List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        lists1.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            expected.add(temp);
        });

        Assert.assertEquals(expected, ans);
    }

    @Test
    public void permute1() {
        Permutations1 p = new Permutations1();
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<ArrayList<Integer>> ans = p.permute(A);

        /*[ [1, 2, 3]
  [1, 3, 2]
  [2, 1, 3]
  [2, 3, 1]
  [3, 1, 2]
  [3, 2, 1] ]*/

        List<List<Integer>> lists1 = List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        lists1.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            expected.add(temp);
        });

        Assert.assertEquals(expected, ans);
    }
}