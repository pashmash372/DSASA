package com.scaler.homework;

public class SingleElementinSortedArray {

    static class Solution_1 {
        public int solve(int[] A) {
            int ans = 0, n = A.length;
            int low = 0, high = n - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (mid == n - 1) return A[n - 1];
                if (A[mid] == A[mid + 1]) mid++;
                // if all elements with index < mid are occuring twice then mid should be odd
                if (mid % 2 == 1) low = mid + 1;
                else {
                    ans = mid;
                    high = mid - 1;
                }
            }
            return A[ans];
        }
    }


}


/*Q1. Single Element in Sorted Array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a sorted array of integers A where every element appears twice except for one element which appears once, find and return this single element that appears only once.

NOTE: Users are expected to solve this in O(log(N)) time.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return the single element that appears only once.



Example Input
Input 1:

A = [1, 1, 7]
Input 2:

A = [2, 3, 3]


Example Output
Output 1:

 7
Output 2:

 2


Example Explanation
Explanation 1:

 7 appears once
Explanation 2:

 2 appears once*/

/*Lets say the position of the element occuring once is x.
What property do you observe for the elements which are towards the left of x?

For any i from [0,x) ,we can say that

    if i is even A[i]==A[i+1]
    if i is odd  A[i]==A[i-1]
This cannot be said for elements from [x+1,n). Because in that case if i is even A[i]==A[i-1] and vice versa.

Therefore we just have to find the last index ‘j’ such that it satisfies the property of index from [0,x).
If we get j , then A[j+1] would be our answer.*/