package com.scaler.dsa.assignment;


public class SimpleReverse {
    public String solve(String A) {
        char[] s = A.toCharArray();
        int n = A.length();
        for(int i = 0; i < n/2; i++){
            char tmp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = tmp;
        }
        return new String(s);
    }
}
/*Q2. Simple Reverse
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A, you are asked to reverse the string and return the reversed string.



Problem Constraints
1 <= |A| <= 105

String A consist only of lowercase characters.



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the reversed string.



Example Input
Input 1:

 A = "scaler"
Input 2:

 A = "academy"


Example Output
Output 1:

 "relacs"
Output 2:

 "ymedaca"


Example Explanation
Explanation 1:

 Reverse the given string.

*/

/*One idea is to create new string, iterate A in reverse order
store each character in the new string.
Other is to do implace reverse operation on the string.
This can be done, by iterating the first half of the string,
let's say we are at index i then,
swap(A[i], A[n-i-1])
where n is the length of string.*/