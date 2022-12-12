package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.Collections;

public class EdgeinMST {
    static int maxn = 300009;
    static int[] arr = new int[maxn];
    static int[] sz = new int[maxn];
    static ArrayList< pair > edges;
    public int[] solve(int A, int[][] B) {
        ini();
        for (int i = 0; i < B.length; i++)
            edges.add(new pair(B[i][2], i, B[i][0], B[i][1]));
        int[] ans = new int[B.length];
        Collections.sort(edges);
        int i = 0;
        int m = B.length;
        while (i < m) {
            int j = i;
            while (j < m && edges.get(j).a == edges.get(i).a) {
                if (root(edges.get(j).c) != root(edges.get(j).d))
                    ans[edges.get(j).b] = 1;
                j++;
            }
            j = i;
            while (j < m && edges.get(j).a == edges.get(i).a) {
                if (root(edges.get(j).c) != root(edges.get(j).d))
                    un(edges.get(j).c, edges.get(j).d);
                j++;
            }
            i = j;
        }
        return ans;
    }
    public static void ini() {
        edges = new ArrayList < pair > ();
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
class pair implements Comparable < pair > {
    int a, b, c, d;
    pair(int e, int f, int g, int h) {
        this.a = e;
        this.b = f;
        this.c = g;
        this.d = h;
    }
    @Override
    public int compareTo(pair aa) {
        return this.a - aa.a;
    }
}
/*Q3. Edge in MST
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given a undirected weighted graph with A nodes labelled from 1 to A with M edges given in a form of 2D-matrix B of size M * 3 where B[i][0] and B[i][1] denotes the two nodes connected by an edge of weight B[i][2].

For each edge check whether it belongs to any of the possible minimum spanning tree or not , return 1 if it belongs else return 0.

Return an one-dimensional binary array of size M denoting answer for each edge.

NOTE:

The graph may be disconnected in that case consider mst for each component.
No self-loops and no multiple edges present.
Answers in output array must be in order with the input array B output[i] must denote the answer of edge B[i][0] to B[i][1].


Problem Constraints

1 <= A, M <= 3*105

1 <= B[i][0], B[i][1] <= A

1 <= B[i][1] <= 103



Input Format

The first argument given is an integer A representing the number of nodes in the graph.

The second argument given is an matrix B of size M x 3 which represents the M edges such that there is a edge between node B[i][0] and node B[i][1] with weight B[i][2].



Output Format

Return an one-dimensional binary array of size M denoting answer for each edge.



Example Input

Input 1:

 A = 3
 B = [ [1, 2, 2]
       [1, 3, 2]
       [2, 3, 3]
     ]


Example Output

Output 1:

 [1, 1, 0]


Example Explanation

Explanation 1:

 Edge (1, 2) with weight 2 is included in the MST           1
                                                          /   \
                                                         2     3
 Edge (1, 3) with weight 2 is included in the same MST mentioned above.
 Edge (2,3) with weight 3 cannot be included in any of the mst possible.
 So we will return [1, 1, 0]*/

/*This is an easy modification of Kruskal’s algorithm.

Note that if all the weights are unique, the minimum spanning tree is also unique and Kruskal’s algorithm will construct it. Thus, the only “freedom of choice” we have in the general case is the order in which Kruskal’s algorithm will process groups of edges that share the same weight.

As you execute Kruskal’s algorithm, whenever you encounter multiple edges that share the same weight, process them all at once as follows:

For each edge, check whether its endpoints currently lie in different components.
If they do, this edge can be a part of a minimum spanning tree, because if you process it as the first edge from this batch of edges, it will be added to the spanning tree.
If they don’t, this edge cannot be a part of a minimum spanning tree.
Process all the edges from the current batch as you would in the standard algorithm. The order in which you process them does not matter, the resulting connected components will clearly always be the same.*/