package com.scaler.dsa.assignment;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class LargestNumberTest {

    @Test
    public void solve() {
        LargestNumber l = new LargestNumber();
        List<Integer> A = List.of(3, 30, 34, 5, 9);
        String ans = l.largestNumber(A);
        String expected = "9534330";
        assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        LargestNumber l = new LargestNumber();
        List<Integer> A = Arrays.asList(2, 3, 9, 0);
        String ans = l.largestNumber(A);
        String expected = "9320";
        assertEquals(expected, ans);
    }

    @Test
    public void solve2() {
        LargestNumber1 l = new LargestNumber1();
        List<Integer> A = Arrays.asList(3, 30, 34, 5, 9);
        String ans = l.largestNumber(A);
        String expected = "9534330";
        assertEquals(expected, ans);
    }

    @Test
    public void solve3() {
        LargestNumber1 l = new LargestNumber1();
        List<Integer> A = Arrays.asList(2, 3, 9, 0);
        String ans = l.largestNumber(A);
        String expected = "9320";
        assertEquals(expected, ans);
    }

}