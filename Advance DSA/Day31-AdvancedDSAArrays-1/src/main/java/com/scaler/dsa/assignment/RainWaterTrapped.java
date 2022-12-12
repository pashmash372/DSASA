package com.scaler.dsa.assignment;


public class RainWaterTrapped {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int n = A.length;
        int left = 0;
        int right = n - 1;
        int res = 0;
        int maxleft = 0, maxright = 0;
        while(left <= right){
            // When height of left side is lower, calculate height of water trapped in left bin else calculate for right bin
            if(A[left] <= A[right]){
                if(A[left] >= maxleft)
                    maxleft = A[left]; //This index wont store any water as there is no index towards the left whose height is greater than this.
                else
                    res += maxleft - A[left];
                left++;
            }
            else{
                if(A[right] >= maxright)
                    maxright = A[right]; //This index wont store any water as there is no index towards the right whose height is greater than this.
                else
                    res += maxright - A[right];
                right--;
            }
        }
        return res;
    }
}
/*Q1. Rain Water Trapped
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.



Problem Constraints
1 <= |A| <= 100000



Input Format
First and only argument is the vector A



Output Format
Return one integer, the answer to the question



Example Input
Input 1:

A = [0, 1, 0, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

1 unit is trapped on top of the 3rd element.
Explanation 2:

No water is trapped.
*/

/*Instead of calculating area by height*width, we can think it in a cumulative way.
In other words, we can sum the water amount of each bin(width=1).

Approach 1

We can keep 2 arrays ‘pre’ and ‘suf’. pre[i] is the maximum height for all i from 0 to i and suf[i] is the maximum height for all i from i to n-1.
Now for each i from 1 to n-2 (as no water can be stored at indexes 0 and 1) just add the maximum amount water that can be stored. The maximum amount of water that can be stored is the minimum of(max height towards left of i,max height towards right of i)-A[i]
i.e. min(pre[i-1],suf[i+1])-A[i]. But if min(pre[i-1],suf[i+1])-A[i]<0 we dont add anything. (i.e we add 0)

Time Complexity : O(n)
Auxiliary Spcae : O(n)

Can we do better than this? Is there way by which we can improve its auxiliary space?

Approach 2 (Most Efficient)

We can use the concept of two pointers.
Search from left to right and maintain a max height of left and right separately, which is like a one-side wall of a partial container. Fix the higher one and flow water
from the lower part. For example, if the current height of the left is lower, we fill water in the left bin. Until the left meets right,
we filled the whole container.

We will follow the below steps:

1) Maintain two variables ‘left’ and ‘right’ (‘left’ denotes the left pointer and ‘right’ denotes the right pointer) and initialize it to 0 and n-1 respectively.
2) Also maintain two variables ‘leftmax’ and ‘rightmax’ (‘leftmax’ denotes the maximum height till ‘left’ ( i.e. from 0 to left) and ‘rightmax’ denotes the maximum height till ‘right’(i.e. from right to n-1) ) and initialize both of them to 0.
3) while left <= right we have two possible conditions

Condition 1: leftmax<=rightmax
For the element at index left , we have already traversed from 0 to left , therefore leftmax is known. But rightmax of left'th index is not known. We only know the rightmax for right.
But we know that rightmax can only get bigger from right to left,and we already know that leftmax<=rightmax,  therefore leftmax of left <= rightmax of left.
Now we can simply add leftmax-A[left] , if this quantity is positive
otherwise change leftmax to A[left].
Increment left.

Condition 2: leftmax>rightmax
For the element at index right , we have already traversed from n-1 to right , therefore rightmax is known. But leftmax of right'th index is not known. We only know the leftmax for left.
But we know that leftmax can only get bigger from left to right, and we already know that leftmax>rightmax,  therefore rightmax of right < leftmax of right.
Now we can simply add rightmax-A[right] , if this quantity is positive
otherwise change rightmax to A[right].
decrement right
Time Complexity : O(n)
Auxiliary Spcae : O(1)*/