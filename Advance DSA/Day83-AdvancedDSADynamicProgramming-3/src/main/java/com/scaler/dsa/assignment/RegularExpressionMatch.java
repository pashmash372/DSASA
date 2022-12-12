package com.scaler.dsa.assignment;


public class RegularExpressionMatch {
    public int isMatch(final String s, final String p) {
        boolean[][] d = new boolean[s.length() + 1][p.length() + 1];
        d[0][0] = true;
        if (p.charAt(0) == '*') {
            d[0][1] = true;
        }
        for (int i = 0; i < p.length(); ++i) {
            if (p.charAt(i) == '*') {
                d[0][i + 1] = d[0][i];
                for (int j = 0; j < s.length(); ++j) {
                    d[j + 1][i + 1] = d[j][i] || d[j + 1][i] || d[j][i + 1];
                }
            } else if (p.charAt(i) == '?') {
                for (int j = s.length() - 1; j >= 0; --j) {
                    d[j + 1][i + 1] = d[j][i];
                }
            } else {
                for (int j = 0; j < s.length(); ++j) {
                    if (p.charAt(i) == s.charAt(j)) {
                        d[j + 1][i + 1] = d[j][i];
                    }
                }
            }
        }
        return d[s.length()][p.length()] ? 1 : 0;
    }
}

/*Q3. Regular Expression Match
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Implement wildcard pattern matching with support for ' ? ' and ' * ' for strings A and B.

' ? ' : Matches any single character.
' * ' : Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).



Problem Constraints
1 <= length(A), length(B) <= 104



Input Format
The first argument of input contains a string A.
The second argument of input contains a string B.



Output Format
Return 1 if the patterns match else return 0.



Example Input
Input 1:

 A = "aaa"
 B = "a*"
Input 2:

 A = "acz"
 B = "a?a"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 Since '*' matches any sequence of characters. Last two 'a' in string A will be match by '*'.
 So, the pattern matches we return 1.
Explanation 2:

 '?' matches any single character. First two character in string A will be match.
 But the last character i.e 'z' != 'a'. Return 0.*/

/*Think about the bruteforce solution.

When you encounter ‘*’, you would try to call the same isMatch function in the following manner:

If p[0] == ‘*’, then isMatch(s, p) is true if isMatch(s+1, p) is true OR isMatch(s, p+1) is true.

else if p[0] is not ‘*’ and the characters s[0] and p[0] match ( or p[0] is ‘?’ ), then isMatch(s,p) is true only if isMatch(s+1, p+1) is true.
If the characters don’t match isMatch(s, p) is false.

This appraoch is exponential. Think why.
Lets see how we can make this better. Note that isMatch function can only be called with suffixes of s and p. As such, there could only be length(s) * length(p) unique calls to isMatch. Lets just memoize the result of the calls so we only do processing for unique calls. This makes the time and space complexity O(len(s) * len(p)).

There could be ways of optimizing the approach rejecting certain suffixes without processing them. For example, if len(non star characters in p) > len(s), then we can return false without checking anything.*/

/**/