package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class FindapeakelementTest {

    @Test
    public void solve() {
        int[] A = {1, 2, 3, 4, 5};
        Findapeakelement f = new Findapeakelement();
        int ans = f.solve(A);
        int expected = 5;
        Assert.assertEquals(expected, ans);

    }

    @Test
    public void solve1() {
        int[] A = {5, 17, 100, 11};
        Findapeakelement f = new Findapeakelement();
        int ans = f.solve(A);
        int expected = 100;
        Assert.assertEquals(expected, ans);

    }
}