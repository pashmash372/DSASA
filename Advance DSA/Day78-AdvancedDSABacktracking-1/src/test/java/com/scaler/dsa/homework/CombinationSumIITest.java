package com.scaler.dsa.homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIITest {

    @Test
    public void combinationSum() {
        CombinationSumII c = new CombinationSumII();
//        int[] A = {10, 1, 2, 7, 6, 1, 5};
        ArrayList<Integer> A = new ArrayList<>(List.of(10, 1, 2, 7, 6, 1, 5));
        int B = 8;
        ArrayList<ArrayList<Integer>> ans = c.combinationSum(A, B);

        /* [
  [1, 1, 6 ],
  [1, 2, 5 ],
  [1, 7 ],
  [2, 6 ]
 ]*/

        List<List<Integer>> lists1 = List.of(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        lists1.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            expected.add(temp);
        });
    }

    @Test
    public void combinationSum1() {
        CombinationSumII1 c = new CombinationSumII1();
//        int[] A = {10, 1, 2, 7, 6, 1, 5};
        ArrayList<Integer> A = new ArrayList<>(List.of(10, 1, 2, 7, 6, 1, 5));
        int B = 8;
        ArrayList<ArrayList<Integer>> ans = c.combinationSum(A, B);

        /* [
  [1, 1, 6 ],
  [1, 2, 5 ],
  [1, 7 ],
  [2, 6 ]
 ]*/

        List<List<Integer>> lists1 = List.of(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        lists1.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            expected.add(temp);
        });
    }
}