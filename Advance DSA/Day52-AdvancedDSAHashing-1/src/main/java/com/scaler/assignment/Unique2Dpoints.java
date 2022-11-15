package com.scaler.assignment;

import java.util.HashSet;

public class Unique2Dpoints {
    public int solve(int[][] A) {
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < A.length; i++) {
            set.add("" + A[i][0] + "," + A[i][1]);
        }
        return set.size();
    }
}


/*Q3. Unique 2D points
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a 2D array A of integer points on a 2D plane. Find and return the number of unique points in the array.
The ith point in the array is (A[i][0], A[i][1])


Problem Constraints
1 <= len(A) <= 105
-109 <= A[i][0], A[i][1] <= 109


Input Format
The first argument is a 2D integer array A.


Output Format
Return an integer that is the number of unique points.


Example Input
Input:
A = [[5, 6],
     [2, 8],
     [-1, -1],
     [2, -3],
     [2, 8],
     [7, 7],
     [2, -3]]


Example Output
Output:
5


Example Explanation
Explanation:
There are 5 unique points in the given array.*/


/*Use a data structure to store the points and return the total number of unique points.

In C++ we can use Sets, maps etc with keys as pairs. In Python we can use dictionary with key as tuple.
Time Complexity - O(N)
Space Complexity - O(N)
Check Implementation for details.*/