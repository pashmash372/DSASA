package com.scaler.assignment;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TowerofHanoiTest {

    @Test
    public void towerOfHanoi() {
        int A = 2;
        int expected[][] = {{1, 1, 2}, {2, 1, 3}, {1, 2, 3}};
        TowerofHanoi t = new TowerofHanoi();
        int[][] ans = t.towerOfHanoi(A);
        System.out.println(Arrays.deepToString(ans));
        System.out.println(Arrays.deepToString(expected));
        assertTrue(Arrays.deepEquals(expected, ans));
    }

    @Test
    public void towerOfHanoi1() {
        int A = 3;
        int expected[][] = {{1, 1, 3}, {2, 1, 2}, {1, 3, 2}, {3, 1, 3}, {1, 2, 1}, {2, 2, 3}, {1, 1, 3}};
        TowerofHanoi t = new TowerofHanoi();
        int[][] ans = t.towerOfHanoi(A);
        System.out.println(Arrays.deepToString(ans));
        System.out.println(Arrays.deepToString(expected));
        assertTrue(Arrays.deepEquals(expected, ans));
    }
}