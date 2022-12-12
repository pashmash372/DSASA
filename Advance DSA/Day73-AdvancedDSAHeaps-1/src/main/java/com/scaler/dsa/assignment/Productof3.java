package com.scaler.dsa.assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Productof3 {
    public int[] solve(int[] A) {
        /* n is the size of the vector */
        int n = A.length;
        /* intialize an answer vector */
        ArrayList<Integer> ans = new ArrayList<>();
        /* Intialize a priority queue */
        PriorityQueue<Integer> pq = new PriorityQueue<>(new CustomComp1());
        for (int i = 0; i < n; i++) {
            /* Add element in priority queue */
            pq.offer(A[i]);
            /* Append -1 to answer as number of elements are < 3*/
            if (i < 2) {
                ans.add(-1);
            } else {
                /* take 3 maximum elements from queue*/
                int a = pq.poll();
                int b = pq.poll();
                int c = pq.poll();

                /*add all these numbers back to queue*/
                pq.offer(a);
                pq.offer(b);
                pq.offer(c);

                /*append the product to answer*/
                ans.add(a * b * c);
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++)
            res[i] = ans.get(i);
        return res;
    }
}

class CustomComp1 implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

/*Q3. Product of 3
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer array A of size N.

You have to find the product of the three largest integers in array A from range 1 to i, where i goes from 1 to N.

Return an array B where B[i] is the product of the largest 3 integers in range 1 to i in array A. If i < 3, then the integer at index i in B should be -1.



Problem Constraints
1 <= N <= 105
0 <= A[i] <= 103



Input Format
First and only argument is an integer array A.



Output Format
Return an integer array B. B[i] denotes the product of the largest 3 integers in range 1 to i in array A.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [10, 2, 13, 4]


Example Output
Output 1:

 [-1, -1, 6, 24, 60]
Output 2:

 [-1, -1, 260, 520]


Example Explanation
Explanation 1:

 For i = 1, ans = -1
 For i = 2, ans = -1
 For i = 3, ans = 1 * 2 * 3 = 6
 For i = 4, ans = 2 * 3 * 4 = 24
 For i = 5, ans = 3 * 4 * 5 = 60

 So, the output is [-1, -1, 6, 24, 60].

Explanation 2:

 For i = 1, ans = -1
 For i = 2, ans = -1
 For i = 3, ans = 10 * 2 * 13 = 260
 For i = 4, ans = 10 * 13 * 4 = 520

 So, the output is [-1, -1, 260, 520].

*/

/*If we have traversed the array till some number (say ith number), we will only add numbers further to it, and no deletion will occur.

A max heap will have the largest number at the top of it. Once the top number is removed, it will have the second-largest number at the top. Once the second-largest number is removed, we will have the third-largest number at the top.

Using these two observations, we can devise the following algorithm to compute the product of the three largest numbers from the first number to ith number.

Take the ith number, and add it to the max heap.
Take the top number, this is the largest number from first number to the ith number. Store this in your product.
Delete the largest number. Now, the top number will have the second largest number. Take this and multiply to the product.
Delete the top element of the max heap and now the top element is the third largest number. Read that and multiply to the product so far to get the product of the three largest numbers from first to ith number.
We can directly use priority queues (from STL in CPP) since they are already an implementation of the max heaps.

The above runs for each number in the list, and hence the worst-case time complexity would be O(n log(n)) which would easily fit with the constraints.*/