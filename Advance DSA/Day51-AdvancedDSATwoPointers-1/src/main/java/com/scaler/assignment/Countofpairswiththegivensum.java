package com.scaler.assignment;

public class Countofpairswiththegivensum {
    public int solve(int[] a, int b) {
        int ans = 0, l = 0, r = a.length - 1;
        while (l < r) {
            if (a[l] + a[r] == b) ans++;
            if (a[l] + a[r] <= b) l++;
            else r--;
        }
        return ans;
    }
}


/*6. Count of pairs with the given sum
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given a sorted array of distinct integers A and an integer B, find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.


Input Format

The first argument given is the integer array A.
The second argument given is integer B.
Output Format

Return the number of pairs for which sum is equal to B.
Constraints

1 <= length of the array <= 100000
1 <= A[i] <= 10^9
1 <= B <= 10^9
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
    B = 5
Output 1:
    2

Input 2:
    A = [5, 10, 20, 100, 105]
    B = 110
Output 2:
    2*/