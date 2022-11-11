package com.scaler.homework;

public class Findapeakelement {
    public int solve(int[] A) {
        // Try to think when will the unique answer exists,
        //Unique answer only exists when the elements first increases and then decreases.
        // Check is first or last element is the answer.
        int n = A.length;
        //base cases
        if (n == 1) return A[0];
        if (A[1] <= A[0]) return A[0];
        if (A[n - 1] >= A[n - 2]) return A[n - 1];
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (A[mid] >= A[mid - 1] && A[mid] >= A[mid + 1]) return A[mid];
            else if (A[mid] >= A[mid - 1]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}


/*Q3. Find a peak element
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A, find and return the peak element in it. An array element is peak if it is NOT smaller than its neighbors.

For corner elements, we need to consider only one neighbor. We ensure that answer will be unique.

NOTE: Users are expected to solve this in O(log(N)) time. The array may have duplicate elements.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return the peak element.



Example Input
Input 1:

A = [1, 2, 3, 4, 5]
Input 2:

A = [5, 17, 100, 11]


Example Output
Output 1:

 5
Output 2:

 100


Example Explanation
Explanation 1:

 5 is the peak.
Explanation 2:

 100 is the peak.*/


/*Observation: Given the condition that there is only a single peak element, We can observe that the array can be one of 3 types:
1) The whole array is decreasing with at most one pair of equal adjacent elements.
2) The whole array is non-increasing with at most one pair of equal adjacent elements.
3) The array is increasing first, then decreasing.

Note that if there are three or more adjacent elements equal to each other, then there can be more than one peak element. Hence, no three adjacent elements in the array are pairwise equal.
Also, there can be at most one pair of adjacent equal elements (i, i+1), and if they exist, one of these elements must be a peak element.

You need to find the index of the peak element.

Let us apply binary search on the index. Note that this is a classic binary search.
ALGORITHM:
1) Initially let l = 0 and r = A.size()-1
2) Repeat steps 3-4 while l<=r
3) Set m=(l+r)/2
4) If A[m] >= A[m-1] and A[m] >= A[m+1], A[m] is the peak element. Set ans = A[m] and exit the loop
Else if A[m] > A[m-1] we know that the peak element has to be on the right side of A[m]. Hence, we set l =m+1
Else if A[m] < A[m-1] we know that the peak element has to be on the left side of A[m]. Hence, we set r=m-1.
5) Return ans
Take extra care of edge cases, where the first or last element is the peak element.
Look for its implementation. There are multiple ways to do this.
Remember that the index starts from 0.*/