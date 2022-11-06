package com.scaler.assignment;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AntiDiagonalsTest {

    @Test
    void diagonal() {
        /*
            1 2 3
            4 5 6
            7 8 9
          */

        List<List<Integer>> lists = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        lists.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            A.add(temp);
        });
        AntiDiagonals a = new AntiDiagonals();
        ArrayList<ArrayList<Integer>> ans = a.diagonal(A);

        /*
        1 0 0
        2 4 0
        3 5 7
        6 8 0
        9 0 0*/


        List<List<Integer>> lists1 = List.of(List.of(1, 0, 0), List.of(2, 4, 0), List.of(3, 5, 7), List.of(6, 8, 0), List.of(9, 0, 0));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        lists1.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            expected.add(temp);
        });
        assertTrue(expected.equals(ans));
    }
}