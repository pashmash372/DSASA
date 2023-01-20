package com.scaler.dsa.assignment;


public class Lengthoflongestconsecutiveones {
    public static int maximum_one(String s) {
        // To count all 1's in the string
        int cnt_one = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') cnt_one++;
        }
        // To store cumulative 1's
        int[] left = new int[n];
        int[] right = new int[n];
        if (s.charAt(0) == '1') left[0] = 1;
        else left[0] = 0;

        if (s.charAt(n - 1) == '1') right[n - 1] = 1;
        else right[n - 1] = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == '1') left[i] = left[i - 1] + 1;
            else left[i] = 0;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '1') right[i] = right[i + 1] + 1;

            else right[i] = 0;
        }

        int cnt = 0, max_cnt = 0;
        for (int i = 0; i < n; ++i)
            max_cnt = Math.max(max_cnt, Math.max(right[i], left[i]));
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                int sum = left[i - 1] + right[i + 1];

                if (sum < cnt_one) cnt = sum + 1; // 0 replaced with 1 resulting 1 addition to total 1's

                else cnt = sum; // this is to handle 1 test case

                max_cnt = Math.max(max_cnt, cnt);
                cnt = 0;
            }
        }

        return max_cnt;
    }

    public int solve(String A) {
        return maximum_one(A);

    }

}

/*Tc: o(n^2) sc: o(1)*/
class Lengthoflongestconsecutiveones1 {

    public int solve(String A) {
        //Using middle index approach
        int count = 0, one = 0;
        //Counting the number of 1 present in total
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '1') one++;
        }

        for (int i = 0; i < A.length(); i++) {
            int left = 0, right = 0;
            //finding the number of 1 on the Left side
            for (int j = i - 1; j >= 0; j--) {
                if (A.charAt(j) == '0') break;
                else left++;
            }
            //Finding the number of 1 on the Right side
            for (int j = i + 1; j < A.length(); j++) {
                if (A.charAt(j) == '0') break;
                else right++;
            }
            int sum = left + right + 1; //Total size of the array: (1's on left) + (1's on Right) + Current Index;
            if (sum > count) count = sum;
        }
        if (count > one) return one;//For the cases such as 000111
        return count;
    }

}


/*Q1. Length of longest consecutive ones
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


Input Format

The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7*/


/*
character backgroundcharacter
Solution Approach
Create two arrays which store the number of consecutive ones on the right and left of all indexes.

Now, for each index x having character ‘0’, the answer will be the maximum of answer and left consecutive ones of (x-1) + right consecutive ones of (x+1) + 1 if there is extra 1 other then these, else left consecutive ones of (x-1) + right consecutive ones of (x+1)

Time Complexity : O(n)
Space Complexity : O(n)*/