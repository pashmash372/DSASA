package com.scaler.homework;

import java.util.ArrayList;


class AlternatingSubarraysEasy {
    public int[] solve(int[] A, int B) {
        ArrayList< Integer > l1 = new ArrayList < > ();
        int n = A.length;
        int len = 2 * B + 1;
        for (int i = 0; i < n - len + 1; i++) {
            int curr = -1;
            int flag = 1;
            for (int j = i; j < i + len; j++) {
                if (A[j] == curr) {
                    flag = 0;
                    break;
                }
                curr = A[j];
            }
            if (flag == 1) {
                l1.add(i + B);
            }
        }
        int[] ret = new int[l1.size()];
        for (int i = 0; i < l1.size(); i++) {
            ret[i] = l1.get(i);
        }
        return ret;
    }
}
/*Q3. Alternating Subarrays Easy
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given an integer array A of length N comprising of 0's & 1's, and an integer B.

You have to tell all the indices of array A that can act as a center of 2 * B + 1 length 0-1 alternating subarray.

A 0-1 alternating array is an array containing only 0's & 1's, and having no adjacent 0's or 1's. For e.g. arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1 alternating, while [1, 1] and [0, 1, 0, 0, 1] are not.



Problem Constraints
1 <= N <= 103

A[i] equals to 0 or 1.

0 <= B <= (N - 1) / 2



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer array containing indices(0-based) in sorted order. If no such index exists, return an empty integer array.



Example Input
Input 1:

 A = [1, 0, 1, 0, 1]
 B = 1
Input 2:

 A = [0, 0, 0, 1, 1, 0, 1]
 B = 0


Example Output
Output 1:

 [1, 2, 3]
Output 2:

 [0, 1, 2, 3, 4, 5, 6]


Example Explanation
Explanation 1:

 Index 1 acts as a centre of alternating sequence: [A0, A1, A2]
 Index 2 acts as a centre of alternating sequence: [A1, A2, A3]
 Index 3 acts as a centre of alternating sequence: [A2, A3, A4]
Explanation 2:

 Each index in the array acts as the center of alternating sequences of lengths 1.*/


/*Since, the length of the given required subarray is fixed, and the constraints allow an O(N ^ 2) approach.

We can simply brute force for each subarray for length 2 * B + 1.
We will loop from each starting point of every possible subarray, and check if the adjacent elements are unequal.

We can keep a flag variable to keep track of the status throughout the subarray.
If the condition is true, then we will append to a list that we will return.

Refer to the complete solution for more implementation details.*/