package com.scaler.assignment;


public class GoodPair {
    public int solve(int[] A, int B) {
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                if(i == j) continue;
                if(A[i] + A[j] == B) return 1;
            }
        }

        return 0;
    }
}


/*Q2. Good Pair
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.



Problem Constraints
1 <= A.size() <= 104

1 <= A[i] <= 109

1 <= B <= 109



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return 1 if good pair exist otherwise return 0.



Example Input
Input 1:

A = [1,2,3,4]
B = 7
Input 2:

A = [1,2,4]
B = 4
Input 3:

A = [1,2,2]
B = 4


Example Output
Output 1:

1
Output 2:

0
Output 3:

1


Example Explanation
Explanation 1:

 (i,j) = (3,4)
Explanation 2:

No pair has sum equal to 4.
Explanation 3:

 (i,j) = (2,3)



See Expected Output*/


/*Approach 1

For every i run a loop of j and check if A[i]+A[j]==B or not. Also, check if i!=j.

Time complexity : O(n^2)

This is enough to pass the test casses. However we can furthur optimize this solution.

Approach 2

Sort the array A in increasing order. For each i from 0 to n-1 find the first element in the array having a value greater than or equal to B-A[i] using binary search.
(For c++ we can directly use ‘lower_bound’ function) . Now just check if this element is equal to B-A[i] , if it is then return 1 , otherwise continue the process.

Time complexity : O(nlogn)*/