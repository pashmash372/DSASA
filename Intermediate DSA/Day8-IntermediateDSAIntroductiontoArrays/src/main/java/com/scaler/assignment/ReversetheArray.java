package com.scaler.assignment;


public class ReversetheArray {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A) {
        int n = A.length;
        int []ans = new int[n];
        for(int i = 0; i < n; i++) ans[i] = A[n - i - 1];
        return ans;
    }
}


/*Q4. Reverse the Array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a constant array A.

You are required to return another array which is the reversed form of the input array.



Problem Constraints
1 <= A.size() <= 10000

1 <= A[i] <= 10000



Input Format
First argument is a constant array A.



Output Format
Return an integer array.



Example Input
Input 1:

A = [1,2,3,2,1]
Input 2:

A = [1,1,10]


Example Output
Output 1:

 [1,2,3,2,1]
Output 2:

 [10,1,1]


Example Explanation
Explanation 1:

Reversed form of input array is same as original array
Explanation 2:

Clearly, Reverse of [1,1,10] is [10,1,1]



See Expected Output*/

/*Let N be the size of the input array.
First of all, initialize an output array of size equal to N.
Then, iterate over the input array given in the function.
Inside the loop make output[i] = input[N-i-1], where N is the size of the input array.
After that, just return the output array from the function.*/