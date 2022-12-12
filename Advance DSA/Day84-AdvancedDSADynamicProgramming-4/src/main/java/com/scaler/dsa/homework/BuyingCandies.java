package com.scaler.dsa.homework;

import java.util.Arrays;


public class BuyingCandies {
    public int solve(int[] A, int[] B, int[] C, int D) {
        int[] dp = new int[D + 1];
        Arrays.fill(dp, 0);
        for (int i = 0; i < A.length; i++) {
            for (int j = C[i]; j <= D; j++) {
                dp[j] = Math.max(dp[j], dp[j - C[i]] + A[i] * B[i]);
            }
        }
        return dp[D];
    }
}
/*Q1. Buying Candies
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Rishik likes candies a lot. So, he went to a candy-shop to buy candies.

The shopkeeper showed him N packets each containg A[i] candies for cost of C[i] nibbles, each candy in that packet has a sweetness B[i]. The shopkeeper puts the condition that Rishik can buy as many complete candy-packets as he wants but he can't buy a part of the packet.

Rishik has D nibbles, can you tell him the maximum amount of sweetness he can get from candy-packets he will buy?


Problem Constraints
1 <= N <= 700

1 <= A[i] <= 1000

1 <= B[i] <= 1000

1 <= C[i],D <= 1000



Input Format
First argument of input is an integer array A
Second argument of input is an integer array B
Third argument of input is an integer array C
Fourth argument of input is an integer D


Output Format
Return a single integer denoting maximum sweetness of the candies that he can buy


Example Input
Input 1:

 A = [1, 2, 3]
 B = [2, 2, 10]
 C = [2, 3, 9]
 D = 8
Input 2:

 A = [2]
 B = [5]
 C = [10]
 D = 99


Example Output
Output 1:

 10
Output 2:

 90


Example Explanation
Explanation 1:

 Choose 1 Packet of kind 1 = 1 Candy of 2 Sweetness = 2 Sweetness
 Choose 2 Packet of kind 2 = 2 Candy of 2 Sweetness = 8 Sweetness
Explanation 2:

 Buy 9 Packet of kind 1. 18 Candy each of 5 Sweetness = 90 Sweetness
*/

/*Let’s start by seeing what would be brute force approach for this,
consider a function to find maximum sweetness that takes available packets and available nibble as a parameter.
Now, for each packet you can choose N1 packet, and call the same function to find the answer for a smaller subset.
The solution would run in exponential time.

Well as you see above, the problem does have optimal substructure.
You need to observe that there is overlapping of states also and thus DP can be applied.
You would simply memorise all the answers and never compute the same thing again.

Time complexity: O(N*D)*/