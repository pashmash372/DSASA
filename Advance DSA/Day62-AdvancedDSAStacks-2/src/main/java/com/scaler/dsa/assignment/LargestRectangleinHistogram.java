package com.scaler.dsa.assignment;

import java.util.Stack;

public class LargestRectangleinHistogram {
    public int largestRectangleArea(int[] A) {
        Stack<Integer> stack = new Stack<Integer>();
        int ans = -1, n = A.length;
        for (int i = 0; i < A.length; i++) {
            while (!stack.empty() && A[i] < A[stack.peek()]) {
                int ind = stack.peek();
                stack.pop();
                // (stack.peek()+1) is the left and (i-1) is the right boundary of the rectangle with height A[ind]
                if (!stack.empty()) ans = Math.max(ans, (i - stack.peek() - 1) * A[ind]);
                else ans = Math.max(ans, i * A[ind]);
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            int ind = stack.peek();
            stack.pop();
            // (stack.peek()+1) is the left and (n-1) is the right boundary of the rectangle with height A[ind]
            if (!stack.empty()) ans = Math.max(ans, (n - stack.peek() - 1) * A[ind]);
            else ans = Math.max(ans, (n) * A[ind]);
        }
        return ans;
    }
}



/*Q2. Largest Rectangle in Histogram
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A.

A represents a histogram i.e A[i] denotes the height of the ith histogram's bar. Width of each bar is 1.

Find the area of the largest rectangle formed by the histogram.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 1000000000



Input Format
The only argument given is the integer array A.



Output Format
Return the area of the largest rectangle in the histogram.



Example Input
Input 1:

 A = [2, 1, 5, 6, 2, 3]
Input 2:

 A = [2]


Example Output
Output 1:

 10
Output 2:

 2


Example Explanation
Explanation 1:

The largest rectangle has area = 10 unit. Formed by A[3] to A[4].
Explanation 2:

Largest rectangle has area 2.
*/

/*We already know from our previous observation that when I traverse left, I only need entries in decreasing order.

We traverse all histograms from left to right and maintain a stack of histograms. Every histogram is pushed to stack once. A histogram is popped from the stack when a histogram of smaller height is seen. We calculate the area with the popped histogram as the smallest histogram when a histogram is popped. How do we get left and right indexes of the popped histogram – the current index tells us the ‘right index’ R, and the index of the previous item in the stack is the ‘left index’ L. Following is a rough pseudocode.

max_rectangle = 0
stack = an instance of empty stack
for index = 0 to all_histograms.length
    if stack.empty OR H[index] > H[stack.top]
        Push index to the stack
    if H[index] < H[stack.top]
        while !stack.empty && H[stack.top] > H[index]
            h = H[stack.pop]
            # Calculate the area with h as the smallest height.
            R = index
            L = stack.top
            max_rectangle = MAX(max_rectangle, (R - L - 1) * h)
        Push index to the stack
if stack is not empty
    Repeat removing entries one by one from the stack and calculating the max_rectangle as done earlier.*/