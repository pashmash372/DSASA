package com.scaler.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthSmallestElementTest {

    @Test
    public void kthsmallest() {
        int []A = {2, 1, 4, 3, 2};
        int B = 3;
        int expected=2;
        KthSmallestElement k = new KthSmallestElement();
        int ans = k.kthsmallest(A, B);
        assertEquals(expected,ans);
    } @Test
    public void kthsmallest1() {
        int []A = {1,2};
        int B = 2;
        int expected=2;
        KthSmallestElement k = new KthSmallestElement();
        int ans = k.kthsmallest(A, B);
        assertEquals(expected,ans);
    }
}