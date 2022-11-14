package com.scaler.assignment;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ThreeSumZeroTest {

    @Test
    public void threeSum() {
        ArrayList<Integer> A = new ArrayList<>(List.of(-1, 0, 1, 2, -1, 4));

        List<List<Integer>> lists = List.of(List.of(-1, 0, 1), List.of(-1, -1, 2));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        lists.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            expected.add(temp);
        });
        ThreeSumZero t = new ThreeSumZero();
        ArrayList<ArrayList<Integer>> ans = t.threeSum(A);
        expected.forEach(System.out::println);

//        Assert.assertTrue(expected.equals(ans));

        Assert.assertThat(expected, Matchers.containsInAnyOrder(ans.toArray()));
    }
}