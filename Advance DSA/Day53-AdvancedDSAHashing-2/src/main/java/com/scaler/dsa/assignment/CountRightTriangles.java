package com.scaler.dsa.assignment;


import java.util.HashMap;

public class CountRightTriangles {
    public int solve(int[] a, int[] b) {
        int n = a.length;
        // stores the frequency of each x coordinate
        HashMap< Integer, Integer > mpx = new HashMap < Integer, Integer > ();
        // stores the frequency of each y coordinate
        HashMap < Integer, Integer > mpy = new HashMap < Integer, Integer > ();
        for (int i = 0; i < n; i++) {
            if (mpx.get(a[i]) == null) {
                mpx.put(a[i], 1);
            } else
                mpx.put(a[i], mpx.get(a[i]) + 1);

            if (mpy.get(b[i]) == null) {
                mpy.put(b[i], 1);
            } else
                mpy.put(b[i], mpy.get(b[i]) + 1);
        }
        long ans = 0, mod = 1000 * 1000 * 1000 + 7;
        for (int i = 0; i < n; i++) {
            // counts the no of triangles that forms a right angle at the i-th point
            ans = (ans + (mpx.get(a[i]) - 1) * (mpy.get(b[i]) - 1)) % mod;
        }
        return (int) ans;
    }
}

/*Q2. Count Right Triangles
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two arrays of integers A and B of size N each, where each pair (A[i], B[i]) for 0 <= i < N represents a unique point (x, y) in 2D Cartesian plane.

Find and return the number of unordered triplets (i, j, k) such that (A[i], B[i]), (A[j], B[j]) and (A[k], B[k]) form a right-angled triangle with the triangle having one side parallel to the x-axis and one side parallel to the y-axis.

NOTE: The answer may be large so return the answer modulo (109 + 7).



Problem Constraints
1 <= N <= 105

0 <= A[i], B[i] <= 109



Input Format
The first argument given is an integer array A.
The second argument given is the integer array B.



Output Format
Return the number of unordered triplets that form a right angled triangle modulo (109 + 7).



Example Input
Input 1:

 A = [1, 1, 2]
 B = [1, 2, 1]
Input 2:

 A = [1, 1, 2, 3, 3]
 B = [1, 2, 1, 2, 1]


Example Output
Output 1:

 1
Output 2:

 6


Example Explanation
Explanation 1:

 All three points make a right angled triangle. So return 1.
Explanation 2:

 6 triplets which make a right angled triangle are:    (1, 1), (1, 2), (2, 2)
                                                       (1, 1), (3, 1), (1, 2)
                                                       (1, 1), (3, 1), (3, 2)
                                                       (2, 1), (3, 1), (3, 2)
                                                       (1, 1), (1, 2), (3, 2)
                                                       (1, 2), (3, 1), (3, 2)*/


/*Try fixing each point as the intersection of perpendicular and base and finding other points.

Once it is fixed, for the other two points, one point will share the same x-coordinate, and the other point will share the same
y-coordinate with the selected point.

We can use a map to store the points for points sharing the same x or y coordinate.*/