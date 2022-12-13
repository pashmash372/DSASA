package com.scaler.dsa.assignment;


public class CyclicPermutations {
    public int solve(String A, String B) {
        // append B to B to tackle cyclic permutations
        B += B;
        int n = A.length(), m = B.length();
        int lps[] = new int[n];
        computeLPS(lps, A);
        int i = 0, l = 0, ans = 0;
        while (i < m - 1) {
            if (B.charAt(i) == A.charAt(l)) {
                i++;
                l++;
            }
            if (l == n) {
                l = lps[l - 1];
                ans++;
            } else if (i < m && B.charAt(i) != A.charAt(l)) {
                if (l > 0) {
                    l = lps[l - 1];
                } else {
                    i++;
                }
            }
        }
        return ans;
    }

    // function used to longest proper suffix array
    public void computeLPS(int lps[], String s) {
        int n = s.length();
        lps[0] = 0;
        int l = 0, i = 1;
        while (i < n) {
            if (s.charAt(i) == s.charAt(l)) {
                lps[i] = l + 1;
                i++;
                l++;
            } else {
                if (l > 0) {
                    l = lps[l - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}

/*Q1. Cyclic Permutations
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two binary strings A and B, count how many cyclic shift of B when taken XOR with A give 0.

NOTE: If there is a string, S0, S1, ... Sn-1 , then it is a cyclic shift is of the form Sk, Sk+1, ... Sn-1, S0, S1, ... Sk-1 where k can be any integer from 0 to N-1.



Problem Constraints
1 ≤ length(A) = length(B) ≤ 105



Input Format
The first argument is a string A.
The second argument is a string B.



Output Format
Return an integer denoting the required answer.



Example Input
Input 1:

 A = "1001"
 B = "0011"
Input 2:

 A = "111"
 B = "111"


Example Output
Output 1:

 1
Output 2:

 3


Example Explanation
Explanation 1:

 4 cyclic shifts of B exists: "0011", "0110", "1100", "1001".
 There is only one cyclic shift of B i.e. "1001" which has 0 xor with A.
Explanation 2:

 All cyclic shifts of B are same as A and give 0 when taken xor with A. So, the ans is 3.*/

/*We know that the Xor of two elements is zero only when both the elements are equal.

We have to check if the A == B or not. To overcome the cyclic shift problem, we can append the string A[0:len(A)-1] to A

For example : if A = “abc”, After appending the string A[0:len(A)-1] to A, A becomes “abcab”.

Now, we have to find the number of occurrences of the string B in string A. We can use any string matching algorithm like the KMP Z algorithm to find the number of occurrences

Time Complexity : O(N + M)
Space Complexity : O(N + M)
where N = length of A and M = length of B*/