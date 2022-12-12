package com.scaler.dsa.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CycleinUndirectedGraph {
    private static int solve(int A, int[][] B) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(A + 1);
        boolean[] vis = new boolean[A + 1];
        Arrays.fill(vis, false);

        for (int i = 0; i <= A; ++i) {
            adj.add(new ArrayList<>());
        }

        for (int[] ints : B) {
            int u = ints[0];
            int v = ints[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        return isCycle(A, adj, vis) ? 1 : 0;
    }

    private static class Node {
        int first;
        int second;

        public Node(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    private static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        for (int i = 1; i <= V; ++i) {
            if (!vis[i]) {
                if (checkForCycle(i, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkForCycle(int s, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        // create queue for BFS
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(s, -1));
        vis[s] = true;

        while (!q.isEmpty()) {
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();

            for (Integer it : adj.get(node)) {
                if (!vis[it]) {
                    q.add(new Node(it, node));
                    vis[it] = true;
                } else if (it != par) {
                    return true;
                }
            }
        }
        return false;
    }
}

/*Q5. Cycle in Undirected Graph
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given an undirected graph having A nodes labelled from 1 to A with M edges given in a form of matrix B of size M x 2 where (B[i][0], B[i][1]) represents two nodes B[i][0] and B[i][1] connected by an edge.

Find whether the graph contains a cycle or not, return 1 if cycle is present else return 0.

NOTE:

The cycle must contain atleast three nodes.
There are no self-loops in the graph.
There are no multiple edges between two nodes.
The graph may or may not be connected.
Nodes are numbered from 1 to A.
Your solution will run on multiple test cases. If you are using global variables make sure to clear them.


Problem Constraints

1 <= A, M <= 3*105

1 <= B[i][0], B[i][1] <= A



Input Format

The first argument given is an integer A representing the number of nodes in the graph.

The second argument given is an matrix B of size M x 2 which represents the M edges such that there is a edge between node B[i][0] and node B[i][1].



Output Format

Return 1 if cycle is present else return 0.



Example Input

Input 1:

 A = 5
 B = [  [1. 2]
        [1, 3]
        [2, 3]
        [1, 4]
        [4, 5]
     ]
Input 2:

 A = 3
 B = [  [1. 2]
        [1, 3]
     ]


Example Output

Output 1:

 1
Output 2:

 0


Example Explanation

Explanation 1:

 There is a cycle in the graph i.e 1 -> 2 -> 3 -> 1 so we will return 1
Explanation 2:

 No cycle present in the graph so we will return 0.*/

/*Method 1: DFS
Like directed graphs, we can use DFS to detect cycle in an undirected graph in O(A+M) time.
We do a DFS traversal of the given graph. For every visited vertex ‘v’, if there is an adjacent ‘u’ such that u is already visited and u is not parent of v, then there is a cycle in graph.
If we don’t find such an adjacent for any vertex, we say that there is no cycle.
The assumption of this approach is that there are no parallel edges between any two vertices


Method 2: Union-Find
We can keep track of the subsets in a 1D array, let’s call it parent[].
For each edge, make subsets using both the vertices of the edge. If both the vertices are in the same subset, a cycle is found.
Initially, all slots of parent array are initialized to -1 (means there is only one item in every subset).
Time Complexity: O(MlogA)*/


/*
const int maxn=300009;
int arr[maxn];
int sz[maxn];
void ini()
{
  for(int i=0;i<maxn;i++)
  {
    arr[i]=i;
    sz[i]=1;
  }
}
int root(int a)
{
  while(a!=arr[a])
  {
    arr[a]=arr[arr[a]];
    a=arr[a];
  }
  return a;
}
void un(int a,int b)
{
  a=root(a);
  b=root(b);
  if(sz[a]>=sz[b])
  {
    arr[b]=a;
    sz[a]+=sz[b];
  }
  else
  {
    arr[a]=b;
    sz[b]+=sz[a];
  }
}

int Solution::solve(int A, vector<vector<int> > &B) {
    ini();
    for(auto& it:B)
    {
        if(root(it[0])==root(it[1])) //cycle detection
            return 1;
        else un(it[0],it[1]); //union
    }
    return 0;

}

*/