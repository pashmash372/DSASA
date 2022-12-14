package com.scaler.dsa.homework;


public class Findsubsequence {
    public String solve(String A, String B) {
        int m = A.length();
        int n = B.length();
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(A.charAt(i) == B.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        if(i == m)
        {
            return "YES";
        }
        return "NO";
    }
}

/*Q3. Find subsequence
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given two strings A and B, find if A is a subsequence of B.

Return "YES" if A is a subsequence of B, else return "NO".


Input Format

The first argument given is the string A.
The second argument given is the string B.
Output Format

Return "YES" if A is a subsequence of B, else return "NO".
Constraints

1 <= lenght(A), length(B) <= 100000
'a' <= A[i], B[i] <= 'z'
For Example

Input 1:
    A = "bit"
    B = "dfbkjijgbbiihbmmt"
Output 1:
    YES

Input 2:
    A = "apple"
    B = "appel"
Output 2:
    "NO"*/


/*1. Traverse both A and B from left to right. If we find a matching character, we move ahead in both strings. Otherwise, we move ahead only in B.
2. if A finishes first, return "YES"
3. Else return "NO"*/