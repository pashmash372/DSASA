package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LargestDistancebetweennodesofaTreeTest {

    @Test
    public void solve() {
        LargestDistancebetweennodesofaTree l = new LargestDistancebetweennodesofaTree();
        ArrayList<Integer> A = new ArrayList(List.of(-1, 0, 1, 1, 0, 4));
        int ans = l.solve(A);
        int expected=4;
        Assert.assertEquals(expected,ans);

    }
}