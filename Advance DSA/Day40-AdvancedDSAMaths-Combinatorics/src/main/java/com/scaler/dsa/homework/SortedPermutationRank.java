package com.scaler.dsa.homework;


public class SortedPermutationRank {
    private int mod = 1000003;
    public int fact(int n) {
        if(n == 0 || n == 1)
            return 1;
        else
            return (n * fact(n - 1)) % mod;
    }
    public int findRank(String A) {
        int ans = 0;
        int n = A.length();
        for(int i = 0; i < n - 1; i++) {
            int count = 0;  // count of characters less than A[i]
            for(int j = i + 1; j < n; j++)
                if(A.charAt(j) < A.charAt(i))
                    count++;
            ans += (count * fact(n - i - 1)) % mod;
        }
        return (ans + 1) % mod;
    }
}
/*Q1. Sorted Permutation Rank
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

Note: The answer might not fit in an integer, so return your answer % 1000003



Problem Constraints
1 <= |A| <= 1000



Input Format
First argument is a string A.



Output Format
Return an integer denoting the rank of the given string.



Example Input
Input 1:

A = "acb"
Input 2:

A = "a"


Example Output
Output 1:

2
Output 2:

1


Example Explanation
Explanation 1:

Given A = "acb".
The order permutations with letters 'a', 'c', and 'b' :
abc
acb
bac
bca
cab
cba
So, the rank of A is 2.
Explanation 2:

Given A = "a".
Rank is clearly 1.*/

/*Let’s start by looking at the first character.

If the first character is X, all permutations that had the first character less than X would come before this permutation when sorted lexicographically.

The number of permutations with a character C as the first character = number of permutations possible with remaining N-1 character = (N-1)!

Then the problem reduces to finding the rank of the permutation after removing the first character from the set.

Hence,

rank = number of characters less than first character * (N-1)! + rank of permutation of the string with the first character removed
Example
Let’s say our string is “VIEW”.

Character 1: 'V'
All permutations which start with 'I', 'E' would come before 'VIEW'.
Number of such permutations = 3! * 2 = 12

Let’s now remove ‘V’ and look at the rank of the permutation ‘IEW.’

Character 2: ‘I’
All permutations which start with ‘E’ will come before ‘IEW’
Number of such permutation = 2! = 2.

Now, we will limit ourselves to the rank of ‘EW’.

Character 3:
‘EW’ is the first permutation when the 2 permutations are arranged.

So, we see that there are 12 + 2 = 14 permutations that would come before "VIEW".
Hence, the rank of permutation = 15.*/