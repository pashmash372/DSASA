package com.scaler.dsa.assignment;


import java.util.ArrayList;

public class Batches {
    static int maxn = 100009;
    static ArrayList<ArrayList<Integer>> adj;
    static int[] a = new int[maxn];
    static int[] vis = new int[maxn];
    static int sum = 0;

    public static void graph() {
        adj = new ArrayList<ArrayList<Integer>>(maxn);
        for (int i = 0; i < maxn; i++) {
            vis[i] = 0;
            adj.add(new ArrayList<Integer>());
        }
    }

    public static void dfs(int x) {
        sum += a[x];
        vis[x] = 1;
        for (int v : adj.get(x)) {
            if (vis[v] == 0) dfs(v);
        }
    }

    public int solve(int A, int[] B, int[][] C, int D) {
        graph();
        for (int[] edge : C) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        System.arraycopy(B, 0, a, 1, B.length); // copy array B to array a where array a follows 1-based index
        int ans = 0;
        for (int i = 1; i <= A; i++) {
            if (vis[i] == 0) {
                sum = 0;
                dfs(i);
                if (sum >= D) ++ans;
            }
        }
        return ans;
    }
}
/*Q1. Batches
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

A students applied for admission in IB Academy. An array of integers B is given representing the strengths of A people i.e. B[i] represents the strength of ith student.

Among the A students some of them knew each other. A matrix C of size M x 2 is given which represents relations where ith relations depicts that C[i][0] and C[i][1] knew each other.

All students who know each other are placed in one batch.

Strength of a batch is equal to sum of the strength of all the students in it.

Now the number of batches are formed are very much, it is impossible for IB to handle them. So IB set criteria for selection: All those batches having strength at least D are selected.

Find the number of batches selected.

NOTE: If student x and student y know each other, student y and z know each other then student x and student z will also know each other.



Problem Constraints

1 <= A <= 105

1 <= M <= 2*105

1 <= B[i] <= 104

1 <= C[i][0], C[i][1] <= A

1 <= D <= 109



Input Format

The first argument given is an integer A.
The second argument given is an integer array B.
The third argument given is a matrix C.
The fourth argument given is an integer D.



Output Format

Return the number of batches selected in IB.



Example Input

Input 1:

 A = 7
 B = [1, 6, 7, 2, 9, 4, 5]
 C = [  [1, 2]
        [2, 3]
       `[5, 6]
        [5, 7]  ]
 D = 12
Input 2:

 A = 5
 B = [1, 2, 3, 4, 5]
 C = [  [1, 5]
        [2, 3]  ]
 D = 6


Example Output

Output 1:

 2
Output 2:

 1


Example Explanation

Explanation 1:

 Initial Batches :
    Batch 1 = {1, 2, 3} Batch Strength = 1 + 6 + 7 = 14
    Batch 2 = {4} Batch Strength = 2
    Batch 3 = {5, 6, 7} Batch Strength = 9 + 4 + 5 = 18
    Selected Batches are Batch 1 and Batch 2.
Explanation 2:

 Initial Batches :
    Batch 1 = {1, 5} Batch Strength = 1 + 5  = 6
    Batch 2 = {2, 3} Batch Strength = 5
    Batch 3 = {4} Batch Strength = 4
    Selected Batch is only Batch 1.
*/

/*Modify the above problem in the form of an undirected weighted graph.
Consider students as nodes and relations as edges between them.
All connected components come under one batch.
Strength of a batch is the sum of the weight of nodes of connected components of the graph(batch).

After Modifying the problem statement to graph perspective, It is easy to see find the solution.

Initiaize ans = 0

Pick any unvisited node and find the sum of all the weights of nodes which are reachable from this node and mark all such nodes as visited. if this sum is greater than equal to D then increment ans.

If N is the number of students and M is the number of relations then
Time Complexity : O (N+M)*/