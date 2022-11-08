package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WaveArrayTest {

    @Test
    public void wave() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 3, 4));
        WaveArray w = new WaveArray();
        ArrayList<Integer> ans = w.wave(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(2, 1, 4, 3));
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void wave1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2));
        WaveArray w = new WaveArray();
        ArrayList<Integer> ans = w.wave(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(2, 1));
        Assert.assertEquals(expected, ans);
    }

}