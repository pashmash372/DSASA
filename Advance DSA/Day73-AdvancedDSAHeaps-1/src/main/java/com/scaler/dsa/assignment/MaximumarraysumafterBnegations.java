package com.scaler.dsa.assignment;

import java.util.PriorityQueue;

public class MaximumarraysumafterBnegations {
    public int solve(int[] A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        /*insert all elements into the queue*/
        for (int x : A)
            pq.offer(x);
        /*perform B modifications*/
        while (B > 0) {
            /*pop minimum element from the queue*/
            int x = pq.poll();
            /*if minimum element is 0 , we will use all remaining operations on this ans the result will be same */
            if (x == 0) B = 0;
                /*if minimum element is negative , modify the element to -x and push -x to queue*/
            else if (x < 0) pq.offer(-x);
            else {
                /*if remaining operations are even then in one operation we convert x to -x and in anothr -x to x. so no change if operatios are odd , we will change the number to -x .set B=0*/
                if (B % 2 == 0) pq.offer(x);
                else pq.offer(-x);

                B = 0;
                break;
            }
            B--;
        }
        int ans = 0;
        /* add all the elements in the queue to the answer */
        while (pq.size() > 0) ans += pq.poll();
        return ans;
    }
}


/*Q4. Maximum array sum after B negations
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A and an integer B. You must modify the array exactly B number of times. In a single modification, we can replace any one array element A[i] by -A[i].

You need to perform these modifications in such a way that after exactly B modifications, sum of the array must be maximum.



Problem Constraints
1 <= length of the array <= 5*105
1 <= B <= 5 * 106
-100 <= A[i] <= 100



Input Format
The first argument given is an integer array A.
The second argument given is an integer B.



Output Format
Return an integer denoting the maximum array sum after B modifications.



Example Input
Input 1:

 A = [24, -68, -29, -9, 84]
 B = 4
Input 2:

 A = [57, 3, -14, -87, 42, 38, 31, -7, -28, -61]
 B = 10


Example Output
Output 1:

 196
Output 2:

 362


Example Explanation
Explanation 1:

 Final array after B modifications = [24, 68, 29, -9, 84]
Explanation 2:

 Final array after B modifications = [57, -3, 14, 87, 42, 38, 31, 7, 28, 61]*/


/*This problem can simply be solved by just changing the minimum element A[i] to -A[i].

Keep on getting the minimum element from the array and multiply that element by -1. Do this exactly B times.

It is easy to observe that if the minimum element is zero, we can’t increase our answer by any modification.
If the minimum element is x < 0, then just change it to -x.
If the minimum element is x > 0 and the number of operations left is even. You do not need to change anything.
If the minimum element is x > 0 and the number of operations left is odd. We can directly change the number of operations left to 0 and set x to -x.

Now, just find the sum of all the elements.*/