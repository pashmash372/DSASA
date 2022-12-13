package com.scaler.assignement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayEasyTest {

    @Test
    void maxSubarray() {
//        A = 5
//        B = 12
//        C = [2, 1, 3, 4, 5]
        MaximumSubarrayEasy m = new MaximumSubarrayEasy();
        int A = 5;
        int B = 12;
        int[] C = {2, 1, 3, 4, 5};
        int ans = m.maxSubarray(A, B, C);
        int expected=12;
        assertEquals(expected,ans);
    }

    @Test
    void maxSubarray1() {
//        A = 3
//        B = 1
//        C = [2, 2, 2]
        MaximumSubarrayEasy m = new MaximumSubarrayEasy();
        int A = 3;
        int B = 1;
        int[] C = {2, 2, 2};
        int ans = m.maxSubarray(A, B, C);
        int expected=0;
        assertEquals(expected,ans);
    }
}