package com.scaler.dsa.assignment;


import java.util.ArrayList;

public class PossibilityofFinishing {
    static int maxn = 100009;
    static ArrayList <ArrayList< Integer >> g;
    static int[] visited = new int[maxn];
    static int f = 0;
    public static void graph() {
        g = new ArrayList < ArrayList < Integer > > (maxn);
        for (int i = 0; i < maxn; i++) {
            visited[i] = 0;
            g.add(new ArrayList < Integer > ());
        }
    }
    public int solve(int A, int[] B, int[] C) {
        graph();
        for (int i = 0; i < B.length; i++) {
            g.get(B[i]).add(C[i]);
        }
        for (int i = 1; i <= A; i++) {
            if (visited[i] == 0) {
                f = 0;
                check_cycle(i);
                if (f == 1)
                    break;
            }
        }
        f = 1 - f;
        return f;
    }
    public static void check_cycle(int u) {
        visited[u] = 1;
        for (int v: g.get(u)) {
            if (visited[v] == 0)
                check_cycle(v);
            else if (visited[v] == 1)
                f = 1;
        }
        visited[u] = 2;
    }
}
/*Q2. Possibility of Finishing
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
There are a total of A courses you have to take, labeled from 1 to A.

Some courses may have prerequisites, for example to take course 2 you have to first take course 1, which is expressed as a pair: [1,2].

So you are given two integer array B and C of same size where for each i (B[i], C[i]) denotes a pair.

Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?

Return 1 if it is possible to finish all the courses, or 0 if it is not possible to finish all the courses.



Problem Constraints
1 <= A <= 6*104

1 <= length(B) = length(C) <= 105

1 <= B[i], C[i] <= A



Input Format
The first argument of input contains an integer A, representing the number of courses.

The second argument of input contains an integer array, B.

The third argument of input contains an integer array, C.



Output Format
Return 1 if it is possible to finish all the courses, or 0 if it is not possible to finish all the courses.



Example Input
Input 1:

 A = 3
 B = [1, 2]
 C = [2, 3]
Input 2:

 A = 2
 B = [1, 2]
 C = [2, 1]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 It is possible to complete the courses in the following order:
    1 -> 2 -> 3
Explanation 2:

 It is not possible to complete all the courses.
*/

/*Consider a graph with courses from 1 to N representing the nodes of the graph and each prerequisite pair [u, v] correspond to a directed edge from u to v.

It is obvious that we will get several disjoint components of the graph.

When is it possible for you to finish all the courses?

The problem reduces down to finding a directed cycle in the whole graph. If any such cycle is present, it is not possible to finish all the courses.

Depth First Traversal(DFS) can be used to detect cycle in a Graph. There is a cycle in a graph only if there is a back edge present in the graph. A back edge is an edge that is from a node to itself (self loop) or one of its ancestor in the tree produced by DFS.

For a disconnected graph, we can check for cycle in individual DFS trees by checking back edges.

We can use various methods for detecting a back edge. One of the method is by using the method of coloring. Assume the non-visited node are colored black, the nodes currently present in the recursion stack are colored blue and the nodes already visited and out of the recursion stack are colored grey. The edge that connects current vertex in DFS to the vertex in the recursion stack(blue coloured node) is back edge.*/