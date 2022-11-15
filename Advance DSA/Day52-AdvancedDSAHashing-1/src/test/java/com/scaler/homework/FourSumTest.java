package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FourSumTest {

    @Test
    public void fourSum() {
//        {1, 0, -1, 0 ,-2 ,2},
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 0, -1, 0, -2, 2));
        int target = 0;
        FourSum f = new FourSum();
        ArrayList<ArrayList<Integer>> ans = f.fourSum(A, target);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        List<List<Integer>> lists = List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1));
        lists.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            expected.add(temp);
        });
        System.out.println(ans.toString());
        Assert.assertEquals(expected, ans);
    }
}