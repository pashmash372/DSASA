package com.scaler.dsa.homework;


import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
    public int[] nextGreater(int[] A) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        int n = A.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i = 1; i < n; i++) {
            if (s.isEmpty()) {
                s.push(i);
                continue;
            }
            // find the elements whose next greater element is A[i]
            while (!s.isEmpty() && A[s.peek()] < A[i]) {
                ans[s.peek()] = A[i];
                s.pop();
            }
            s.push(i);
        }
        return ans;
    }
}


/*Q1. Next Greater
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A, find the next greater element G[i] for every element A[i] in the array.
The next greater element for an element A[i] is the first greater element on the right side of A[i] in the array, A.

More formally:

G[i] for an element A[i] = an element A[j] such that
    j is minimum possible AND
    j > i AND
    A[j] > A[i]
Elements for which no greater element exists, consider the next greater element as -1.



Problem Constraints
1 <= |A| <= 105

1 <= A[i] <= 107



Input Format
The first and the only argument of input contains the integer array, A.



Output Format
Return an integer array representing the next greater element for each index in A.



Example Input
Input 1:

 A = [4, 5, 2, 10]
Input 2:

 A = [3, 2, 1]


Example Output
Output 1:

 [5, 10, 10, -1]
Output 2:

 [-1, -1, -1]


Example Explanation
Explanation 1:

For 4, the next greater element towards its right is 5.
For 5 and 2, the next greater element towards their right is 10.
For 10, there is no next greater element towards its right.
Explanation 2:

As the array is in descending order, there is no next greater element for all the elements.
*/

/*We can use a stack to find the next greater element.

Push the first element in the stack.
Pick rest of the elements one by one and follow the following steps in loop
Mark the current element as next.
If stack is not empty, compare top element of stack with next.
If next is greater than the top element, Pop element from stack. Next is the next greater element for the popped element.
Keep popping from the stack while the popped element is smaller than next. Next becomes the next greater element for all such popped elements.
Finally, push the next in the stack.
After the loop in step 2 is over, pop all the elements from stack and print -1 as next element for them.
Time Complexity:- O(N)
*/