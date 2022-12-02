package com.scaler.dsa.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReversingElementsOfQueue {
    public int[] solve(int[] A, int B) {
        Deque<Integer> q = new ArrayDeque<>(A.length);
        int i = 0;
        /*Insert first B elements in queue*/
        for (i = 0; i < B; i++) {
            q.addLast(A[i]);
        }
        /*Reverse the first B elements in the array A*/
        while (q.size() > 0) {
            i--;
            A[i] = q.getFirst();
            q.removeFirst();
        }
        return A;
    }
}

/*Q1. Reversing Elements Of Queue
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A and an integer B, we need to reverse the order of the first B elements of the array, leaving the other elements in the same relative order.

NOTE: You are required to the first insert elements into an auxiliary queue then perform Reversal of first B elements.



Problem Constraints
1 <= B <= length of the array <= 500000
1 <= A[i] <= 100000



Input Format
The argument given is the integer array A and an integer B.



Output Format
Return an array of integer after reversing the first B elements of A using queue.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 3
Input 2:

 A = [5, 17, 100, 11]
 B = 2


Example Output
Output 1:

 [3, 2, 1, 4, 5]
Output 2:

 [17, 5, 100, 11]


Example Explanation
Explanation 1:

 Reverse first 3 elements so the array becomes [3, 2, 1, 4, 5]
Explanation 2:

 Reverse first 2 elements so the array becomes [17, 5, 100, 11]
*/

/*The idea is to use an auxiliary queue.

1) Create an empty queue.
2) Append the first B elements in the queue
3) One by one, dequeue the elements from the queue and update the array at ith position. (Initially i = B-1)
4) Repeat 3 until the queue is empty. Also, decrement i by one at each step.

*/