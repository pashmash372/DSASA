package com.scaler.homework;

public class Reversepairs {

    public int solve(int[] A) {
        int n = A.length;
        return mergeSort_and_count(A, 0, n - 1);
    }

    int mergeSort_and_count(int[] A, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            int count = mergeSort_and_count(A, start, mid) + mergeSort_and_count(A, mid + 1, end);
            int j = mid + 1;
            for (int i = start; i <= mid; i++) {
                while (j <= end && 1L * A[i] > A[j] * 2L) {
                    j++;
                    count += j - (mid + 1);
                }
            }
            merge(A, start, mid, end);
            return count;
        } else
            return 0;
    }

    void merge(int[] A, int start, int mid, int end) {
        int n1 = (mid - start + 1);
        int n2 = (end - mid);

        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = A[start + i];
        for (int j = 0; j < n2; j++)
            R[j] = A[mid + 1 + j];

        int i = 0, j = 0;
        for (int k = start; k <= end; k++) {
            if (j >= n2 || i < n1 && L[i] <= R[j]) A[k] = L[i++];
            else A[k] = R[j++];

        }
    }
}


/*2. Reverse pairs
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A, we call (i, j) an important reverse pair if i < j and A[i] > 2*A[j].
Return the number of important reverse pairs in the given array A.



Problem Constraints
1 <= length of the array <= 105

-2 * 109 <= A[i] <= 2 * 109



Input Format
The only argument given is the integer array A.



Output Format
Return the number of important reverse pairs in the given array A.



Example Input
Input 1:

 A = [1, 3, 2, 3, 1]
Input 2:

 A = [4, 1, 2]


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 There are two pairs which are important reverse i.e (3, 1) and (3, 1).
Explanation 2:

 There is only one pair i.e (4, 1).*/