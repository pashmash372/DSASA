package com.scaler.dsa.homework;


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
                else if (d2 < d1) return 1; // increasing order
                else return 0;
            }
        });
        for (int i = 0; i < B; i++) {
            ans.add(A.get(i));
        }
        return ans;
    }
}

/*Java Solution using Merge Sort*/


class BClosestPointstoOrigin1 {
    public int[][] solve(int[][] A, int B) {
        int n = A.length;
        mergeSort(A, 0, n - 1);
        int[][] ans = new int[B][2];
        for (int i = 0; i < ans.length; i++) {
            ans[i][0] = A[i][0];
            ans[i][1] = A[i][1];
        }
        return ans;
    }

    public void mergeSort(int[][] A, int s, int e) {
        if (s >= e) return;
        int mid = (s + e) / 2;
        mergeSort(A, s, mid);
        mergeSort(A, mid + 1, e);
        merge(A, s, mid, e);
    }

    public void merge(int[][] A, int s, int mid, int e) {
        int n1 = mid - s + 1; //number of elements in array1
        int n2 = e - mid;//number of elements in array2
        int[][] A1 = new int[n1][2];
        int[][] A2 = new int[n2][2];
        int index = 0;

        //filling A1 and A2
        for (int i = s; i <= mid; i++) {
            A1[index][0] = A[i][0];
            A1[index][1] = A[i][1];
            index++;
        }

        index = 0;
        for (int i = mid + 1; i <= e; i++) {
            A2[index][0] = A[i][0];
            A2[index][1] = A[i][1];
            index++;
        }
        int i = 0, j = 0; // i and j referncing A1 and A2 array respectively
        index = s; // important

        while (i < n1 && j < n2) {
            long s1 = ((long) A1[i][0] * A1[i][0]) + ((long) A1[i][1] * A1[i][1]);
            long s2 = ((long) A2[j][0] * A2[j][0]) + ((long) A2[j][1] * A2[j][1]);
            if (s1 < s2) {// equals to condition for equal elements
                A[index][0] = A1[i][0];
                A[index][1] = A1[i][1];
                index++;
                i++;
            } else {
                A[index][0] = A2[j][0];
                A[index][1] = A2[j][1];
                index++;
                j++;
            }
        }
        //if some elements still remaining after traversal
        if (i < n1) {
            while (i < n1) {
                A[index][0] = A1[i][0];
                A[index][1] = A1[i][1];
                index++;
                i++;
            }
        } else {
            while (j < n2) {
                A[index][0] = A2[j][0];
                A[index][1] = A2[j][1];
                index++;
                j++;
            }
        }
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
 So one closest point will be [1,-1].
*/

/*Sort the list of these points with respect to the distance from the origin.
We can do this with the help of a comparator function, which takes two elements of the array as input
and returns which one will be smaller than the other. So basically, it takes care of the comparison process.

After the list is sorted, take the first B elements from the list and create a new list and return it.
Think of calculating the Euclidean distance and storing it efficiently.

Time Complexity - O(N log N)
Space Complexity - O(N)*/