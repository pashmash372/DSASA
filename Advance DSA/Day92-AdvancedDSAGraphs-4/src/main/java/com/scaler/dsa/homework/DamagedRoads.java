package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.Collections;

public class DamagedRoads {
    static long MOD = 1000000007;
    public int solve(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        ArrayList< Pair > v = new ArrayList < Pair > ();
        for (int i = 0; i < n; i++)
            v.add(new Pair(A[i], 0));
        for (int i = 0; i < m; i++)
            v.add(new Pair(B[i], 1));
        Collections.sort(v);
        n++;
        m++;
        long ans = 0;
        for (Pair u: v) {
            if (u.second == 0) {
                ans = (ans + (m * u.first) % MOD) % MOD;
                ans %= MOD;
                n--;
            } else {
                ans = (ans + (n * u.first) % MOD) % MOD;
                ans %= MOD;
                m--;
            }
        }
        return (int) ans;
    }
}
class Pair implements Comparable < Pair > {
    int first;
    int second;
    public Pair(int a, int b) {
        this.first = a;
        this.second = b;
    }
    @Override
    public int compareTo(Pair temp) {
        if (this.first == temp.first)
            return this.second - temp.second;
        return this.first - temp.first;
    }
}
/*Q1. Damaged Roads
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are the Prime Minister of a country and once you went for a world tour.
After 5 years, when you returned to your country, you were shocked to see the condition of the roads between the cities. So, you plan to repair them, but you cannot afford to spend a lot of money.

The country can be represented as a (N+1) x (M+1) grid, where Country(i, j) is a city.

The cost of repairing a road between (i, j) and (i + 1, j) is A[i]. The cost of repairing a road between (i, j) and (i, j + 1) is B[j].

Return the minimum cost of repairing the roads such that all cities can be visited from city indexed (0, 0).

As the cost can be large, return the cost modulo 109+7.



Problem Constraints

1 <= N, M <= 105

1 <= A[i], B[i] <= 103


Input Format

The first argument will be an integer array, A, of size N.
The second argument will be an integer array, B, of size M.



Output Format

Return an integer representing the minimum possible cost.



Example Input

Input 1:

 A = [1, 1, 1]
 B = [1, 1, 2]
Input 2:

 A = [1, 2, 3]
 B = [4, 5, 6]


Example Output

Output 1:

 16
Output 2:

 39


Example Explanation

Explanation 1:

 The minimum cost will be 16 if we repair the roads in the following way:
 Repair the roads from the all cities in row 0 to row 1 i.e. (0, j) to (1, j) (0 <= j <= 3), so that the cost will be 4 (A[0] * 4).
 Repair the roads from the all cities in row 1 to row 2 i.e. (1, j) to (2, j) (0 <= j <= 3), so that the cost will be 4 (A[1] * 4).
 Repair the roads from the all cities in row 2 to row 3 i.e. (2, j) to (3, j) (0 <= j <= 3), so that the cost will be 4 (A[2] * 4).
 Repair the roads (0, 0) to (0, 1), (0, 1) to (0, 2), (0, 2) to (0, 3), so that the cost will be B[0] + B[1] + B[2] = 4.
 Total cost will be 16.

Explanation 2:

 The minimum possible cost will be 39.*/

/*If you convert the problem into graph, you can notice that the solution of the problem is to find the MST(Minimum Spanning Tree) of the graph.

Now, Can you do that without creating the graph?

Let’s look into this.

Add all the edge cost and type of edge(vertical or horizontal) in an auxillary array sort the array on the basis of edge cost in ascending order.
We can observe that the number of vertices are (N+1) * (M+1) so the number of edges in MST will be (N+1) * (M+1) - 1.

Intitally N = N+1, M = M+1
Iterate over the sorted array:
->If the type is vertical, then ans += M * (edge cost) and decrement N.
->Else, ans += N * (edge cost) and decrement M.

Return the ans%(1e9+7).*/