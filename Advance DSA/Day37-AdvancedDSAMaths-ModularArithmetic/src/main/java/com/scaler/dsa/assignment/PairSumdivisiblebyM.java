package com.scaler.dsa.assignment;


public class PairSumdivisiblebyM {
    public int solve(int[] a, int k) {
        int n = a.length;
        long mod = (long)(1e9 + 7);
        long cnt[] = new long[k];
        // cnt[i] stores the count of elements such that their modulo k equals i
        for(int x : a)    cnt[x % k]++;
        long ans = cnt[0] * (cnt[0] - 1) / 2;
        for(int i = 1, j = k - 1; i <= j; i++, j--) {
            if(i == j)
                ans = (ans + cnt[i] * (cnt[i] - 1) / 2) % mod;
            else
                ans = (ans + cnt[i] * cnt[j]) % mod;
        }
        return (int)ans;
    }
}
/*Q4. Pair Sum divisible by M
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A and an integer B, find and return the number of pairs in A whose sum is divisible by B.

Since the answer may be large, return the answer modulo (109 + 7).



Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 106



Input Format
The first argument given is the integer array A.
The second argument given is the integer B.



Output Format
Return the total number of pairs for which the sum is divisible by B modulo (109 + 7).



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 2
Input 2:

 A = [5, 17, 100, 11]
 B = 28


Example Output
Output 1:

 4
Output 2:

 1


Example Explanation
Explanation 1:

 All pairs which are divisible by 2 are (1,3), (1,5), (2,4), (3,5).
 So total 4 pairs.
*/

/*Let’s optimize using the fact that the value is up to 106, and using the modulo operator, we can reduce all the elements in the range 0 to B-1.

We make an auxiliary array cnt, the index i denotes the number of elements which gives i as the remainder when divided by B.
Now, we know that the sum of the pair modulo B should be equal to 0.
So we will count the pairs that give the sum of the pair modulo B is 0.
We can do this by adding cnt[i]*cnt[j] in the answer such that (i + j)%B=0.
Note: Keep in mind the base case when i==0 and j==0 and i==j.*/