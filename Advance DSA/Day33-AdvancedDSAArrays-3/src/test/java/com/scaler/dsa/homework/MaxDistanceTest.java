package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDistanceTest {

    @Test
    public void solve() {
        int[] A = {3, 5, 4, 2};

        MaxDistance m  = new MaxDistance();
        int ans = m.maximumGap(A);
        int expected=2;
        assertEquals(expected,ans);
    }

}