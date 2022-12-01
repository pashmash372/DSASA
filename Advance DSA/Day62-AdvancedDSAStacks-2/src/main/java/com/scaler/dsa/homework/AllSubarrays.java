package com.scaler.dsa.homework;

import java.util.Stack;

public class AllSubarrays {
    public int solve(int[] A) {
        int ans = 0;
        int n = A.length;
        /*create a stack to store the maximum value of all subarrays*/
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            /*while stack is not empty take xor of its top and current element*/
            while (!s.isEmpty()) {
                /*store the maximum value of xor*/
                int topElement = s.peek();
                ans = Math.max(ans, (A[topElement] ^ A[i]));
                /*if top of the stack is greater than current element than break the loop*/
                if (A[topElement] > A[i]) break;
                else s.pop();/*pop out the top of the stack*/
            }
            /*push the current element into the stack*/
            s.push(i);
        }
        return ans;
    }
}

/*Q3. All Subarrays
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer array A of size N. You have to generate it's all subarrays having a size greater than 1.

Then for each subarray, find Bitwise XOR of its maximum and second maximum element.

Find and return the maximum value of XOR among all subarrays.



Problem Constraints
2 <= N <= 105

1 <= A[i] <= 107



Input Format
The only argument is an integer array A.



Output Format
Return an integer, i.e., the maximum value of XOR of maximum and 2nd maximum element among all subarrays.



Example Input
Input 1:

 A = [2, 3, 1, 4]
Input 2:

 A = [1, 3]


Example Output
Output 1:

 7
Outnput 2:

 2


Example Explanation
Explanation 1:

 All subarrays of A having size greater than 1 are:
 Subarray            XOR of maximum and 2nd maximum no.
 1. [2, 3]           1
 2. [2, 3, 1]        1
 3. [2, 3, 1, 4]     7
 4. [3, 1]           2
 5. [3, 1, 4]        7
 6. [1, 4]           5
 So maximum value of Xor among all subarrays is 7.
Explanation 2:

 Only subarray is [1, 3] and XOR of maximum and 2nd maximum is 2.

*/

/*The subarray can only be reflected on its maximum element and second maximum element, so apparently,
there must be a lot of meaningless subarrays which we needn’t check them at all. But how can we skip them?
Maintain a monotone-decreasing-stack can help us.
While a new element came into the view, pop the top element in the stack, and check the corresponding interval, until the new element is greater than the top element in the stack. We can easily see it is correct since we won’t lost the answer as long as it exists.

*/