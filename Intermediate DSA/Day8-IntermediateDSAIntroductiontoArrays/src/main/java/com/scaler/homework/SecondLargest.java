package com.scaler.homework;

public class SecondLargest {
    public int solve(int[] A) {
        int index = 0, n = A.length;
        for(int i = 1; i < n; i++){
            if(A[i] > A[index]){
                index = i;
            }
        }

        int ans = -1;
        for(int i = 0; i < n; i++){
            if(A[i] != A[index]){
                ans = Math.max(ans, A[i]);
            }
        }

        return ans;
    }
}

  class SecondLargest1 {
    public int solve(int[] A) {
        int max = A[0];
        int secMax = -1;
//find out the max first
        for(int i=0;i<A.length;i++) {
            if(A[i] > max) {
                max = A[i];
            }
        }
//find out the maximum again excluding the max value found in above iteration
        for(int i=0;i<A.length;i++) {
            if(A[i]!=max && A[i] > secMax) {
                secMax = A[i];
            }
        }
        return secMax;
    }
}

/*Q2. Second Largest
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.


Problem Constraints
1 <= |A| <= 105

0 <= A[i] <= 109



Input Format
The first argument is an integer array A.



Output Format
Return the second largest element. If no such element exist then return -1.



Example Input
Input 1:

 A = [2, 1, 2]
Input 2:

 A = [2]


Example Output
Output 1:

 1
Output 2:

 -1


Example Explanation
Explanation 1:

 First largest element = 2
 Second largest element = 1
Explanation 2:

 There is no second largest element in the array.

*/

/*First, we iterate over each element in the list and find the largest element. Let’s say max_elem.
Then, we again iterate over each element in the list using a for loop and find the largest element, but we also check if that element is equal to max_elem, if it is we skip it.*/