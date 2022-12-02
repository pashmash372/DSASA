package com.scaler.dsa.homework;

import java.util.ArrayDeque;
import java.util.Deque;


public class Sumofminandmax {
    public int solve(int[] A, int B) {
        int mod = 1000 * 1000 * 1000 + 7;
        // maintain increasing order of values from front to rear
        Deque<Integer> minn = new ArrayDeque<Integer>();
        // maintain decreasing order of values from front to rear
        Deque<Integer> maxx = new ArrayDeque<Integer>();
        int i = 0;

        // Process first window of size B
        for (; i < B; i++) {
            // Remove all previous greater elements that are useless.
            while (minn.size() > 0 && A[minn.getLast()] >= A[i]) {
                minn.removeLast();
            }
            // Remove all previous smaller that are elements are useless.
            while (maxx.size() > 0 && A[maxx.getLast()] <= A[i]) {
                maxx.removeLast();
            }
            // Add current element at rear of both deque
            minn.addLast(i);
            maxx.addLast(i);
        }
        long sum = A[minn.getFirst()] + A[maxx.getFirst()];

        while (i < A.length) {
            // remove all previous greater element that are useless
            while (minn.size() > 0 && A[minn.getLast()] >= A[i]) {
                minn.removeLast();
            }
            // remove all previous smaller that are elements are useless
            while (maxx.size() > 0 && A[maxx.getLast()] <= A[i]) {
                maxx.removeLast();
            }
            // Add current element at rear of both deque
            minn.addLast(i);
            maxx.addLast(i);
            // Remove all elements which are out of this window
            while (i - minn.getFirst() >= B) {
                minn.removeFirst();
            }
            while (i - maxx.getFirst() >= B) {
                maxx.removeFirst();
            }
            // Element at the front of the deque are the largest and smallest  element of previous window respectively
            sum += A[maxx.getFirst()] + A[minn.getFirst()];
            sum %= mod;
            i++;
        }
        sum += mod;
        sum %= mod;
        return (int) sum;
    }
}


/*Q1. Sum of min and max
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of both positive and negative integers.

Your task is to compute the sum of minimum and maximum elements of all sub-array of size B.

NOTE: Since the answer can be very large, you are required to return the sum modulo 109 + 7.



Problem Constraints
1 <= size of array A <= 105

-109 <= A[i] <= 109

1 <= B <= size of array



Input Format
The first argument denotes the integer array A.
The second argument denotes the value B



Output Format
Return an integer that denotes the required value.



Example Input
Input 1:

 A = [2, 5, -1, 7, -3, -1, -2]
 B = 4
Input 2:

 A = [2, -1, 3]
 B = 2


Example Output
Output 1:

 18
Output 2:

 3


Example Explanation
Explanation 1:

 Subarrays of size 4 are :
    [2, 5, -1, 7],   min + max = -1 + 7 = 6
    [5, -1, 7, -3],  min + max = -3 + 7 = 4
    [-1, 7, -3, -1], min + max = -3 + 7 = 4
    [7, -3, -1, -2], min + max = -3 + 7 = 4
    Sum of all min & max = 6 + 4 + 4 + 4 = 18
Explanation 2:

 Subarrays of size 2 are :
    [2, -1],   min + max = -1 + 2 = 1
    [-1, 3],   min + max = -1 + 3 = 2
    Sum of all min & max = 1 + 2 = 3 */

/*We will use Deque(Double-Ended Queue) and the concept of the sliding window.

We create two empty double-ended queues of size B (‘S’ , ‘G’) that only store indexes of elements of the current window that are not useless.
An element is useless if it can not be the maximum or minimum of the next subarrays.
-> In deque ‘G’, we maintain decreasing order of values from front to rear.
-> In deque ‘S’, we maintain increasing order of values from front to rear.

Maintain both Dequeue such that the front element gives maximum and minimum element respectively for each window.
Add that element to the sum variable.
Return the sum%10^9+7.
Note that the sum%10^9+7 will be in the range (0,10^9+6).

*/