package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.Stack;

public class MaxRectangleinBinaryMatrix {
    public int maximalRectangle(ArrayList <ArrayList< Integer >> A) {
        int n = A.size(), m = A.get(0).size(), ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                int curAns = getMaxRect(A.get(i));
                ans = Math.max(ans, curAns);
            } else {
                for (int j = 0; j < m; j++) {
                    if (A.get(i).get(j) == 1) {
                        //A[i][j] = A[i - 1][j] + 1
                        A.get(i).set(j, A.get(i - 1).get(j) + 1);
                    }
                }
                int curAns = getMaxRect(A.get(i));
                ans = Math.max(ans, curAns);
            }
        }
        return ans;
    }

    public int getMaxRect(ArrayList < Integer > arr) {
        arr.add(0);
        Stack< Integer > st = new Stack < Integer > ();
        int i = 0, ans = 0;
        while (i < arr.size()) {
            while (!st.empty() && arr.get(st.peek()) >= arr.get(i)) {
                int h = arr.get(st.peek());
                st.pop();
                int sidx = st.empty() ? -1 : st.peek();
                ans = Math.max(h * (i - sidx - 1), ans);
            }
            st.push(i);
            i++;
        }
        return ans;
    }
}


/*Q2. Max Rectangle in Binary Matrix
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a 2-D binary matrix A of size N x M filled with 0's and 1's, find the largest rectangle containing only ones and return its area.



Problem Constraints
1 <= N, M <= 100



Input Format
The first argument is a 2-D binary array A.



Output Format
Return an integer denoting the area of the largest rectangle containing only ones.



Example Input
Input 1:

 A = [
       [1, 1, 1]
       [0, 1, 1]
       [1, 0, 0]
     ]
Input 2:

 A = [
       [0, 1, 0]
       [1, 1, 1]
     ]


Example Output
Output 1:

 4
Output 2:

 3


Example Explanation
Explanation 1:

 As the max area rectangle is created by the 2x2 rectangle created by (0, 1), (0, 2), (1, 1) and (1, 2).
Explanation 2:

 As the max area rectangle is created by the 1x3 rectangle created by (1, 0), (1, 1) and (1, 2).
*/

/*Lets max_x[i][j] denote the length of 1s in the same row i starting from (i,j).
So our current max with one end of the rectangle at (i,j) would be max_x[i][j].
As we move to the next row, there are 2 cases :
  1) max_x[i+1][j] >= max_x[i][j] which means that we can take max_x[i][j]
    1s from next column as well and extend our current rectangle as it is,
    with one more extra row.
           11100000         -    111
           11111100         -    111

  2) max_x[i+1][j] < max_x[i][j] which means that if we want to extend our
    current rectangle to next row, we need to reduce the number of columns
    in it to max_x[i+1][j]
           11100000         -     11
           11000000         -     11

As mentioned above, we keep increasing the columns and adjusting the rectangle's width.
O(N3) time complexity.

Even though N3 is acceptable, it might be worth exploring a better solution.
If you notice, laying out max_x[i][j] helps you make histograms in every row. Then the
problem becomes of finding the maximum area in histograms
( which we have solved before in Stacks and Queues ) in O(n).
This would lead to an O(N2) solution.
We strongly suggest you explore the O(N2) solution as well.*/