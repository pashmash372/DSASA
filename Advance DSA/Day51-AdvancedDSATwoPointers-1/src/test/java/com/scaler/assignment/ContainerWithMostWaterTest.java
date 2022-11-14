package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWaterTest {

    @Test
    public void maxArea() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 5, 4, 3));
        ContainerWithMostWater c = new ContainerWithMostWater();
        int ans = c.maxArea(A);
        int expected = 6;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void maxArea1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1));
        ContainerWithMostWater c = new ContainerWithMostWater();
        int ans = c.maxArea(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}