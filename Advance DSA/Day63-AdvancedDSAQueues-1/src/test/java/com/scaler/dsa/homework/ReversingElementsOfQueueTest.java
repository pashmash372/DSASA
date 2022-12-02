package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class ReversingElementsOfQueueTest {

    @Test
    public void solve() {
        int[] A = {1, 2, 3, 4, 5};
        int B = 3;
        ReversingElementsOfQueue r = new ReversingElementsOfQueue();
        int[] ans = r.solve(A, B);
        int[] expected = {3, 2, 1, 4, 5};
        Assert.assertArrayEquals(expected, ans);
    } @Test
    public void solve1() {
        int[] A = {5, 17, 100, 11};
        int B = 2;
        ReversingElementsOfQueue r = new ReversingElementsOfQueue();
        int[] ans = r.solve(A, B);
        int[] expected = {17, 5, 100, 11};
        Assert.assertArrayEquals(expected, ans);
    }
}