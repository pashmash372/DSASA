package com.scaler.dsa.assignment;

import com.scaler.dsa.homework.AllUniquePermutations;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AllUniquePermutationsTest {

    @Test
    public void permute() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 1, 2));
        AllUniquePermutations a = new AllUniquePermutations();
        ArrayList<ArrayList<Integer>> ans = a.permute(A);

    /*
    [
        [1,1,2]
        [1,2,1]
        [2,1,1]
    ]
    */
        List<List<Integer>> lists1 = List.of(List.of(1, 1, 2), List.of(1, 2, 1), List.of(2, 1, 1));
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
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2));
        AllUniquePermutations a = new AllUniquePermutations();
        ArrayList<ArrayList<Integer>> ans = a.permute(A);

/*
        [
            [1, 2]
            [2, 1]
        ]
*/
        List<List<Integer>> lists1 = List.of(List.of(1, 2), List.of(2, 1));
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