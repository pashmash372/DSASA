package com.scaler.dsa.assignment;


import java.util.HashSet;

class Point {

    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashCode() {
        return (x + y) % 100;
    }

    public boolean equals(Object obj) {

        Point o = (Point) obj;

        return this.x == o.x && this.y == o.y;
    }
}

class Unique2Dpoints1 {
    public int solve(int[][] A) {

        HashSet<Point> set = new HashSet<>();

        int n = A.length;

        int m = A[0].length;

        for (int i = 0; i < n; i++) {

            Point pi = new Point(A[i][0], A[i][1]);

            set.add(pi);
        }

        return set.size();
    }
}


public class Unique2Dpoints {

    /*int Solution::solve(vector <vector <int>> &A){
    for(auto it:A)assert(it[0]>=-1e9 && it[0]<=1e9 && it[1]>=-1e9 && it[1]<=1e9);
    set <pair<int,int>> st;
    for(auto it:A)st.insert({it[0],it[1]});
    return st.size();
}*/
}
/*Q3. Unique 2D points
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a 2D array A of integer points on a 2D plane. Find and return the number of unique points in the array.
The ith point in the array is (A[i][0], A[i][1])


Problem Constraints
1 <= len(A) <= 105
-109 <= A[i][0], A[i][1] <= 109


Input Format
The first argument is a 2D integer array A.


Output Format
Return an integer that is the number of unique points.


Example Input
Input:
A = [[5, 6],
     [2, 8],
     [-1, -1],
     [2, -3],
     [2, 8],
     [7, 7],
     [2, -3]]


Example Output
Output:
5


Example Explanation
Explanation:
There are 5 unique points in the given array.
*/

/*Use a data structure to store the points and return the total number of unique points.

In C++ we can use Sets, maps etc with keys as pairs. In Python we can use dictionary with key as tuple.
Time Complexity - O(N)
Space Complexity - O(N)
Check Implementation for details.*/