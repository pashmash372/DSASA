package com.scaler.dsa.homework;


import java.util.*;

public class ReversingEdges {
    public int reverseEdges(int A, int[][] B) {
        Graph g = new Graph(A);
        for (int i = 0; i < B.length; i++) {
            g.adj[B[i][0]].add(new Node(B[i][1], 0)); // a , weight
            g.adj[B[i][1]].add(new Node(B[i][0], 1)); // b , weight
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
        PriorityQueue<Node> pq = new PriorityQueue<>(new CustomSort()); // min heap
        pq.add(new Node(1, dis[1]));
        /*
            Use all the given edges with weight 0
            reverse all the edges with weight 1
        */
        while (!pq.isEmpty()) {
            Node x = pq.poll();
            if (g.vis[x.pos]) continue;
            g.vis[x.pos] = true;
            for (Node v : g.adj[x.pos]) {
                if (!g.vis[v.pos]) {
                    if (dis[v.pos] > dis[x.pos] + v.val) dis[v.pos] = dis[x.pos] + v.val;
                }
            }
            for (Node v : g.adj[x.pos]) {
                if (!g.vis[v.pos]) {
                    pq.add(new Node(v.pos, dis[v.pos]));
                }
            }
        }
    }

    class Node { // position ,weight (1,0)
        int pos, val;

        Node(int pos, int val) {
            this.pos = pos;
            this.val = val;
        }
    }

    // increasing order on basis of weight (1,0)
    public class CustomSort implements Comparator<Node> {
        public int compare(Node a, Node b) {
            return (a.val - b.val);
        }
    }

    class Graph {
        ArrayList<Node>[] adj; // better one i think
        boolean[] vis;

        Graph(int n) {
            adj = new ArrayList[n + 1];
            vis = new boolean[n + 1];
            for (int i = 0; i < n + 1; i++)
                adj[i] = new ArrayList<>();
        }
    }
}

/* Java Simple Soln. Using Djikstra's algo */

class ReversingEdges1 {
    public int minFlips(List<List<Pair>> adjList, int source, int n) {
        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(Comparator.comparing((a) -> a.weight));
        priorityQueue.add(new Pair(source, 0));
        while (!priorityQueue.isEmpty()) {
            Pair top = priorityQueue.poll();
            int vertex = top.vertex;
            int weight = top.weight;
            if (distance[vertex] != Integer.MAX_VALUE) continue; //Already Covered
            distance[vertex] = weight;
            for (Pair u : adjList.get(vertex)) {
                if (distance[u.vertex] != Integer.MAX_VALUE) continue;
                priorityQueue.add(new Pair(u.vertex, weight + u.weight));
            }
        }
        return distance[n];
    }

    public int reverseEdges(int A, int[][] B) {
        List<List<Pair>> adjList = new ArrayList<>();
        for (int i = 0; i <= A; ++i) {
            adjList.add(new ArrayList<>());
        }
        for (int[] ints : B) {
            adjList.get(ints[0]).add(new Pair(ints[1], 0));
            adjList.get(ints[1]).add(new Pair(ints[0], 1)); //Adding opposite edge of weight 1
        }
        int ans = minFlips(adjList, 1, A);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static class Pair {
        int vertex;
        int weight;

        public Pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
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