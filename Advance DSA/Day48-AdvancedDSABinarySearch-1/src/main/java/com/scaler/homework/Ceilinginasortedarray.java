package com.scaler.homework;


public class Ceilinginasortedarray {
    public int solve(int A, int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        int ceil = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == x) {
                return nums[mid];
            } else if (x < nums[mid]) {
                ceil = nums[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ceil;
    }
}



/*Q2. Ceiling in a sorted array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a sorted array B of integers of size A, and a integer value C, return the ceiling of C which is present in array B.


Problem Constraints
1 <= A <= 105,
-109 <= B[i] <= 109,
-109 <= C <= 109


Input Format
The first argument A is the size of the array.
The second argument B is the sorted array.
The third argument C is the integer value whose ceil in the array is to be obtained.


Output Format
A single integer, denoting the ceil of C present in array B. If no ceil is present return -1.


Example Input
Input 1:

A = 5
B = [2, 5, 6, 9, 18]
C = 7
Input 2:

A = 6
B = [3, 7, 9, 11, 19, 20]
C = 22


Example Output
Output 1:
9
Output 2:

-1


Example Explanation
Explanation 1:
The greatest integer greater than or equal to 7, and present in array B is 9.
Explanation 2:

There is no integer greater than or equal to 22, which is present in array B, so the result is -1.*/