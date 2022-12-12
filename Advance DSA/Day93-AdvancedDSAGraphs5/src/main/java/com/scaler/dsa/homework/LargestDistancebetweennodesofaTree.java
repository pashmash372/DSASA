package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LargestDistancebetweennodesofaTree {
    public int solve(ArrayList< Integer > A) {
        int n = A.size();
        ArrayList < ArrayList < Integer >> graph = new ArrayList < ArrayList < Integer >> ();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList < Integer > ());
        }
        int root = -1;
        for (int i = 0; i < n; i++) {
            int num = A.get(i);
            if (num == -1) {
                root = i;
                continue;
            }
            graph.get(i).add(num);
            graph.get(num).add(i);
        }
        // Find the node which is farthest from root node using BFS
        int node = bfs(graph, n, root);
        // Find the maximum distance from farthest node using modified DFS
        return dfs(graph, n, node);
    }
    public int bfs(ArrayList < ArrayList < Integer >> graph, int n, int u) {
        boolean[] vis = new boolean[n];
        Queue< Integer > q = new LinkedList< Integer >();
        q.add(u);
        while (!q.isEmpty()) {
            // stores the farthest node from root node
            u = q.remove();
            if (!vis[u]) {
                vis[u] = true;
                for (Integer v: graph.get(u)) {
                    if (!vis[v]) {
                        q.add(v);
                    }
                }
            }
        }
        return u;
    }
    public int dfs(ArrayList < ArrayList < Integer >> graph, int n, int u) {
        int max = 0;
        Stack< Integer > node = new Stack < Integer > ();
        Stack < Integer > dist = new Stack < Integer > ();
        boolean[] vis = new boolean[n];
        node.push(u);
        dist.push(0);
        while (!node.isEmpty()) {
            u = node.pop();
            int d = dist.pop();
            if (!vis[u]) {
                vis[u] = true;
                for (Integer v: graph.get(u)) {
                    if (!vis[v]) {
                        max = Math.max(max, d + 1);
                        node.push(v);
                        dist.push(d + 1);
                    }
                }
            }
        }
        return max;
    }
}
/*Q3. Largest Distance between nodes of a Tree
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Find largest distance Given an arbitrary unweighted rooted tree which consists of N (2 <= N <= 40000) nodes.

The goal of the problem is to find largest distance between two nodes in a tree. Distance between two nodes is a number of edges on a path between the nodes (there will be a unique path between any pair of nodes since it is a tree).

The nodes will be numbered 0 through N - 1.

The tree is given as an array A, there is an edge between nodes A[i] and i (0 <= i < N). Exactly one of the i's will have A[i] equal to -1, it will be root node.



Problem Constraints
2 <= |A| <= 40000



Input Format
First and only argument is vector A



Output Format
Return the length of the longest path



Example Input
Input 1:


A = [-1, 0]
Input 2:


A = [-1, 0, 0]


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Explanation 1:

 Path is 0 -> 1.
Explanation 2:

 Path is 1 -> 0 -> 2.*/

/*1) pick any node u
2) find the node which is farthest from u, call it x (calculate using the same approach as in Solution 1)
3) find the node which is farthest from x, call it q (calculate using the same approach as in Solution 1)
The answer will be the length of a path from x to q.

Proof of correctness:

The crucial step is to prove that x will be one of the endpoints of the path with maximal length (note that there might be more than one such path). If it is, then the longest path from x will be the longest path in the tree.

Let d(v1, v2) be length of path between v1 and v2

Let’s prove it by contradiction: assume there is a strictly longer path between s and t, neither of which is x. Let h be a node which is closest to u among the nodes on a path between s and t. Then there are two cases:
1) h is on path between u and x

    u
    |
    |
    |
    h   x
   / \ /
  /   *
 /     \
s       t
then d(s, t) = d(s, h) + d(h, t) <= d(s, h) + d(h, x) = d(s, x), which contradicts assumption.

2) h is not on path between u and x

    u
    |
    *---x
    |
    h
   / \
  /   \
 /     \
s       t
then

d(u, s) <= d(u, x) <= d(u, h) + d(h, x)
d(u, t) <= d(u, x) <= d(u, h) + d(h, x)

d(s, t) = d(s, h) + d(h, t)
= d(u, s) + d(u, t) - 2 d(u, h)
<= 2 d(h, x)

2 d(s, t) <= d(s, t) + 2 d(h, x)
= d(s, h) + d(h, x) + d(x, h) + d(h, t)
= d(x, s) + d(x, t)

This means that max(d(v, s), d(v, t)) >= d(s, t), which also contradicts assumption.

Thus, we proved that farthest node of a node will be one of the endpoints of the longest path.*/