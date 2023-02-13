package com.scaler.dsa.assignement;


public class Deleteone {
    public int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    public int[] suffixGCD(int[] A) {
        int n = A.length;
        int[] suf = new int[n];
        int g = 0;
        for (int i = n - 1; i >= 0; i--) {
            g = gcd(g, A[i]);
            suf[i] = g;
        }
        return suf;
    }

    public int solve(int[] A) {
        int n = A.length, ans = 1;
        // suf stores the suffix gcd of the array
        int[] suf = suffixGCD(A);
        int curGcd = 0;
        for (int i = 0; i < n; i++) {
            if (i != n - 1) ans = Math.max(ans, gcd(suf[i + 1], curGcd));
            else ans = Math.max(ans, curGcd);
            curGcd = gcd(curGcd, A[i]);
        }
        return ans;
    }
}
/*Java| using prefix and suffix GCD array*/

class Deleteone1 {
    public static int gcd(int a, int b) {
        //base codition
        if (b == 0) return a;

        return gcd(b, a % b);
    }

    //method to find GCD of 2 numbers

    public int solve(int[] A) {
        int n = A.length;
        int[] prefixGCD = new int[n];
        int[] suffixGCD = new int[n];

        //Creating the prefix GCD Array
        prefixGCD[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefixGCD[i] = gcd(prefixGCD[i - 1], A[i]);
        }

        //Creating the suffix GCD Array
        suffixGCD[n - 1] = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixGCD[i] = gcd(suffixGCD[i + 1], A[i]);
        }

        //if 1st array element is removed
        int zero = suffixGCD[1];
        //if last element is removed
        int last = prefixGCD[n - 2];

        int ans = Math.max(zero, last);

        //if any of the element from index 1 to n-2 is removed
        for (int i = 1; i < n - 1; i++) {
            int temp = gcd(prefixGCD[i - 1], suffixGCD[i + 1]);
            ans = Math.max(temp, ans);
        }

        return ans;
    }
}



/*Q1. Delete one
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.

Find the maximum value of GCD.



Problem Constraints

2 <= N <= 105
1 <= A[i] <= 109



Input Format

First argument is an integer array A.



Output Format

Return an integer denoting the maximum value of GCD.



Example Input

Input 1:

 A = [12, 15, 18]
Input 2:

 A = [5, 15, 30]


Example Output

Output 1:

 6
Output 2:

 15


Example Explanation

Explanation 1:


 If you delete 12, gcd will be 3.
 If you delete 15, gcd will be 6.
 If you delete 18, gcd will 3.
 Maximum vallue of gcd is 6.
Explanation 2:

 If you delete 5, gcd will be 15.
 If you delete 15, gcd will be 5.
 If you delete 30, gcd will be 5.*/

/*We can maintain two arrays for prefix and suffix gcd; likewise, we do for prefix sum and suffix sum.
Then,for each index, i:1 to N calculate gcd(prefix[i-1],suffix[i+1]) and return the maximum among all.*/