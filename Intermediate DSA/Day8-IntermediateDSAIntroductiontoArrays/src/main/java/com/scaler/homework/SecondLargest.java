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