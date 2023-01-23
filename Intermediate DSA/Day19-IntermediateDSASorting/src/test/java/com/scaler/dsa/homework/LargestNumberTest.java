package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LargestNumberTest {

    @Test
    public void solve() {
        LargestNumber l = new LargestNumber();
        List<Integer> A = List.of(3, 30, 34, 5, 9);
        String ans = l.largestNumber(A);
        String expected = "9534330";
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        LargestNumber l = new LargestNumber();
        List<Integer> A = List.of(2, 3, 9, 0);
        String ans = l.largestNumber(A);
        String expected = "9320";
        Assert.assertEquals(expected, ans);
    } @Test
    public void solve2() {
        LargestNumber l = new LargestNumber();
        List<Integer> A = List.of(0, 0, 0, 0, 0 );
        String ans = l.largestNumber(A);
        String expected = "0";
        Assert.assertEquals(expected, ans);
    }
}