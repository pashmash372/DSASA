package com.scaler.homework;

import java.util.ArrayList;
import java.util.HashMap;

public class Equal {
    public ArrayList<Integer> equal(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, ArrayList<Node>> hashMap = new HashMap<>();
        int n;
        int sum;
        ArrayList<Node> nodes;
        Node curNode;
        n = A.size();
        if (A == null || A.size() < 4) return res;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = A.get(i) + A.get(j);
                curNode = new Node(i, j);
                if (hashMap.containsKey(sum)) {
                    nodes = hashMap.get(sum);
                } else {
                    nodes = new ArrayList<>();
                }
                nodes.add(curNode);
                hashMap.put(sum, nodes);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = A.get(i) + A.get(j);
                curNode = new Node(i, j);
                if (hashMap.containsKey(sum)) {
                    nodes = hashMap.get(sum);
                    for (Node node : nodes) {
                        if (overlaps(curNode, node)) continue;
                        res.add(curNode.i);
                        res.add(curNode.j);
                        res.add(node.i);
                        res.add(node.j);
                        return res;
                    }
                }
            }
        }
        return res;
    }

    public boolean overlaps(Node n1, Node n2) {
        return n1.i == n2.i || n1.i == n2.j || n1.j == n2.i || n1.j == n2.j;
    }

    class Node {
        int i, j;

        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}


/*Q2. Equal
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of N integers, find the index of values that satisfy P + Q = R + S, where P, Q, R & S are integers values in the array

Expected time complexity O(N2)

NOTE:

1) Return the indices `A1 B1 C1 D1`, so that
  A[A1] + A[B1] = A[C1] + A[D1]
  A1 < B1, C1 < D1
  A1 < C1, B1 != D1, B1 != C1

2) If there are more than one solutions,
   then return the tuple of values which are lexicographical smallest.

Assume we have two solutions
S1 : A1 B1 C1 D1 ( these are values of indices in the array )
S2 : A2 B2 C2 D2

S1 is lexicographically smaller than S2 if:
  A1 < A2 OR
  A1 = A2 AND B1 < B2 OR
  A1 = A2 AND B1 = B2 AND C1 < C2 OR
  A1 = A2 AND B1 = B2 AND C1 = C2 AND D1 < D2
If no solution is possible, return an empty list.



Problem Constraints
1 <= N <= 1000

0 <= A[i] <= 1000



Input Format
First and only argument is an integer array A of length N.



Output Format
Return an array of size four which contains indices of values P, Q, R, and S.



Example Input
Input 1:

 A = [3, 4, 7, 1, 2, 9, 8]
Input 2:

 A = [2, 5, 1, 6]


Example Output
Output 1:

 [0, 2, 3, 5]
Output 2:

 [0, 1, 2, 3]


Example Explanation
Explanation 1:

 A[0] + A[2] = A[3] + A[5]
 Note: indexes returned should be 0-based.
Explanation 2:

 A[0] + A[1] = A[2] + A[3]*/


/*The basic idea is that we can mantain the sum of each of the pairs of the elements (i.e. a(i)+a(j) for all 1<=i<=n & i+1<=j<=n) in a hash map.
And whenever the count of the sum of pairs of elements becomes >=2 we just need to check if all the indexes are distict, if they are then just return the solution.

Loop i = 1 to N :
    Loop j = i + 1 to N :
        calculate sum
        If in hash table any index already exist for sum then
            try to find out that it is valid solution or not IF Yes Then update solution
        update hash table
    EndLoop;
EndLoop;
*/