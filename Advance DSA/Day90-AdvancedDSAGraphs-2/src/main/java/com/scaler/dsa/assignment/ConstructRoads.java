package com.scaler.dsa.assignment;


import java.util.ArrayList;

public class ConstructRoads {
    static int maxn = 100009;
    static long[] col = new long[2];
    static long mod = 1000000007;
    static ArrayList <ArrayList< Integer >> adj;
    public static void graph() {
        adj = new ArrayList < ArrayList < Integer > > (maxn);
        for (int i = 0; i < maxn; i++) {
            adj.add(new ArrayList < Integer > ());
        }
        col[0] = 0;
        col[1] = 0;
    }
    public int solve(int A, int[][] B) {
        graph();
        for (int[] edge: B) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        dfs(1, 0, 0);
        long ans = col[0] * col[1];
        ans -= A - 1;
        ans %= mod;
        return (int) ans;
    }
    public static void dfs(int u, int pnode, int c) { // pnode
        col[c]++;
        for (int v: adj.get(u)) {
            if (v != pnode) {
                dfs(v, u, 1 - c);
            }
        }
    }
}

/*Q4. Construct Roads
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
A country consist of N cities connected by N - 1 roads. King of that country want to construct maximum number of roads such that the new country formed remains bipartite country.

Bipartite country is a country, whose cities can be partitioned into 2 sets in such a way, that for each road (u, v) that belongs to the country, u and v belong to different sets. Also, there should be no multiple roads between two cities and no self loops.

Return the maximum number of roads king can construct. Since the answer could be large return answer % 109 + 7.

NOTE: All cities can be visited from any city.



Problem Constraints
1 <= A <= 105

1 <= B[i][0], B[i][1] <= N



Input Format
First argument is an integer A denoting the number of cities, N.

Second argument is a 2D array B of size (N-1) x 2 denoting the initial roads i.e. there is a road between cities B[i][0] and B[1][1] .



Output Format
Return an integer denoting the maximum number of roads king can construct.



Example Input
Input 1:

 A = 3
 B = [
       [1, 2]
       [1, 3]
     ]
Input 2:

 A = 5
 B = [
       [1, 3]
       [1, 4]
       [3, 2]
       [3, 5]
     ]


Example Output
Output 1:

 0
Output 2:

 2


Example Explanation
Explanation 1:

 We can't construct any new roads such that the country remains bipartite.
Explanation 2:

 We can add two roads between cities (4, 2) and (4, 5).
*/

/*As we know, the tree is itself bipartite.

Run a Depth First search over the given tree and partition it into two sets.

We can’t add an edge between any 2 nodes in the same set and we can add an edge between every 2 nodes in different sets, so let the number of nodes in the left set be x and the number of nodes in the right set be y.

The maximum number of edges that can exist is x * y, but N - 1 edges already exist so the maximum number of edges to be added is x * y - (N - 1).*/