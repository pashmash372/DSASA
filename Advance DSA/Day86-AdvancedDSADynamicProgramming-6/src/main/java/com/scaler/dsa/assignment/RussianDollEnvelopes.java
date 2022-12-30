package com.scaler.dsa.assignment;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RussianDollEnvelopes {
    public int solve(int[][] A) {
        ArrayList<Pair> v = new ArrayList<Pair>();
        int n = A.length;
        for (int i = 0; i < n; i++)
            v.add(new Pair(A[i][0], -A[i][1])); // A[i][0] -> height , A[i][1] -> width
        Collections.sort(v);
        int[] dp = new int[n];
        dp[0] = 1;
        int maxe = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (v.get(j).ff < v.get(i).ff && v.get(j).ss > v.get(i).ss) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            maxe = Math.max(maxe, dp[i]);
        }
        return maxe;
    }
}

class Pair implements Comparable<Pair> {
    int ff;
    int ss;

    public Pair(int c, int d) {
        this.ff = c;
        this.ss = d;
    }

    @Override
    public int compareTo(Pair a) {
        return this.ff - a.ff;
    }  // increasing order
}


/*Extension of LIS problem,could be a follow up problem*/

class RussianDollEnvelopes1 {
    public int solve(int[][] A) {
        int max = 0;
        int n = A.length;
        Arrays.sort(A, (a, b) -> Integer.compare(a[0], b[0]));
//lis array
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i][0] > A[j][0] && A[i][1] > A[j][1] && lis[i] <= lis[j]) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
//pick max among lis values
        for (int i = 0; i < n; i++) {
            if (max < lis[i]) {
                max = lis[i];
            }
        }
        return max;
    }
}



/*Q3. Russian Doll Envelopes
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a matrix of integers A of size N x 2 describing dimensions of N envelopes, where A[i][0] denotes the height of the ith envelope and A[i][1] denotes the width of the ith envelope.

One envelope can fit into another if and only if both the width and height of one envelope is greater than the width and height of the other envelope.

Find the maximum number of envelopes you can put one inside other.



Problem Constraints
1 <= N <= 1000
1 <= A[i][0], A[i][1] <= 109



Input Format
The only argument given is the integer matrix A.



Output Format
Return an integer denoting the maximum number of envelopes you can put one inside other.



Example Input
Input 1:

 A = [
         [5, 4]
         [6, 4]
         [6, 7]
         [2, 3]
     ]
Input 2:

 A = [     '
         [8, 9]
         [8, 18]
     ]


Example Output
Output 1:

 3
Output 2:

 1


Example Explanation
Explanation 1:

 Step 1: put [2, 3] inside [5, 4]
 Step 2: put [5, 4] inside [6, 7]
 3 envelopes can be put one inside other.
Explanation 2:

 No envelopes can be put inside any other so answer is 1.*/

/*This is the same question as longest increase sub sequance.
The only problem is how to trasnform this problem to it.
We just sort the envelopes by width, but when there are even case( two envelope with the same width) we should put the height in reverse order.
like (5,6), (5,8), we should put (5,8) before (5,6).

Now the problem reduces to finding the longest increasing subsequence.*/