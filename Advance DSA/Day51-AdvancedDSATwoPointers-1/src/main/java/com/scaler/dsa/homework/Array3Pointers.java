package com.scaler.dsa.homework;


public class Array3Pointers {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int minimize(final int[] A, final int[] B, final int[] C) {
        int diff = Integer.MAX_VALUE;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int i, j, k;
        for(i = 0, j = 0, k = 0; i < A.length && j < B.length && k < C.length;) {
            //  max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])) = max(A[i], B[j], C[k]) - min(A[i], B[j], C[k])
            minimum = Math.min(A[i], Math.min(B[j], C[k]));
            maximum = Math.max(A[i], Math.max(B[j], C[k]));
            diff = Math.min(diff, maximum - minimum);
            if (diff == 0) break;
            if (A[i] == minimum) i++;
            else if (B[j] == minimum) j++;
            else k++;
        }
        return diff;
    }
}
/*Q1. Array 3 Pointers
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given 3 sorted arrays A, B and C.

Find i, j, k such that : max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])) is minimized.

Return the minimum max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])).



Problem Constraints
0 <= len(A), len(B), len(c) <= 106

0 <= A[i], B[i], C[i] <= 107



Input Format
First argument is an integer array A.

Second argument is an integer array B.

Third argument is an integer array C.



Output Format
Return an single integer denoting the minimum max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])).



Example Input
Input 1:

 A = [1, 4, 10]
 B = [2, 15, 20]
 C = [10, 12]
Input 2:

 A = [3, 5, 6]
 B = [2]
 C = [3, 4]


Example Output
Output 1:

 5
Output 2:

 1


Example Explanation
Explanation 1:

 With 10 from A, 15 from B and 10 from C.
Explanation 2:

 With 3 from A, 2 from B and 3 from C.*/

/*Windowing strategy works here.
Lets say the arrays are A,B and C.

Take 3 pointers X, Y and Z
Initialize them to point to the start of arrays A, B and C
Find min of X, Y and Z.
Compute max(X, Y, Z) - min(X, Y, Z).
If new result is less than current result, change it to the new result.
Increment the pointer of the array which contains the minimum.
Note that we increment the pointer of the array which has the minimum, because our goal is to decrease the difference. Increasing the maximum pointer is definitely going to increase the difference. Increase the second maximum pointer can potentially increase the difference ( however, it certainly will not decrease the difference ).*/