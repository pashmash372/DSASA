package com.scaler.dsa.homework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElementinaSortedMatrix {
    public int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;

        PriorityQueue<Integer> q = new PriorityQueue(new CustomComp1());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (q.size() < B) q.offer(A[i][j]);
                else {
                    if (A[i][j] < q.peek()) {
                        q.poll();
                        q.offer(A[i][j]);
                    }
                }
            }
        }
        return q.peek();
    }
}

/*decreasing order*/
class CustomComp1 implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

/*Q4. Kth Smallest Element in a Sorted Matrix
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a sorted matrix of integers A of size N x M and an integer B.

Each of the rows and columns of matrix A is sorted in ascending order, find the Bth smallest element in the matrix.

NOTE: Return The Bth smallest element in the sorted order, not the Bth distinct element.



Problem Constraints
1 <= N, M <= 500

1 <= A[i] <= 109

1 <= B <= N * M



Input Format
The first argument given is the integer matrix A.
The second argument given is an integer B.



Output Format
Return the B-th smallest element in the matrix.



Example Input
Input 1:

 A = [ [9, 11, 15],
       [10, 15, 17] ]
 B = 6
Input 2:

 A = [  [5, 9, 11],
        [9, 11, 13],
        [10, 12, 15],
        [13, 14, 16],
        [16, 20, 21] ]
 B = 12


Example Output
Output 1:

 17
Output 2:

 16


Example Explanation
Explanation 1:

 6th smallest element in the sorted matrix is 17.
Explanation 2:

 12th smallest element in the sorted matrix is 16.



*/

/*We will use Max-Heap to solve this problem.

Create a Max-Heap of size B and process the element of matrix in it.
If the size of the heap is less than B, then push the element inside it.
Once the size of the heap is equal to B, then if the top element in the heap is greater than the element of the matrix, pop the element from the heap and insert the element of the matrix in the Heap.
The size of the heap still remains the same, i.e., B.

In the end, Return the top element of the Heap.
Time Complexity: O(NMlogB)*/