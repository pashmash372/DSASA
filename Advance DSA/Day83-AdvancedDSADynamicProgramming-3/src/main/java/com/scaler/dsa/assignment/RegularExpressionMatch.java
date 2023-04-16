package com.scaler.dsa.assignment;


public class RegularExpressionMatch {

    /* best possible solution */
    public static int isMatch(final String s, final String p) {
        /* s -> string p -> pattern */
        int N = s.length();
        int M = p.length();
        boolean[][] d = new boolean[N + 1][M + 1]; // y axis -> string , x axis - > pattern

        d[0][0] = true;

        if (p.charAt(0) == '*') { // handle edge case where pattern starts with '*'
            d[0][1] = true;
        }

        for (int i = 0; i < M; i++) { // column wise traversal right direction

            if (p.charAt(i) == '*') {
                d[0][i + 1] = d[0][i];
                for (int j = 0; j < N; ++j) { // row wise traversal downward direction
                    d[j + 1][i + 1] = d[j][i] || d[j + 1][i] || d[j][i + 1];
                }
            } else if (p.charAt(i) == '?') {
                for (int j = N - 1; j >= 0; --j) { // row wise traversal upward direction
                    d[j + 1][i + 1] = d[j][i];
                }
            } else {
                for (int j = 0; j < N; ++j) { // row wise traveral downward direction
                    if (p.charAt(i) == s.charAt(j)) { // string letter matches with pattern letter
                        d[j + 1][i + 1] = d[j][i];
                    }
                }
            }
        }
        return d[N][M] ? 1 : 0;
    }

    public static void main(String[] args) {

        String s="ac";
        String p="ab*c";
        System.out.println(isMatch(s, p));
    }
}
class RegularExpressionMatch1 {
    public static boolean isMatch(String s, String p) {

        if (s == null || p == null) {
            return false;
        }
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = true;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == '.') {
                    dp[i + 1][j + 1] = dp[i][j];
                }
                if (p.charAt(j) == s.charAt(i)) {
                    dp[i + 1][j + 1] = dp[i][j];
                }
                if (p.charAt(j) == '*') {
                    if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    } else {
                        dp[i + 1][j + 1] = (dp[i + 1][j] || dp[i][j + 1] || dp[i + 1][j - 1]);
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }

    public static void main(String[] args) {
        String s="ac";
        String p="ab*c";
        System.out.println(isMatch(s, p));
    }
}

/* Another solution */



/* Another solution  best solution for this question*/



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