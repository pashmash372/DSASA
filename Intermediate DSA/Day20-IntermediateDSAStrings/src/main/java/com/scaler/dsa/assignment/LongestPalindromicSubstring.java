package com.scaler.dsa.assignment;


public class LongestPalindromicSubstring {
    public String expandAroundCenter(String s, int c1, int c2) {
        int l = c1, r = c2;
        int n = s.length();
        while (l >= 0 && r <= n - 1 && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
    public String longestPalindrome(String A) {
        int n = A.length();
        if (n == 0)
            return "";
        String longest = A.substring(0, 1); // a single char itself is a palindrome
        for (int i = 0; i < n - 1; i++) {
            String p1 = expandAroundCenter(A, i, i);
            if (p1.length() > longest.length())
                longest = p1;
            String p2 = expandAroundCenter(A, i, i + 1);
            if (p2.length() > longest.length())
                longest = p2;
        }
        return longest;
    }
}

/*Q7. Longest Palindromic Substring
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).



Problem Constraints
1 <= N <= 6000



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the longest palindromic substring of string A.



Example Input
A = "aaaabaaa"


Example Output
"aaabaaa"


Example Explanation
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".*/


/*A simpler approach, O(N2) time and O(1) space:

In fact, we could solve it in O(N2) time without any extra space.

We observe that a palindrome mirrors around its center. Therefore, a palindrome can be expanded from its center, and there are only 2N-1 such centers.

You might be asking why there are 2N-1 but not N centers?

The reason is that the center of a palindrome can be in between two letters.

Such palindromes have even number of letters (such as “abba”) and their center are between the two ‘b’s.

Since expanding a palindrome around its center could take O(N) time, the overall complexity is O(N2).*/