package com.scaler.dsa.assignment;


import java.util.ArrayList;
import java.util.Collections;

public class ConstructionCost {
    static int maxn = 100009;
    static int[] arr = new int[maxn];
    static int[] sz = new int[maxn];
    static ArrayList< pair1 > edges;
    static long mod = 1000000007;
    public int solve(int A, int[][] B) {
        ini();
        for (int i = 0; i < B.length; i++)
            edges.add(new pair1(B[i][2], i));
        Collections.sort(edges);
        int ans = 0;
        for (pair1 p: edges) {
            int ind = p.second;
            int val = p.first;
            int u = B[ind][0];
            int v = B[ind][1];
            if (root(u) == root(v))
                continue;
            else {
                un(u, v);
                ans += (int) val;
                ans %= mod;
            }
        }
        return (int) ans;

    }
    public static void ini() {
        edges = new ArrayList < pair1 > ();
        for (int i = 0; i < maxn; i++) {
            arr[i] = i;
            sz[i] = 1;
        }
    }
    public static int root(int a) {
        while (arr[a] != a) {
            arr[a] = arr[arr[a]];
            a = arr[a];
        }
        return a;
    }
    public static void un(int a, int b) {
        int ra = root(a);
        int rb = root(b);
        if (sz[ra] <= sz[rb]) {
            arr[ra] = rb;
            sz[rb] += sz[ra];
        } else {
            arr[rb] = ra;
            sz[ra] += sz[rb];
        }
    }
}
class pair1 implements Comparable < pair1 > {
    int first;
    int second;
    public pair1(int a, int b) {
        this.first = a;
        this.second = b;
    }
    @Override
    public int compareTo(pair1 temp) {
        return this.first - temp.first;
    }
}
/*Q3. Construction Cost
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a graph with A nodes and C weighted edges. Cost of constructing the graph is the sum of weights of all the edges in the graph.

Find the minimum cost of constructing the graph by selecting some given edges such that we can reach every other node from the 1st node.

NOTE: Return the answer modulo 109+7 as the answer can be large.



Problem Constraints
1 <= A <= 100000
0 <= C <= 100000
1 <= B[i][0], B[i][1] <= N
1 <= B[i][2] <= 109



Input Format
First argument is an integer A.
Second argument is a 2-D integer array B of size C*3 denoting edges. B[i][0] and B[i][1] are connected by ith edge with weight B[i][2]



Output Format
Return an integer denoting the minimum construction cost.



Example Input
Input 1:

A = 3
B = [   [1, 2, 14]
        [2, 3, 7]
        [3, 1, 2]   ]
Input 2:

A = 3
B = [   [1, 2, 20]
        [2, 3, 17]  ]


Example Output
Output 1:

9
Output 2:

37


Example Explanation
Explanation 1:

We can take only two edges (2 -> 3 and 3 -> 1) to construct the graph.
we can reach the 1st node from 2nd and 3rd node using only these two edges.
So, the total cost of costruction is 9.
Explanation 2:

We have to take both the given edges so that we can reach the 1st node from 2nd and 3rd node.
*/

/*As it can be easily be seen that the graph will not have any cyles and every other node should be rechable from the 1st.

The resulting graph is connected and without cycles. So, it will be a tree.

To minimize the cost, we can find minimum spanning tree using Kruskal or Prim algorithms.*/