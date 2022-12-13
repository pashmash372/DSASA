package com.scaler.homework;

public class Productarraypuzzle {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        pref[0] = A[0];
        for(int i = 1 ; i < n ; i++){
            pref[i] = pref[i - 1] * A[i];
        }
        suff[n - 1] = A[n - 1];
        for(int i = n - 2 ; i >= 0 ; i--){
            suff[i] = suff[i + 1] * A[i];
        }
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(i == 0){
                ans[i] = suff[i + 1];
            }
            else if(i == n - 1){
                ans[i] = pref[i - 1];
            }
            else{
                ans[i] = pref[i - 1] * suff[i + 1];
            }
        }
        return ans;
    }
}


/*Q2. Product array puzzle
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.

Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.


Input Format

The only argument given is the integer array A.
Output Format

Return the product array.
Constraints

2 <= length of the array <= 1000
1 <= A[i] <= 10
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [120, 60, 40, 30, 24]

Input 2:
    A = [5, 1, 10, 1]
Output 2:
    [10, 50, 5, 50]*/


/*We will have a prefix array pref[] where pref[i] will store the
multiplication of all the elements in the prefix of the array till
i-th position. Similar we will have a suffix array suff[].
Now for the i-th element, we can find the multiplication of all the
elements to it's left from the pref[] array and that in the right side
from the suff[] array

Time Complexity : O(N)
Space Complexity : O(N)*/