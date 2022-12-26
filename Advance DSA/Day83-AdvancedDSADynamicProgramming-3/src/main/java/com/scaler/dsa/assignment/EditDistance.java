package com.scaler.dsa.assignment;


import java.util.Arrays;

public class EditDistance {
    private int[][] dp;
    private String A, B;

    public int minDistance(String A, String B) {
        if (A == null && B == null) return 0;
        int nA, nB;
        nA = A.length();
        nB = B.length();
        if (nA == 0) return nB;
        if (nB == 0) return nA;
        dp = new int[nA][nB];
        this.A = A; // global
        this.B = B; // global
        for (int i = 0; i < nA; i++)
            Arrays.fill(dp[i], -1); // intialized to -1
        int res = rec(nA - 1, nB - 1); // start from end of A and B indices
        return res;
    }

    public int rec(int iA, int iB) {
        if (iA < 0 && iB < 0) // out of bound
            return 0;
        if (iA < 0) return iB + 1; // plus 1 add because index are 0 based idx
        if (iB < 0) return iA + 1; // plus 1 add because index are 0 based idx
        if (dp[iA][iB] != -1) return dp[iA][iB];  // already computed

        int res = Integer.MAX_VALUE; // for min possible answer

        if (A.charAt(iA) == B.charAt(iB)) res = rec(iA - 1, iB - 1); // when both letters match

        int temp = 1 + rec(iA - 1, iB - 1); // for replace
        temp = Math.min(temp, 1 + rec(iA - 1, iB));  // for delete
        temp = Math.min(temp, 1 + rec(iA, iB - 1)); // for insert
        res = Math.min(res, temp); // mininum of all
        return dp[iA][iB] = res;
    }
}

/* another solution */

class EditDistance1 {
    public int minDistance(String A, String B) {

        if (A.length() < B.length()) return minDistance(B, A); // for good measure

        int A_len = A.length();
        int B_len = B.length();

        int[] first_arr = new int[B_len + 1];
        int[] second_arr = new int[B_len + 1];

        for (int i = 0; i <= B_len; i++) {
            first_arr[i] = i;
        }

        for (int i = 1; i <= A_len; i++) {
            for (int j = 0; j <= B_len; j++) {
                if (j == 0) second_arr[j] = i;
                else {
                    if (A.charAt(i - 1) == B.charAt(j - 1)) {
                        second_arr[j] = first_arr[j - 1];
                    } else {
                        second_arr[j] = 1 + Math.min(first_arr[j - 1], Math.min(first_arr[j], second_arr[j - 1]));
                    }
                }
            }
            int[] temp = first_arr;
            first_arr = second_arr;
            second_arr = temp;
        }
        return first_arr[B_len];
    }
}



/*Q2. Edit Distance
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two strings A and B, find the minimum number of steps required to convert A to B. (each operation is counted as 1 step.)

You have the following 3 operations permitted on a word:

Insert a character
Delete a character
Replace a character


Problem Constraints
1 <= length(A), length(B) <= 450



Input Format
The first argument of input contains a string, A.
The second argument of input contains a string, B.



Output Format
Return an integer, representing the minimum number of steps required.



Example Input
Input 1:

 A = "abad"
 B = "abac"
Input 2:

 A = "Anshuman"
 B = "Antihuman


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Exlanation 1:

 A = "abad" and B = "abac"
 After applying operation: Replace d with c. We get A = B.

Explanation 2:

 A = "Anshuman" and B = "Antihuman"
 After applying operations: Replace s with t and insert i before h. We get A = B.
*/

/*This is a very standard Dynamic programming problem.

Lets look at the bruteforce approach for finding edit distance of S1 and S2.
We are trying to modify S1 to become S2.

We look at the first character of both the strings.
If they match, we can look at the answer from remaining part of S1 and S2.
If they don’t, we have 3 options.
1) Insert S2’s first character and then solve the problem for remaining part of S2, and S1.
2) Delete S1’s first character and trying to match S1’s remaining string with S2.
3) Replace S1’s first character with S2’s first character in which case we solve the problem for remaining part of S1 and S2.

The code would probably look something like this :

int editDistance(string &S1, int index1, string &S2, int index2) {
// BASE CASES

if (S1[index1] == S2[index2]) {
     return editDistance(S1, index1 + 1, S2, index2 + 1);
} else {
     return min(
    1 + editDistance(S1, index1 + 1, S2, index2), // Delete S1 char
            1 + editDistance(S1, index1, S2, index2 + 1), // Insert S2 char
            1 + editDistance(S1, index1 + 1, S2, index2 + 1) // Replace S1 first char with S2 first char
     );
} }
The above approach is definitely exponential.
However, lets look at the number of ways in which the function can be called. S1 and S2 remain constant. The only thing changing is index1 and index2 which can take len(S1) * len(S2) number of values. Can you use it to memoize ?

You can use the above observation to also come up with a non recursive solution.

*/