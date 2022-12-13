package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.HashMap;

// Returns count of pairs in arr[0..n-1]
// with XOR value equals to x.
public class PairsWithGivenXor {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int ans = 0;
        for (int x : A) {
            if (mp.containsKey(x ^ B)) {
                ++ans;
            }
            mp.put(x, 1);
        }
        return ans;
    }
}

/*Q2. Pairs With Given Xor
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer array A containing N distinct integers.

Find the number of unique pairs of integers in the array whose XOR is equal to B.

NOTE:

Pair (a, b) and (b, a) is considered to be the same and should be counted once.


Problem Constraints
1 <= N <= 105

1 <= A[i], B <= 107



Input Format
The first argument is an integer array A.

The second argument is an integer B.



Output Format
Return a single integer denoting the number of unique pairs of integers in the array A whose XOR is equal to B.



Example Input
Input 1:

 A = [5, 4, 10, 15, 7, 6]
 B = 5
Input 2:

 A = [3, 6, 8, 10, 15, 50]
 B = 5


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Explanation 1:

 (10 ^ 15) = 5
Explanation 2:

 (3 ^ 6) = 5 and (10 ^ 15) = 5
*/


/*A Simple solution is to traverse each element and check if there’s another number whose XOR with it is equal to B.
This solution takes O(N2) time.

The efficient solution to this problem takes O(N) time.
The idea is based on the fact that A[i] ^ A[j] is equal to B if and only if A[i] ^ B is equal to A[j].

Initialize the result as 0.
Create an empty hash set “s”.
Do the following for each element A[i] in A[]
If B ^ A[i] is in “s”, then increment the result by 1.
Insert A[i] into the hash set “s”.
Return result.*/