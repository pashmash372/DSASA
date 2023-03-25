package com.scaler.dsa.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Nodes
class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;

    UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }
}

public class CloneGraph {
    HashMap<UndirectedGraphNode, UndirectedGraphNode> map;

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        map = new HashMap<>();
        return auxCloneGraph(node);
    }

    public UndirectedGraphNode auxCloneGraph(UndirectedGraphNode node) {
        if (node == null) return node;
        if (map.containsKey(node)) {
            return map.get(node);
        }
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        map.put(node, clone);
        for (UndirectedGraphNode neighbor : node.neighbors) {
            clone.neighbors.add(auxCloneGraph(neighbor));
        }
        return clone;
    }
}
/*Q2. Clone Graph
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.

Note: The test cases are generated in the following format (use the following format to use See Expected Output option):
First integer N is the number of nodes.
Then, N intgers follow denoting the label (or hash) of the N nodes.
Then, N2 integers following denoting the adjacency matrix of a graph, where Adj[i][j] = 1 denotes presence of an undirected edge between the ith and jth node, O otherwise.



Problem Constraints
1 <= Number of nodes <= 105



Input Format
First and only argument is a node A denoting the root of the undirected graph.



Output Format
Return the node denoting the root of the new clone graph.



Example Input
Input 1:

      1
    / | \
   3  2  4
        / \
       5   6
Input 2:

      1
     / \
    3   4
   /   /|\
  2   5 7 6


Example Output
Output 1:

 Output will the same graph but with new pointers:
      1
    / | \
   3  2  4
        / \
       5   6
Output 2:

      1
     / \
    3   4
   /   /|\
  2   5 7 6


Example Explanation
Explanation 1:

 We need to return the same graph, but the pointers to the node should be different.*/

/*There are two main ways to traverse a graph: Breadth-first or Depth-first. Let’s try the Breadth-first approach first, which requires a queue. For the Depth-first approach, please see Clone Graph Part II.

How does the breadth-first traversal works? Easy, as we pop a node off the queue, we copy each of its neighbors, and push them to the queue.

A straight forward breadth-first traversal seemed to work. But some details are still missing. For example, how do we connect the nodes of the cloned graph?

Before we continue, we first need to make sure if the graph is directed or not. If you notice how Node is defined above, it is quite obvious that the graph is a directed graph. Why?

For example, A can have a neighbor called B. Therefore, we may traverse from A to B. An undirected graph implies that B can always traverse back to A. Is it true here? No, because whether B could traverse back to A depends if one of B’s neighbor is A.

The fact that B can traverse back to A implies that the graph may contain a cycle. You must take extra care to handle this case. Imagine that you finished implementing without considering this case, and later being pointed out by your interviewer that your code has an infinite loop, yuck!

Let’s analyze this further by using the below example:

A simple graph

A <-> B

Assume that the starting point of the graph is A. First, you make a copy of node A (A2), and found that A has only one neighbor B. You make a copy of B (B2) and connects A2->B2 by pushing B2 as A2′s neighbor. Next, you find that B has A as neighbor, which you have already made a copy of. Here, we have to be careful not to make a copy of A again, but to connect B2->A2 by pushing A2 as B2′s neighbor. But, how do we know if a node has already been copied?

Easy, we could use a hash table! As we copy a node, we insert it into the table. If we later find that one of a node’s neighbor is already in the table, we do not make a copy of that neighbor, but to push its neighbor’s copy to its copy instead. Therefore, the hash table would need to store a mapping of key-value pairs, where the key is a node in the original graph and its value is the node’s copy.*/