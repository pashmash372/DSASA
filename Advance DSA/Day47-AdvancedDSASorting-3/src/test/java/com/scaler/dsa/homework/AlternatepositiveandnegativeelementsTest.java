package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class AlternatepositiveandnegativeelementsTest {

    @Test
    public void solve() {
        Alternatepositiveandnegativeelements a = new Alternatepositiveandnegativeelements();
        int[] A = {-1, -2, -3, 4, 5};
        int[] ans = a.solve(A);
        int[] expected = {-1, 4, -2, 5, -3};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {
        Alternatepositiveandnegativeelements a = new Alternatepositiveandnegativeelements();
        int[] A = {5, -17, -100, -11};
        int[] ans = a.solve(A);
        int[] expected = {-17, 5, -100, -11};
        Assert.assertArrayEquals(expected, ans);
    }

}