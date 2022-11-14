package com.scaler.homework;

import java.util.ArrayList;

public class AnotherCountRectangles {
    public int solve(ArrayList<Integer> A, int B) {

        long ans = 0, mod = (long) (1000000000 + 7);
        int l = 0, r = A.size() - 1;
        while (l < A.size() && r >= 0) {
            if ((long) A.get(l) * A.get(r) < B) {
//                A[l] can form rectangles with any of A[0..r]
                ans = (ans + r + 1) % mod;
                l++;
            } else
                r--;
        }
        return (int) ans;
    }
}


/*Q6. Another Count Rectangles
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given a sorted array of distinct integers A and an integer B, find and return how many rectangles with distinct configurations can be created using elements of this array as length and breadth whose area is lesser than B.

(Note that a rectangle of 2 x 3 is different from 3 x 2 if we take configuration into view)



Problem Constraints

1 <= |A| <= 100000
1 <= A[i] <= 109
1 <= B <= 109



Input Format

The first argument given is the integer array A.

The second argument given is integer B.



Output Format

Return the number of rectangles with distinct configurations with area less than B modulo (109 + 7).



Example Input

Input 1:

 A = [1, 2]
 B = 5
Input 2:

 A = [1, 2]
 B = 1


Example Output

Output 1:

 4
Output 2:

 0


Example Explanation

Explanation 1:

 All 1X1, 2X2, 1X2 and 2X1 have area less than 5.
Explanation 2:

 No Rectangle is valid.
*/

/*2 pointer technique is absolutely valid here.
We would like to consider every length and breadth and calculate it.
You can create two pointers l and r out of which initially one will point to index 0 and
another will point to last index of the array and it the rectangle formed by them is
valid the include all possible rectangles with A[l] and A[r] as length or breadth of reactangle.*/