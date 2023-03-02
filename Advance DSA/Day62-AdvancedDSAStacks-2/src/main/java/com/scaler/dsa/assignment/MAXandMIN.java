package com.scaler.dsa.assignment;

import java.util.Arrays;
import java.util.Stack;

public class MAXandMIN {
    int[] a;

    public void findNextGreaterElement(int[] Next_greater_element, int n) {
        // this function calculates next_greater element index
        Stack<Integer> s = new Stack<Integer>();
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

    public void findPreviousGreaterElement(int[] Previous_greater_element, int n) {
        // this function calculates Previous_greater element index
        Stack<Integer> s = new Stack<Integer>();
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

    public void findPreviousSmallerElement(int[] Previous_smaller_element, int n) {
        // this function calculates Previous smaller element index
        Stack<Integer> s = new Stack<Integer>();
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

    public void findNextSmallerElement(int[] Next_smaller_element, int n) {
        // function function calculates Next smaller element index
        Stack<Integer> s = new Stack<Integer>();
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
        int[] Next_greater_element = new int[n + 1];
        int[] Previous_greater_element = new int[n + 1];
        int[] Previous_smaller_element = new int[n + 1];
        int[] Next_smaller_element = new int[n + 1];
        System.arraycopy(A, 0, a, 1, n);

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
/**/

class MAXandMIN1 {
    int mod = (int) 1e9 + 7;

    public int solve(int[] A) {
        int n = A.length;
        if (n == 1) return A[0];

        int[] nsl = nearestSmallerLeft(A);
        int[] nsr = nearestSmallerRight(A);
        int[] ngl = nearestGreaterLeft(A);
        int[] ngr = nearestGreaterRight(A);

        long totalMax = 0L, totalMin = 0L;

        for (int i = 0; i < n; i++) {
            //number of subarrays where A[i] will be maximum
            long maxSubarrayCount = (long) (ngr[i] - i) * (i - ngl[i]);
            long currentMaxContri = (A[i] * maxSubarrayCount) % mod;

            //number of subarrays where A[i] will be minimum
            long minSubarrayCount = (long) (nsr[i] - i) * (i - nsl[i]);
            long currentMinContri = (A[i] * minSubarrayCount) % mod;

            //generating total max contribution and minimum contribution
            totalMax = ((currentMaxContri % mod) + (totalMax % mod)) % mod;
            totalMin = ((currentMinContri % mod) + (totalMin % mod)) % mod;
        }

        int sum = (int) (totalMax - totalMin) % mod;
        return (sum + mod) % mod;
    }

    public int[] nearestSmallerLeft(int[] a) {
        Stack<Integer> cl = new Stack<>();
        int[] ans = new int[a.length];
        Arrays.fill(ans, -1);

        for (int i = 0; i < a.length; i++) {
            while (!cl.isEmpty() && a[cl.peek()] >= a[i]) {
                cl.pop();
            }
            if (!cl.isEmpty()) {
                ans[i] = cl.peek();
            }
            cl.push(i);
        }

        return ans;
    }

    public int[] nearestSmallerRight(int[] a) {
        int n = a.length;
        Stack<Integer> cl = new Stack<>();
        int[] ans = new int[a.length];
        Arrays.fill(ans, n);

        for (int i = a.length - 1; i >= 0; i--) {
            while (!cl.isEmpty() && a[cl.peek()] >= a[i]) {
                cl.pop();
            }
            if (!cl.isEmpty()) {
                ans[i] = cl.peek();
            }
            cl.push(i);
        }

        return ans;
    }

    public int[] nearestGreaterLeft(int[] a) {
        Stack<Integer> cl = new Stack<>();
        int[] ans = new int[a.length];
        Arrays.fill(ans, -1);

        for (int i = 0; i < a.length; i++) {
            while (!cl.isEmpty() && a[cl.peek()] <= a[i]) {
                cl.pop();
            }
            if (!cl.isEmpty()) {
                ans[i] = cl.peek();
            }
            cl.push(i);
        }

        return ans;
    }

    public int[] nearestGreaterRight(int[] a) {
        int n = a.length;
        Stack<Integer> cl = new Stack<>();
        int[] ans = new int[a.length];
        Arrays.fill(ans, n);

        for (int i = a.length - 1; i >= 0; i--) {
            while (!cl.isEmpty() && a[cl.peek()] <= a[i]) {
                cl.pop();
            }
            if (!cl.isEmpty()) {
                ans[i] = cl.peek();
            }
            cl.push(i);
        }

        return ans;
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