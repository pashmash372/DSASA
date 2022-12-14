package com.scaler.dsa.assignment;


public class SUBARRAYOR {
    public int solve(int[] A) {
        int n = A.length;
        int[] idx = new int[32];
        long ans = 0;
        for (int i = 1; i <= n; ++i) {
            long tmp = A[i - 1];
            for (int j = 0; j <= 31; ++j) {
                long pw = 1 << j;
                if ((tmp & pw) != 0) { //if jth bit is set
                    ans += pw * i; // add its contribution in ans for all subarrays ending at index i
                    idx[j] = i; // store the index for next elements
                } else if (idx[j] != 0) // if jth bit is not set
                {
                    ans += pw * idx[j]; // add its contribution in ans for all subarrays ending at index i using
                } // the information of last element having jth bit set
            }
        }
        return (int)(ans % 1000000007);
    }
}

/*Q2. SUBARRAY OR
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given an array of integers A of size N.

The value of a subarray is defined as BITWISE OR of all elements in it.

Return the sum of value of all subarrays of A % 109 + 7.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 108



Input Format
The first argument given is the integer array A.



Output Format
Return the sum of Value of all subarrays of A % 109 + 7.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [7, 8, 9, 10]


Example Output
Output 1:

 71
Output 2:

 110


Example Explanation
Explanation 1:

 Value([1]) = 1
 Value([1, 2]) = 3
 Value([1, 2, 3]) = 3
 Value([1, 2, 3, 4]) = 7
 Value([1, 2, 3, 4, 5]) = 7
 Value([2]) = 2
 Value([2, 3]) = 3
 Value([2, 3, 4]) = 7
 Value([2, 3, 4, 5]) = 7
 Value([3]) = 3
 Value([3, 4]) = 7
 Value([3, 4, 5]) = 7
 Value([4]) = 4
 Value([4, 5]) = 5
 Value([5]) = 5
 Sum of all these values = 71
Explanation 2:

 Sum of value of all subarray is 110.

*/

/*In this question, we will consider every bit as a unique bit, and every bit will have an independent contribution to the answer.
Thus, we will iterate over the whole array for all bits independently. We will maintain a 2d array BitInfo[bits][index]. The value at any index ind for any bit will signify the next index on which this bit is set.
Thus after that index, every subarray corresponding to ind will have that bit set.
In this manner, the contribution of every bit corresponding to each bit can be determined independently and can be added to the overall answer.

Another way to solve this problem is to iterate over each bit and count the number of subarrays in which it won't contribute.
After calculating that, we can deduct this from the total count of subarrays(which is the same for each bit).
To count the number of subarrays in which a bit won't have a contribution, consider the following example for a random bit:
0 1 1 0 0 0 0 1 1 0 0 1 (0 is for the places where the bit is unset, and 1 is for the places where this bit is set)
If the starting till ending point of a subarray does not consist of even a single 1, the bit won't contribute to the bitwise OR.
The number of subarrays that can be formed from an array of size x is x * (x + 1) / 2. So, we can iterate over this binary array
that we had precomputed for each bit before and applied the formula to get the total number of subarrays where the selected bit does not contribute to bitwise OR.
More details in the video are provided.*/