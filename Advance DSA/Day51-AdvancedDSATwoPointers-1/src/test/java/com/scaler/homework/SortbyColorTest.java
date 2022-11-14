package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SortbyColorTest {

    @Test
    public void sortColors() {
        ArrayList<Integer> A = new ArrayList<>(List.of(0, 1, 2, 0, 1, 2));
        SortbyColor s = new SortbyColor();
        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 0, 1, 1, 2, 2));
        ArrayList<Integer> ans = s.sortColors(A);
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void sortColors1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(0));
        SortbyColor s = new SortbyColor();
        ArrayList<Integer> expected = new ArrayList<>(List.of(0));
        ArrayList<Integer> ans = s.sortColors(A);
        Assert.assertEquals(expected, ans);
    }
}