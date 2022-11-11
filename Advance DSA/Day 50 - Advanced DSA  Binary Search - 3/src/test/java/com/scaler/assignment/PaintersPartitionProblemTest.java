package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PaintersPartitionProblemTest {

    @Test
    public void paint() {
        int A = 2, B = 5;
        ArrayList<Integer> C = new ArrayList<>(List.of(1, 10));
        PaintersPartitionProblem p = new PaintersPartitionProblem();
        int ans = p.paint(A, B, C);
        int expected = 50;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void paint1() {
        int A = 10, B = 1;
        ArrayList<Integer> C = new ArrayList<>(List.of(1, 8, 11, 3));
        PaintersPartitionProblem p = new PaintersPartitionProblem();
        int ans = p.paint(A, B, C);
        int expected = 11;
        Assert.assertEquals(expected, ans);
    }
}