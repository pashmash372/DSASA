package com.scaler.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BClosestPointstoOrigin {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        // sorts the list based on euclidean distance from origin
        Collections.sort(A, new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                long d1 = (long) a.get(0) * a.get(0) + (long) a.get(1) * a.get(1);
                long d2 = (long) b.get(0) * b.get(0) + (long) b.get(1) * b.get(1);
                if (d1 < d2) return -1;
                else if (d2 < d1) return 1;
                else return 0;
            }
        });
        for (int i = 0; i < B; i++) {
            ans.add(A.get(i));
        }
        return ans;
    }
}



/*Q3. B Closest Points to Origin
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
We have a list A of points (x, y) on the plane. Find the B closest points to the origin (0, 0).

Here, the distance between two points on a plane is the Euclidean distance.

You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in.)

NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2) is sqrt( (x1-x2)2 + (y1-y2)2 ).



Problem Constraints
1 <= B <= length of the list A <= 105
-105 <= A[i][0] <= 105
-105 <= A[i][1] <= 105



Input Format
The argument given is list A and an integer B.



Output Format
Return the B closest points to the origin (0, 0) in any order.



Example Input
Input 1:

 A = [
       [1, 3],
       [-2, 2]
     ]
 B = 1
Input 2:

 A = [
       [1, -1],
       [2, -1]
     ]
 B = 1


Example Output
Output 1:

 [ [-2, 2] ]
Output 2:

 [ [1, -1] ]


Example Explanation
Explanation 1:

 The Euclidean distance will be sqrt(10) for point [1,3] and sqrt(8) for point [-2,2].
 So one closest point will be [-2,2].
Explanation 2:

 The Euclidean distance will be sqrt(2) for point [1,-1] and sqrt(5) for point [2,-1].
 So one closest point will be [1,-1].*/