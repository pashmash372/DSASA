package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class AlternatepositiveandnegativeelementsTest {

    @Test
    public void solve() {
        int[] A = {-1, -2, -3, 4, 5};
        Alternatepositiveandnegativeelements a = new Alternatepositiveandnegativeelements();
        int[] ans = a.solve(A);
        int[] expected = {-1, 4, -2, 5, -3};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {5, -17, -100, -11};
        Alternatepositiveandnegativeelements a = new Alternatepositiveandnegativeelements();
        int[] ans = a.solve(A);
        int[] expected = {-17, 5, -100, -11};
        Assert.assertArrayEquals(expected, ans);
    }
}