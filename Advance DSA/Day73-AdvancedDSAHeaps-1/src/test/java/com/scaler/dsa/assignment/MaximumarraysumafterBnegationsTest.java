package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class MaximumarraysumafterBnegationsTest {

    @Test
    public void solve() {
        int[] A = {24, -68, -29, -9, 84};
        int B = 4;
        MaximumarraysumafterBnegations m = new MaximumarraysumafterBnegations();
        int ans = m.solve(A, B);
        int expected = 196;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {57, 3, -14, -87, 42, 38, 31, -7, -28, -61};
        int B = 10;
        MaximumarraysumafterBnegations m = new MaximumarraysumafterBnegations();
        int ans = m.solve(A, B);
        int expected = 362;
        Assert.assertEquals(expected, ans);
    }

}