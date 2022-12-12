package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Nmaxpaircombinations {
    public ArrayList< Integer > solve(ArrayList < Integer > A, ArrayList < Integer > B) {
        Collections.sort(A, Collections.reverseOrder());
        Collections.sort(B, Collections.reverseOrder());
        int n = A.size();

        PriorityQueue< Integer > pq = new PriorityQueue < > ();
        for (int i: A) {
            for (int j: B) {
                int s = i + j;
                if (pq.size() < n) {
                    pq.add(s);
                } else {
                    if (s > pq.peek()) {
                        pq.poll();
                        pq.add(s);
                    } else {
                        break;
                    }
                }
            }
        }

        ArrayList < Integer > ret = new ArrayList < > (pq);
        Collections.sort(ret, Collections.reverseOrder());
        return ret;
    }
}

/*Q2. N max pair combinations
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two integers arrays, A and B, of size N each.

Find the maximum N elements from the sum combinations (Ai + Bj) formed from elements in arrays A and B.



Problem Constraints
1 <= N <= 2 * 105

-1000 <= A[i], B[i] <= 1000



Input Format
The first argument is an integer array A.
The second argument is an integer array B.



Output Format
Return an integer array denoting the N maximum element in descending order.



Example Input
Input 1:

 A = [1, 4, 2, 3]
 B = [2, 5, 1, 6]
Input 2:

 A = [2, 4, 1, 1]
 B = [-2, -3, 2, 4]


Example Output
Output 1:

 [10, 9, 9, 8]
Output 2:

 [8, 6, 6, 5]


Example Explanation
Explanation 1:

 4 maximum elements are 10(6+4), 9(6+3), 9(5+4), 8(6+2).
Explanation 2:

 4 maximum elements are 8(4+4), 6(4+2), 6(4+2), 5(4+1).
*/

/*Sort both the arrays in ascending order.
Let us take the priority queue (heap).
The first max element is going to be the sum of the last two elements of array A and B, i.e. (A[n-1] + B[n-1]).
Insert that in the heap with indices of both arrays, i.e. (n-1, n-1).
Start popping from the heap (n-iterations).
And insert the sum (A[L-1]+A[R]) and (A[L]+B[R-1]).
Take care that repeating indices should not be there in the heap (use a map for that or a set).*/