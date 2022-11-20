package com.scaler.homework;


public class MakeStringPalindrome {
    public int solve(String A) {
        String s = A;
        StringBuilder sb = new StringBuilder(A);
        s += sb.reverse();
        int[] lps;
        // lps array contains the longest prefix, which is also a suffix
        lps = computeLPS(s);
        return Math.max(A.length() - lps[s.length() - 1], 0);
    }

    public int[] computeLPS(String s) {
        int l = 0, i = 1;
        int[] lps = new int[s.length()];
        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(l)) {
                lps[i] = ++l;
                i++;
            } else {
                if (l > 0) {
                    l = lps[l - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}



/*Q3. Make String Palindrome
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A of size N consisting only of lowercase alphabets. The only operation allowed is to insert characters in the beginning of the string.

Find and return how many minimum characters are needed to be inserted to make the string a palindrome string.



Problem Constraints
1 <= N <= 106



Input Format
The only argument given is a string A.



Output Format
Return an integer denoting the minimum characters needed to be inserted in the beginning to make the string a palindrome string.



Example Input
Input 1:

 A = "abc"
Input 2:

 A = "bb"


Example Output
Output 1:

 2
Output 2:

 0


Example Explanation
Explanation 1:

 Insert 'b' at beginning, string becomes: "babc".
 Insert 'c' at beginning, string becomes: "cbabc".
Explanation 2:

 There is no need to insert any character at the beginning as the string is already a palindrome. */


/*Each index of the LPS array contains the longest prefix, which is also a suffix. Now take the string and reverse of a string and combine them with a sentinel character in between them and compute the LPS array of this combined string. Now take the last value of the LPS array and subtract it from the length of the original string. This will give us the minimum number of insertions required at the beginning of the string.

 */