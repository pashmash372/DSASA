package com.scaler.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {

    @Test
    void largestNumber() {
        List<Integer>A= List.of(3, 30, 34, 5, 9);
        String expected="9534330";
        LargestNumber l = new LargestNumber();
        String ans = l.largestNumber(A);
        assertEquals(expected,ans);
    } @Test
    void largestNumber1() {
        List<Integer>A= List.of(2, 3, 9, 0);
        String expected="9320";
        LargestNumber l = new LargestNumber();
        String ans = l.largestNumber(A);
        assertEquals(expected,ans);
    }@Test
    void largestNumber2() {
        List<Integer>A= List.of( 0, 0, 0, 0, 0);
        String expected="0";
        LargestNumber l = new LargestNumber();
        String ans = l.largestNumber(A);
        assertEquals(expected,ans);
    }
}