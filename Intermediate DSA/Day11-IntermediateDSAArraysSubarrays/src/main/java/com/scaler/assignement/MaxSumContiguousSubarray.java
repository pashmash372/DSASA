package com.scaler.assignement;

import java.util.List;

public class MaxSumContiguousSubarray {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int curSum = 0; //is the maximum sum ending at any given index i
        int maxSum = Integer.MIN_VALUE; // maximum subarray sum for all subarrays till now
        for (int num : A) {
            curSum += num;
            maxSum = Math.max(maxSum, curSum);
            if (curSum < 0) curSum = 0;
        }
        return maxSum;
    }
}


/*Q1. Max Sum Contiguous Subarray
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.



Problem Constraints
1 <= N <= 1e6
-1000 <= A[i] <= 1000



Input Format
The first and the only argument contains an integer array, A.



Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.



Example Input
Input 1:

 A = [1, 2, 3, 4, -10]
Input 2:

 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]


Example Output
Output 1:

 10
Output 2:

 6


Example Explanation
Explanation 1:

 The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
Explanation 2:

 The subarray [4,-1,2,1] has the maximum possible sum of 6.
*/

/*Let us say Ai, Ai+1 … Aj is our optimal solution.

Note that no prefix of the solution will ever have a negative sum.

Let us say Ai … Ak prefix had a negative sum.

Sum ( Ai Ai+1 … Aj ) = Sum (Ai … Ak) + Sum(Ak+1 … Aj)

Sum ( Ai Ai+1 … Aj) - Sum(Ak+1 … Aj) = Sum(Ai … Ak)

Now, since Sum(Ai … Ak) < 0,

Sum (Ai Ai+1 … Aj) - Sum (Ak+1 … Aj) < 0

which means Sum(Ak+1 … Aj ) > Sum (Ai Ai+1 … Aj)

This contradicts the fact that Ai, Ai+1 … Aj is our optimal solution.

Instead, Ak+1, Ak+2 … Aj will be our optimal solution.

Similarly, you can prove that it is always good to include a prefix with a positive sum for the optimal solution.

Try to come up with a solution based on the previous 2 facts.

Here’s one Approach.
Keep two variables ‘curSum’ and ‘maxSum’ which denotes the current sum ending at the given position and the maximum sum of a subarray respectively.
Iterate through the array , at every index we will add the current element to our curSum , after this we can update the maxSum as max(maxSum,curSum), After this we can just check if curSum is less than 0 , if it is then just replace curSum with 0.

Time Complexity : O(n)
Space Complexity(extra) : O(1)
If this still does not make sense, watch this video for a more detailed explanation :*/