package com.scaler.assignment;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GrayCodeTest {

    @Test
    public void grayCode() {
        int A = 2;
        GrayCode g = new GrayCode();
        ArrayList<Integer> ans = g.grayCode(A);
        List<Integer> list = Arrays.asList(0, 1, 3, 2);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.addAll(list);
        assertTrue(expected.equals(ans));
    }

    @Test
    public void grayCode1() {
        int A = 3;
        GrayCode g = new GrayCode();
        ArrayList<Integer> ans = g.grayCode(A);
        List<Integer> list = Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.addAll(list);
        assertTrue(expected.equals(ans));
    }
}