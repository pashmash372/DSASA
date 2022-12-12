package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class MishaandCandiesTest {

    @Test
    public void solve() {
        int[] A = {3, 2, 3};

        int B = 4;
        MishaandCandies m = new MishaandCandies();
        int ans = m.solve(A, B);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {1, 2, 1};

        int B = 2;
        MishaandCandies m = new MishaandCandies();
        int ans = m.solve(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }
}