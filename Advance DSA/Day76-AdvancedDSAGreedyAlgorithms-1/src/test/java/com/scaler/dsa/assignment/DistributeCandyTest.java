package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class DistributeCandyTest {

    @Test
    public void solve() {
        int[] A = {1, 2};
        DistributeCandy d = new DistributeCandy();
        int ans = d.candy(A);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }


    @Test
    public void solve1() {
        int[] A = {1, 5, 2, 1};
        DistributeCandy d = new DistributeCandy();
        int ans = d.candy(A);
        int expected = 7;
        Assert.assertEquals(expected, ans);
    }


}