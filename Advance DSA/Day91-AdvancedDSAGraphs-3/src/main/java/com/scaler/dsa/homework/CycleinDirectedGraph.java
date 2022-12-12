package com.scaler.dsa.homework;


import java.util.ArrayList;

public class CycleinDirectedGraph {
    static int maxn = 100009;
    static ArrayList <ArrayList< Integer >> adj;
    static int[] visited = new int[maxn];
    static int[] recStack = new int[maxn];
    public static void graph() {
        adj = new ArrayList < ArrayList < Integer > > (maxn);
        for (int i = 0; i < maxn; i++) {
            visited[i] = 0;
            recStack[i] = 0;
            adj.add(new ArrayList < Integer > ());
        }
    }
    public int solve(int A, int[][] B) {
        graph();
        for (int[] row: B)
            adj.get(row[0]).add(row[1]);
        int flag = 0;
        for (int i = 1; i <= A; i++) {
            if (visited[i] == 0 && isCyclicUtil(i) == true)
                return 1;
        }
        return 0;
    }
    public static boolean isCyclicUtil(int v) {
        if (visited[v] == 0) {
            // Mark the current node as visited and part of recursion stack
            visited[v] = 1;
            recStack[v] = 1;
            // Recur for all the vertices adjacent to this vertex
            for (int u: adj.get(v)) {
                if (visited[u] == 0 && isCyclicUtil(u) == true)
                    return true;
                else if (recStack[u] == 1)
                    return true;
            }
        }
        recStack[v] = 0; // remove the vertex from recursion stack
        return false;
    }
}
/*Q3. Cycle in Directed Graph
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an directed graph having A nodes. A matrix B of size M x 2 is given which represents the M edges such that there is a edge directed from node B[i][0] to node B[i][1].

Find whether the graph contains a cycle or not, return 1 if cycle is present else return 0.

NOTE:

The cycle must contain atleast two nodes.
There are no self-loops in the graph.
There are no multiple edges between two nodes.
The graph may or may not be connected.
Nodes are numbered from 1 to A.
Your solution will run on multiple test cases. If you are using global variables make sure to clear them.


Problem Constraints
2 <= A <= 105

1 <= M <= min(200000,A*(A-1))

1 <= B[i][0], B[i][1] <= A



Input Format
The first argument given is an integer A representing the number of nodes in the graph.

The second argument given a matrix B of size M x 2 which represents the M edges such that there is a edge directed from node B[i][0] to node B[i][1].



Output Format
Return 1 if cycle is present else return 0.



Example Input
Input 1:

 A = 5
 B = [  [1, 2]
        [4, 1]
        [2, 4]
        [3, 4]
        [5, 2]
        [1, 3] ]
Input 2:

 A = 5
 B = [  [1, 2]
        [2, 3]
        [3, 4]
        [4, 5] ]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 The given graph contain cycle 1 -> 3 -> 4 -> 1 or the cycle 1 -> 2 -> 4 -> 1
Explanation 2:

 The given graph doesn't contain any cycle.*/

/*Approach:
Depth First Traversal can be used to detect a cycle in a Graph.
DFS for a connected graph produces a tree. There is a cycle in a graph only if there is a back edge present in the graph.
A back edge is an edge that is from a node to itself (self-loop) or one of its ancestor in the tree produced by DFS.

For a disconnected graph, Get the DFS forest as output. To detect cycle, check for a cycle in individual trees by checking back edges.

To detect a back edge, keep track of vertices currently in recursion stack of function for DFS traversal.
If a vertex is reached that is already in the recursion stack, then there is a cycle in the tree.
The edge that connects current vertex to the vertex in the recursion stack is a back edge.
Use recStack[] array to keep track of vertices in the recursion stack.

Algorithm:

Create the graph using the given number of edges and vertices.
Create a recursive function that that current index or vertex, visited, and recusrsion stack.
Mark the current node as visited and also mark the index in recursion stack.
Find all the vertices which are not visited and are adjacent to current node. Recursively call the function for those vertices, If the recursive function returns true return true.
If the adjacent vertices are already marked in the recursion stack then return true.
Create a wrapper class, that calls the recursive function for all the vertices and if any function returns true return true. Else if for all vertices the function returns false return false.
Complexity Analysis:

Time Complexity: O(V+E).Time Complexity of this method is same as time complexity of DFS traversal which is O(V+E).
Space Complexity: O(V). To store the visited and recursion stack O(V) space is needed.*/