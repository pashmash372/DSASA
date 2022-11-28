package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class DoubleCharacterTroubleTest {

    @Test
    public void solve() {
        DoubleCharacterTrouble d = new DoubleCharacterTrouble();
        String A = "abccbc";
        String ans = d.solve(A);
        String expected = "ac";
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        DoubleCharacterTrouble d = new DoubleCharacterTrouble();
        String A = "ab";
        String ans = d.solve(A);
        String expected = "ab";
        Assert.assertEquals(expected, ans);
    }
}