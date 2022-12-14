package com.scaler.dsa.homework;



public class SpecialSubsequencesAG {
    public int solve(String A) {
        int n = A.length(), ans = 0, MOD = 1000*1000*1000 + 7;
        int cnt_G[] = new int[n], count = 0;

        //Suffix count of G
        for(int i = n - 1 ; i >= 0 ; i--){
            if(A.charAt(i) == 'G')
                count = count + 1;
            cnt_G[i] = count;
        }

        // traverse the string again from beginning
        for(int i = 0; i < n; i++){
            // if current character is "A" then add number of G's after that
            if(A.charAt(i) == 'A') {
                ans = ans + cnt_G[i];
                ans = ans % MOD;
            }
        }
        return ans;
    }
}

/*Q2. Special Subsequences "AG"
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.



Problem Constraints
1 <= length(A) <= 105



Input Format
First and only argument is a string A.



Output Format
Return an integer denoting the answer.



Example Input
Input 1:

 A = "ABCGAG"
Input 2:

 A = "GAB"


Example Output
Output 1:

 3
Output 2:

 0


Example Explanation
Explanation 1:

 Subsequence "AG" is 3 times in given string
Explanation 2:

 There is no subsequence "AG" in the given string.*/


/*Approach 1

The main task is to find the number of times subsequence “AG” appears in a string.
Simply find the number of G’s after any index i by taking suffix sum.
Then traverse the string again, and when you encounter an ‘A’, add the number of G’s after that to the answer.

Time Complexity : O(n)
Space Complexity (extra) : O(n)

where ‘n’ is the length of the string A.

This solution is enough to pass the test casses.
However , Do we really need O(n) space? Can you think of a solution with constant space?

Approach 2(memory efficient)

This is just a modification of the previous approach.
Instead of keeping a suffix array for count of G’s , we can instead keep a variable ‘g’ storing count of G’s and iterate in the reverse order.
If the current character is ‘G’ , increment g.
If the current character is ‘A’ , add g to our answer.

for i from n-1 to 0
    if A[i]=='G'
        g++
    else
        ans+=g
        ans%=mod

Time complexity : O(n)
Space complexity : O(1)*/