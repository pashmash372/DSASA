package com.scaler.assignment;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LargestNumberTest {

    @Test
    public void largestNumber() {
        ArrayList<Integer> A = new ArrayList<>(List.of(3, 30, 34, 5, 9));
        LargestNumber.Solution1 l = new LargestNumber.Solution1();
        String ans = l.largestNumber(A);
        String expected = "9534330";
        assertEquals(expected, ans);
    }

    @Test
    public void largestNumber1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(2, 3, 9, 0));
        LargestNumber.Solution1 l = new LargestNumber.Solution1();
        String ans = l.largestNumber(A);
        String expected = "9320";
        assertEquals(expected, ans);
    }

    @Test
    public void largestNumber2() {
        int A[] = {3, 30, 34, 5, 9};
        LargestNumber.Solution2 l = new LargestNumber.Solution2();
        String ans = l.largestNumber(A);
        String expected = "9534330";
        assertEquals(expected, ans);
    }

    @Test
    public void largestNumber3() {
        int A[]={2, 3, 9, 0};
        LargestNumber.Solution2 l = new LargestNumber.Solution2();
        String ans = l.largestNumber(A);
        String expected = "9320";
        assertEquals(expected, ans);
    }
}