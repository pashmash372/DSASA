package com.scaler.dsa.assignement;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstMissingIntegerTest {

    @Test
    public void solve() {
        FirstMissingInteger f = new FirstMissingInteger();
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(6, 1, 2, 8, 3, 4, 7, 10, 5));
        int ans = f.firstMissingPositive(A);
        int expected = 9;
        Assert.assertEquals(expected, ans);
    }
}