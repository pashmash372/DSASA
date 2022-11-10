package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class SingleElementinSortedArrayTest {

    @Test
    public void solve() {
        int[] A = {1, 1, 7};
        SingleElementinSortedArray.Solution_1 s = new SingleElementinSortedArray.Solution_1();
        int ans = s.solve(A);
        int expected = 7;
        Assert.assertEquals(expected, ans);
    }
}