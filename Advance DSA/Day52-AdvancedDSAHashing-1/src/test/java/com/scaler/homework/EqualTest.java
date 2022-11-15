package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EqualTest {

    @Test
    public void equal() {
        ArrayList<Integer> A = new ArrayList<>(List.of(3, 4, 7, 1, 2, 9, 8));
        Equal e = new Equal();
        ArrayList<Integer> ans = e.equal(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 2, 3, 5));
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void equal1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(2, 5, 1, 6));
        Equal e = new Equal();
        ArrayList<Integer> ans = e.equal(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 1, 2, 3));
        Assert.assertEquals(expected, ans);
    }
}