package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MajorityElementTest {

    @Test
    public void solve() {
        MajorityElement m = new MajorityElement();
        List<Integer> A = List.of(4, 3, 6, 3, 1, 3, 2, 5, 3, 3, 3);
        int ans = m.majorityElement(A);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

}