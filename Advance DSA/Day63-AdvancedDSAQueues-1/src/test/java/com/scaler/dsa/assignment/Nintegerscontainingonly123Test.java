package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Nintegerscontainingonly123Test {

    @Test
    public void solve() {
        int A = 3;
        Nintegerscontainingonly123 n = new Nintegerscontainingonly123();
        ArrayList<Integer> ans = n.solve(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 2, 3));
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int A = 7;
        Nintegerscontainingonly123 n = new Nintegerscontainingonly123();
        ArrayList<Integer> ans = n.solve(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 2, 3, 11, 12, 13, 21));
        Assert.assertEquals(expected, ans);
    }
}