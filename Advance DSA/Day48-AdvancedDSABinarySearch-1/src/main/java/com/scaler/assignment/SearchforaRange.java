package com.scaler.assignment;

public class SearchforaRange {
    public int[] searchRange(final int[] A, int B) {
        int N = A.length;
        int[] ans = new int[2];
        ans[0] = first(A, 0, N - 1, B, N);
        ans[1] = last(A, 0, N - 1, B, N);
        return ans;
    }

    int first(int[] A, int s, int e, int B, int N) {
        if (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid == 0 || B > A[mid - 1] && A[mid] == B) return mid;
            else if (B > A[mid]) {
                return first(A, (mid + 1), e, B, N);
            } else {
                return first(A, s, (mid - 1), B, N);
            }
        }
        return -1;
    }

    int last(int[] A, int s, int e, int B, int N) {
        if (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid == N - 1 || B < A[mid + 1] && A[mid] == B) return mid;
            else if (B > A[mid]) {
                return last(A, (mid + 1), e, B, N);
            } else {
                return last(A, s, (mid - 1), B, N);
            }
        }
        return -1;
    }
}


/*Q2. Search for a Range
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a sorted array of integers A(0 based index) of size N, find the starting and the ending position of a given integer B in array A.

Your algorithm's runtime complexity must be in the order of O(log n).

Return an array of size 2, such that the first element = starting position of B in A and the second element = ending position of B in A, if B is not found in A return [-1, -1].



Problem Constraints
1 <= N <= 106

1 <= A[i], B <= 109



Input Format
The first argument given is the integer array A.
The second argument given is the integer B.



Output Format
Return an array of size 2, such that the first element = starting position of B in A and the second element = the ending position of B in A if B is not found in A return [-1, -1].



Example Input
Input 1:

 A = [5, 7, 7, 8, 8, 10]
 B = 8
Input 2:

 A = [5, 17, 100, 111]
 B = 3


Example Output
Output 1:

 [3, 4]
Output 2:

 [-1, -1]


Example Explanation
Explanation 1:

 The first occurence of 8 in A is at index 3.
 The second occurence of 8 in A is at index 4.
 ans = [3, 4]
Explanation 2:

 There is no occurence of 3 in the array.*/