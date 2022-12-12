package com.scaler.dsa.homework;


import java.util.ArrayList;

public class TusharsBirthdayParty {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    static int INF = 10000000;
    static int[][] dp = new int[1005][1005];
    public int solve(final int[] A, final int[] B, final int[] C) {
        ArrayList< Pair > dish = new ArrayList < Pair > ();
        int n = C.length;
        for (int i = 0; i < n; i++)
            dish.add(new Pair(B[i], C[i]));
        int m = -1;
        for (int i = 0; i < A.length; i++)
            m = Math.max(m, A[i]);
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0)
                    dp[i][j] = 0;
                else if (j == 0)
                    dp[i][j] = INF;
                else {
                    if (i >= dish.get(j - 1).ff) {
                        dp[i][j] = Math.min(dp[i][j - 1], dp[i - dish.get(j - 1).ff][j] + dish.get(j - 1).ss);
                    } else
                        dp[i][j] = dp[i][j - 1];
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            ans += dp[A[i]][n];
        }

        return ans;
    }
}
class Pair {
    int ff;
    int ss;
    public Pair(int a, int b) {
        this.ff = a;
        this.ss = b;
    }
}

/*Q2. Tushar's Birthday Party
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
As it is Tushar's Birthday on March 1st, he decided to throw a party to all his friends at TGI Fridays in Pune. Given are the eating capacity of each friend, filling capacity of each dish and cost of each dish. A friend is satisfied if the sum of the filling capacity of dishes he ate is equal to his capacity. Find the minimum cost such that all of Tushar's friends are satisfied (reached their eating capacity).

NOTE:

Each dish is supposed to be eaten by only one person. Sharing is not allowed.

Each friend can take any dish unlimited number of times.

There always exists a dish with filling capacity 1 so that a solution always exists.



Problem Constraints
|A| <= 1000

|B| <= 1000

|C| <= 1000



Input Format
First Argument is vector A, denoting eating capacities

Second Argument is vector B, denoting filling capacities

Third Argument is vector C, denoting cost



Output Format
Return a single integer, the answer to the problem



Example Input
Input 1:

A = [2, 4, 6]
B = [2, 1, 3]
C = [2, 5, 3]
Input 2:

A = [2]
B = [1]
C = [2]


Example Output
Output 1:

12
Output 2:

4


Example Explanation
Explanation 1:

First friend takes dish 1, Second friend takes dish 1 twice and third friend takes dish 3 twice.
So 2 + 2*2 + 3*2 = 12.
Explanation 2:

Only way is to take 2 dishes of cost 2, hence 4.*/

/*Observations: **
 As the friends cannot share dishes, we can calculate the cost for each of them independently and add all such costs.
 Now, the problem instance for every friend is reduced to standard KnapSack problem.

 **Dynamic programming recurrence: **

 dp[i][j] –> min. cost to satisfy a person with capacity i using first j dishes.

 dp[i][j] = min( dp[i][j-1] , dp[ i-fillCap[j] ][j] + cost[j] ) // if ( i-fillCap[j] ) >= 0
 dp[i][j] = dp[i][j-1] // otherwise

 As one dish can be taken multiple times, we have used dp[ i-fillCap[j] ][ j ] and not dp[ i-fillCap[j] ][ j-1 ]. This is different from standard KnapSack where one element can be used only once.

 Note: Base cases should be handled properly.*/