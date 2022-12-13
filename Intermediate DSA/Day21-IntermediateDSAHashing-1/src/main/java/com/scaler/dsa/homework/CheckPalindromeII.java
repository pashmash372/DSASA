package com.scaler.dsa.homework;



public class CheckPalindromeII {
    public int solve(String A) {
        int[] freq = new int[26];
        for (int i = 0; i < A.length(); i++)
            freq[A.charAt(i) - 97]++;
        int odd = 0;
        for (int a: freq)
            if (a % 2 == 1)
                odd++;
        if (odd > 1)
            return 0;
        return 1;
    }
}

/*Q2. Check Palindrome - II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A consisting of lowercase characters.

Check if characters of the given string can be rearranged to form a palindrome.

Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Problem Constraints
1 <= |A| <= 105

A consists only of lower-case characters.



Input Format
First argument is an string A.



Output Format
Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Example Input
Input 1:

 A = "abcde"
Input 2:

 A = "abbaee"


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No possible rearrangement to make the string palindrome.
Explanation 2:

 Given string "abbaee" can be rearranged to "aebbea" to form a palindrome.

*/

/*A set of characters can form a palindrome if at most one character occurs odd number of times and all characters occur even number of times.

We can do it in O(|A|) time using a count array.
Following are detailed steps.

Create a count array of alphabet size which is typically 26. Initialize all values of count array as 0.
Traverse the given string and increment count of every character.
Traverse the count array and if the count array has more than one odd values, return false. Otherwise return true.*/