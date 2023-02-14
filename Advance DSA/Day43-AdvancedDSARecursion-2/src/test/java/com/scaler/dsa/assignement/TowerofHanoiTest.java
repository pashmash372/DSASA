package com.scaler.dsa.assignement;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TowerofHanoiTest {

    @Test
    public void solve() {
        TowerofHanoi t = new TowerofHanoi();
        int A = 3;
        int[][] ans = t.towerOfHanoi(A);
        int[][] expected = {{1, 1, 3}, {2, 1, 2}, {1, 3, 2}, {3, 1, 3}, {1, 2, 1}, {2, 2, 3}, {1, 1, 3}};
        System.out.println(Arrays.deepToString(ans));
        Assert.assertArrayEquals(expected, ans);

    }

}