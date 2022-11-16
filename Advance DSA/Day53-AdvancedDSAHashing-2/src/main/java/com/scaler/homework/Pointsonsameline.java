package com.scaler.homework;


import java.util.ArrayList;
import java.util.HashMap;

public class Pointsonsameline {
    public int __gcd(int x, int y) {
        if (x == 0) return y;
        return __gcd(y % x, x);
    }

    public int solve(int[] A, int[] B) {
        return maxpointsonsameline(A, B);
    }

    public int maxpointsonsameline(int[] x, int[] y) {
        int n = x.length;
        if (n < 3) return n;
        int ans = 0;
        int curmax = 0, overlap = 0, vertical = 0;
        for (int i = 0; i < n; ++i) {
            curmax = 0;
            overlap = 0;
            vertical = 0;
            HashMap<ArrayList<Integer>, Integer> mp = new HashMap<ArrayList<Integer>, Integer>();
            for (int j = i + 1; j < n; ++j) {
                if (x[i] == x[j] && y[i] == y[j]) ++overlap;
                else if (x[i] == x[j]) ++vertical;
                else {
                    int xdiff = x[j] - x[i];
                    int ydiff = y[j] - y[i];
                    int z = __gcd(xdiff, ydiff);
                    xdiff /= z;
                    ydiff /= z;
                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(xdiff);
                    tmp.add(ydiff);
                    // mp stores the slope of the line between i-th and j-th point
                    if (mp.get(tmp) == null) {
                        mp.put(tmp, 1);
                    } else {
                        mp.put(tmp, mp.get(tmp) + 1);
                    }
                    curmax = Math.max(curmax, mp.get(tmp));
                }
                curmax = Math.max(curmax, vertical);
            }
            ans = Math.max(ans, curmax + overlap + 1);
        }
        return ans;
    }
}


/*Q1. Points on same line
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two arrays of integers A and B describing a pair of (A[i], B[i]) coordinates in a 2D plane. A[i] describe x coordinates of the ith point in the 2D plane, whereas B[i] describes the y-coordinate of the ith point in the 2D plane.

Find and return the maximum number of points that lie on the same line.



Problem Constraints
1 <= (length of the array A = length of array B) <= 1000

-105 <= A[i], B[i] <= 105



Input Format
The first argument is an integer array A.
The second argument is an integer array B.



Output Format
Return the maximum number of points which lie on the same line.



Example Input
Input 1:

 A = [-1, 0, 1, 2, 3, 3]
 B = [1, 0, 1, 2, 3, 4]
Input 2:

 A = [3, 1, 4, 5, 7, -9, -8, 6]
 B = [4, -8, -3, -2, -1, 5, 7, -4]


Example Output
Output 1:

 4
Output 2:

 2


Example Explanation
Explanation 1:

 The maximum number of point which lie on same line are 4, those points are {0, 0}, {1, 1}, {2, 2}, {3, 3}.
Explanation 2:

 Any 2 points lie on a same line.
*/


/*If the two points are (x1, y1) and (x2, y2), then their slope will be (y2 – y1) / (x2 – x1), which can be a double value and can cause precision problems.

To get rid of the precision problems, we treat slope as pair ((y2 – y1), (x2 – x1)) instead of ratio and reduce pair by their gcd before inserting into the map.

Points that are vertical or repeated are treated separately.

Note: If we use a map in C++ or HashMap in Java for storing the slope pair, then the total time complexity of the solution will be O(n^2 logn)*/