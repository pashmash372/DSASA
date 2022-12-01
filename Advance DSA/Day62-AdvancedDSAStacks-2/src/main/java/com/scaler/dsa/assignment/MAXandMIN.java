package com.scaler.dsa.assignment;

import java.util.Stack;

public class MAXandMIN {
    int[] a;
    public void findNextGreaterElement(int[] Next_greater_element, int n){
        // this function calculates next_greater element index
        Stack < Integer > s = new Stack < Integer > ();
        for (int i = 0; i < n; i++) Next_greater_element[i + 1] = n + 1;
        for (int i = 1; i <= n; i++) {
            if (s.empty()) {
                s.push(i);
            } else {
                while (!s.empty() && a[s.peek()] <= a[i]) {
                    Next_greater_element[s.peek()] = i;
                    s.pop();
                }
                s.push(i);
            }
        }
    }
    public void findPreviousGreaterElement(int[] Previous_greater_element, int n){
        // this function calculates Previous_greater element index
        Stack < Integer > s = new Stack < Integer > ();
        for (int i = n; i > 0; i--) {
            if (s.empty()) {
                s.push(i);
            } else {
                while (!s.empty() && a[i] > a[s.peek()]) {
                    Previous_greater_element[s.peek()] = i;
                    s.pop();
                }
                s.push(i);
            }
        }
    }
    public void findPreviousSmallerElement(int[] Previous_smaller_element, int n){
        // this function calculates Previous smaller element index
        Stack < Integer > s = new Stack < Integer > ();
        for (int i = n; i > 0; i--) {
            if (s.empty()) {
                s.push(i);
            } else {
                while (!s.empty() && a[i] <= a[s.peek()]) {
                    Previous_smaller_element[s.peek()] = i;
                    s.pop();
                }
                s.push(i);
            }
        }
    }
    public void findNextSmallerElement(int[] Next_smaller_element, int n){
        // function function calculates Next smaller element index
        Stack < Integer > s = new Stack < Integer > ();
        for (int i = 0; i < n; i++) Next_smaller_element[i + 1] = n + 1;
        for (int i = 1; i <= n; i++) {
            if (s.empty()) {
                s.push(i);
            } else {
                while (!s.empty() && a[i] < a[s.peek()]) {
                    Next_smaller_element[s.peek()] = i;
                    s.pop();
                }
                s.push(i);
            }
        }
    }

    public int solve(int[] A) {
        int n = A.length, mod = 1000 * 1000 * 1000 + 7;
        a = new int[n + 1];
        int Next_greater_element[] = new int[n + 1];
        int Previous_greater_element[] = new int[n + 1];
        int Previous_smaller_element[] = new int[n + 1];
        int Next_smaller_element[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i + 1] = A[i];
        }

        findNextGreaterElement(Next_greater_element, n);
        findPreviousGreaterElement(Previous_greater_element, n);
        findPreviousSmallerElement(Previous_smaller_element, n);
        findNextSmallerElement(Next_smaller_element, n);

        long ans = 0;
        for (int i = 1; i <= n; i++) {
            long right = Next_greater_element[i] - i;
            long left = i - Previous_greater_element[i];
            ans += (((left * right) % mod) * a[i]) % mod;
            ans %= mod;
            left = i - Previous_smaller_element[i];
            right = Next_smaller_element[i] - i;
            ans -= (((left * right) % mod) * a[i]) % mod;
            ans += mod;
            ans %= mod;
        }
        return (int) ans;
    }
}


/*Q3. MAX and MIN
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A.

value of a array = max(array) - min(array).

Calculate and return the sum of values of all possible subarrays of A modulo 109+7.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 1000000



Input Format
The first and only argument given is the integer array A.



Output Format
Return the sum of values of all possible subarrays of A modulo 109+7.



Example Input
Input 1:

 A = [1]
Input 2:

 A = [4, 7, 3, 8]


Example Output
Output 1:

 0
Output 2:

 26


Example Explanation
Explanation 1:

Only 1 subarray exists. Its value is 0.
Explanation 2:

value ( [4] ) = 4 - 4 = 0
value ( [7] ) = 7 - 7 = 0
value ( [3] ) = 3 - 3 = 0
value ( [8] ) = 8 - 8 = 0
value ( [4, 7] ) = 7 - 4 = 3
value ( [7, 3] ) = 7 - 3 = 4
value ( [3, 8] ) = 8 - 3 = 5
value ( [4, 7, 3] ) = 7 - 3 = 4
value ( [7, 3, 8] ) = 8 - 3 = 5
value ( [4, 7, 3, 8] ) = 8 - 3 = 5
sum of values % 10^9+7 = 26
*/


/*Calculate the next greater element and previous greater element for each element in the array. Each element Ai is the maximum of all subarrays starting at (previous greater element)i + 1 to (next greater element)i - 1.

Similarly, the next smaller element and previous smaller element can be used for minimum values of subarrays

Time Complexity:- O(N)
*/