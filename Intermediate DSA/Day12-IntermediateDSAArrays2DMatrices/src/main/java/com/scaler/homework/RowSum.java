package com.scaler.homework;


public class RowSum {
    public int[] solve(int[][] A) {
        int n = A.length, m = A[0].length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            int temp = 0;
            // Finding sum of elements of ith row
            for(int j = 0; j < m; j++){
                temp += A[i][j];
            }
            ans[i] = temp;
        }
        return ans;
    }
}


/*Q4. Row Sum
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a 2D integer matrix A, return a 1D integer array containing row-wise sums of original matrix.



Problem Constraints

1 <= A.size() <= 103

1 <= A[i].size() <= 103

1 <= A[i][j] <= 103



Input Format
First argument A is a 2D array of integers.(2D matrix).



Output Format
Return an array conatining row-wise sums of original matrix.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output
Output 1:

[10,26,18]


Example Explanation
Explanation 1

Row 1 = 1+2+3+4 = 10
Row 2 = 5+6+7+8 = 26
Row 3 = 9+2+3+4 = 18*/

/*Iterate the 2D vector row wise using a for loop and by
store the sum of row in a variable
push the sum in a list after the completion of each row and return the lis*/