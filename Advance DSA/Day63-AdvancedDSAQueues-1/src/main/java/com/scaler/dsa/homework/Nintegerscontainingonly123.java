package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Nintegerscontainingonly123 {
    public ArrayList<Integer> solve(int A) {
        Queue<Integer> q = new LinkedList<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        int cnt = 3;
        while (ans.size() < A) {
            int x = q.peek();
            ans.add(x);
            q.remove();
            if (cnt >= A) continue;
            // append 1, 2 and 3 to the current number
            q.add(10 * x + 1);
            q.add(10 * x + 2);
            q.add(10 * x + 3);
            cnt += 3;
        }
        return ans;
    }
}


/*Q2. N integers containing only 1, 2 & 3
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer, A. Find and Return first positive A integers in ascending order containing only digits 1, 2, and 3.

NOTE: All the A integers will fit in 32-bit integers.



Problem Constraints
1 <= A <= 29500



Input Format
The only argument given is integer A.



Output Format
Return an integer array denoting the first positive A integers in ascending order containing only digits 1, 2 and 3.



Example Input
Input 1:

 A = 3
Input 2:

 A = 7


Example Output
Output 1:

 [1, 2, 3]
Output 2:

 [1, 2, 3, 11, 12, 13, 21]


Example Explanation
Explanation 1:

 Output denotes the first 3 integers that contains only digits 1, 2 and 3.
Explanation 2:

 Output denotes the first 3 integers that contains only digits 1, 2 and 3.
*/

/*We know the initial three values will be 1, 2, and 3.

Now, the upcoming values will be by appending 1, 2, and 3 in each given value.

We will use a queue to store the elements in ascending order.*/