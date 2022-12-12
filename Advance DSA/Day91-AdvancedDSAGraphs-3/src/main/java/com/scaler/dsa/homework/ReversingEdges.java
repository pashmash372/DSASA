package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ReversingEdges {
    class Node {
        int pos, val;
        Node(int pos, int val) {
            this.pos = pos;
            this.val = val;
        }
    }

    public class CustomSort implements Comparator< Node > {
        public int compare(Node a, Node b) {
            return (a.val - b.val);
        }
    }

    class Graph {
        ArrayList< Node > adj[];
        boolean vis[];
        Graph(int n) {
            adj = new ArrayList[n + 1];
            vis = new boolean[n + 1];
            for (int i = 0; i < n + 1; i++)
                adj[i] = new ArrayList < > ();
        }
    }

    public int reverseEdges(int A, int[][] B) {
        Graph g = new Graph(A);
        for (int i = 0; i < B.length; i++) {
            g.adj[B[i][0]].add(new Node(B[i][1], 0));
            g.adj[B[i][1]].add(new Node(B[i][0], 1));
        }
        int[] dis = new int[A + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dijk(g, dis);
        if (dis[A] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dis[A];
        }
    }

    public void dijk(Graph g, int[] dis) {
        dis[1] = 0;
        PriorityQueue< Node > pq = new PriorityQueue < > (new CustomSort());
        pq.add(new Node(1, dis[1]));
        while (!pq.isEmpty()) {
            Node x = pq.poll();
            if (g.vis[x.pos])
                continue;
            g.vis[x.pos] = true;
            for (Node v: g.adj[x.pos]) {
                if (!g.vis[v.pos]) {
                    if (dis[v.pos] > dis[x.pos] + v.val)
                        dis[v.pos] = dis[x.pos] + v.val;
                }
            }
            for (Node v: g.adj[x.pos]) {
                if (!g.vis[v.pos]) {
                    pq.add(new Node(v.pos, dis[v.pos]));
                }
            }
        }
    }
}
/*Q1. Reversing Edges
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given a directed graph with A nodes and M edges.
Find the minimum number of edges that needs to be reversed in order to reach node A from node 1.



Problem Constraints

1 <= A, M <= 10 5
1 <= B[i][0], B[i][1] <= A
There can be multiple edges or self loops (B[i][0] = B[i][1])


Input Format

The first argument is an integer A, denoting the number of nodes in the graph.
The second argument is a 2D integer array B, denoting the directed edges in the graph.


Output Format

Return a single integer denoting the minimum number of edges to be reversed.


Example Input

Input 1:
A = 5
B = [[1, 2],
     [2, 3],
     [4, 3],
     [4, 5]]
Input 2:

A = 5
B = [[1, 2],
     [2, 3],
     [3, 4],
     [4, 5]]


Example Output

Output 1:
1
Output 2:

0


Example Explanation

Explanation 1:

Reversing the edge (4, 3) is only required.

Explanation 2:

There already exists a path between 1 and A, so no edges need to be reversed.

*/

/*Create a graph from the given edges as follows:

Use all the given edges with weight 0

reverse all the edges with weight 1

Then, simply use Dijkstra's shortest path algorithm to find the lowest cost path between node 1 to node A.
Also in Dijkstra's shortest path algorithm we will use deque rather than priority queue , we will insert edges having weight 0 from top and weight 1 edges from bottom.
*/