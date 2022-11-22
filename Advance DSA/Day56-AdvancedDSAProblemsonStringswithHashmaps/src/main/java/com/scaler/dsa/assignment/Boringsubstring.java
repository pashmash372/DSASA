package com.scaler.dsa.assignment;

import java.util.Arrays;

public class Boringsubstring {
    public boolean check(String s) {
        boolean ok = true;
        for (int i = 0; i + 1 < s.length(); i++) {
            ok &= (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1);
        }
        return ok;
    }

    public int solve(String A) {
        String odd = "", even = "";
//        odd and even stores odd and even characters respective
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (c % 2 == 0) odd += c;
            else even += c;
        }
        char[] ar = odd.toCharArray();
        Arrays.sort(ar);
        odd = String.valueOf(ar);
        ar = even.toCharArray();
        Arrays.sort(ar);
        even = String.valueOf(ar);
//        check if either (odd + even) or (even + odd) has no boring substrings
        if (check(odd + even)) return 1;
        else if (check(even + odd)) return 1;
        return 0;

    }
}


/*Q1. Boring substring
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a string A of lowercase English alphabets. Rearrange the characters of the given string A such that there is no boring substring in A.

A boring substring has the following properties:

Its length is 2.
Both the characters are consecutive, for example - "ab", "cd", "dc", "zy" etc.(If the first character is C then the next character can be either (C+1) or (C-1)).
Return 1 if it is possible to rearrange the letters of A such that there are no boring substrings in A else, return 0.



Problem Constraints
1 <= |A| <= 105



Input Format
The only argument given is a string A.



Output Format
Return 1 if it is possible to rearrange the letters of A such that there are no boring substrings in A else, return 0.



Example Input
Input 1:

 A = "abcd"
Input 2:

 A = "aab"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 String A can be rearranged into "cadb" or "bdac"
Explanation 2:

 No arrangement of string A can make it free of boring substrings.
*/


/*No specific knowledge is required to solve this question.
You need to observe and find an existing pattern hidden in the parities of ASCII value of characters.

‘a’ could be present near ‘c’ , similarly ‘c’ could be near ‘e’ as we can see odd characters can be put aside each other, and there will be no boring substring in it.

Like: “acegik…” No boring substring is present in this string.

Similarly for even characters.

Now traverse in the string and form two strings, one containing the odd characters and the other even characters.
Sort both of them and check if placing them together doesn’t make a boring substring at their join point.

For example:
A = “abcdefg”
So ,
odd = “aceg”
even= “bdf”

Check the string s = odd+even or s=even+odd doesn’t contain any boring substring.

Time Complexity: O(	A	)
*/