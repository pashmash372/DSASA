package com.scaler.homework;

public class KthPrice {
    public int solve(final int[] A, int k) {
        int ans = -1;
        int start = A[0], end = A[0];
        for (int i = 1; i < A.length; i++) {
            start = Math.min(start, A[i]);
            end = Math.max(end, A[i]);
        }
        int mid, numSmaller, i;
        while (start <= end) {
            mid = (start + end) / 2;
            numSmaller = 0;
            for ( i = 0; i < A.length; i++)
                if (A[i] <= mid)
                    numSmaller++;
            if (numSmaller >= k) {
                end = mid - 1;
                ans = mid;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}


/*Q1. KthPrice
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given the price list at which tickets for a flight were purchased, figure out the kth smallest price for the flight. kth smallest price is the minimum possible n such that there are at least k price elements in the price list with value <= n. In other words, if the price list was sorted, then A[k-1] ( k is 1 based, while the array is 0 based ).

NOTE You are not allowed to modify the price list ( The price list is read only ). Try to do it using constant extra space.

Example:

A : [2 1 4 3 2]
k : 3

Answer : 2
Constraints :

1 <= number of elements in the price list <= 1000000
1 <= k <= number of elements in the price list*/