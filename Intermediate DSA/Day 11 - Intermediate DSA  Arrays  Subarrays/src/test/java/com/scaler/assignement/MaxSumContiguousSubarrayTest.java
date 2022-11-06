package com.scaler.assignement;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumContiguousSubarrayTest {

    @Test
    void maxSubArray() {
//         A = [1, 2, 3, 4, -10]

        List<Integer> A = List.of(1, 2, 3, 4, -10);
        int expected=10;
        MaxSumContiguousSubarray m = new MaxSumContiguousSubarray();
        int ans = m.maxSubArray(A);
        assertEquals(expected,ans);
    }
    @Test
    void maxSubArray1() {
//        A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

        List<Integer> A = List.of(-2, 1, -3, 4, -1, 2, 1, -5, 4);
        int expected=6;
        MaxSumContiguousSubarray m = new MaxSumContiguousSubarray();
        int ans = m.maxSubArray(A);
        assertEquals(expected,ans);
    }
}