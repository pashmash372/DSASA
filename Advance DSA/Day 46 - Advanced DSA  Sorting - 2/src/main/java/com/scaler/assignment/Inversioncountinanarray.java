package com.scaler.assignment;

public class Inversioncountinanarray {
    int mod = 1000 * 1000 * 1000 + 7;
    public int solve(int[] A) {
        return (int) mergeSort(A);
    }

    long mergeSort(int[] A) {
        int[] temp = new int[A.length];
        return _mergeSort(A, temp, 0, A.length - 1) % mod;
    }

    long _mergeSort(int[] arr, int[] temp, int left, int right) {
        int mid = 0, inv_count = 0;
        if (right > left) {
            mid = (right + left) / 2;
            inv_count += _mergeSort(arr, temp, left, mid);
            inv_count += _mergeSort(arr, temp, mid + 1, right);
            inv_count += merge(arr, temp, left, mid + 1, right);
        }
        return inv_count % mod;
    }

    long merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i, j, k;
        long inv_count = 0;
        i = left;
        j = mid;
        k = left;
        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else {
                temp[k++] = arr[j++];
                inv_count = inv_count + (mid - i);
            }
        }
        while (i <= mid - 1)
            temp[k++] = arr[i++];
        while (j <= right)
            temp[k++] = arr[j++];
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
        return inv_count % mod;
    }
}


/*Q1. Inversion count in an array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A. Find the total number of inversions of A modulo (109 + 7).



Problem Constraints
1 <= length of the array <= 100000

1 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return the number of inversions of A modulo (109 + 7).



Example Input
Input 1:

A = [3, 2, 1]
Input 2:

A = [1, 2, 3]


Example Output
Output 1:

3
Output 2:

0


Example Explanation
Explanation 1:

 All pairs are inversions.
Explanation 2:

 No inversions.*/