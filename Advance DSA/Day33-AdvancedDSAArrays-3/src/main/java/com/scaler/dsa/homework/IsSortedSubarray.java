package com.scaler.dsa.homework;


public class IsSortedSubarray {
    public int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int q = B.length;
        int ans[] = new int[q];
        int pref[] = new int[n+1];
        for(int i=0 ; i<=n ; i++)pref[i] = 0;
        for(int i=0 ; i<n-1 ; i++){
            if(A[i] > A[i+1])pref[i] = 1;
        }
        for(int i=1 ; i<n ; i++)pref[i] += pref[i-1];
        for(int i=0 ; i<q ; i++){
            int l = B[i][0] - 2;
            int r = B[i][1] - 2;
            if(l==r)ans[i] = 1;
            else{
                int d = pref[r];
                if(l>=0)d -= pref[l];
                if(d==0)ans[i] = 1;
                else ans[i] = 0;
            }
        }
        return ans;
    }
}

/*Q5. IsSorted Subarray
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of size N. You have to handle Q queries of the form
L R - Answer 1 if the subarray of A from index L to R is sorted else answer 0.
Given a 2D integer array B which represents the queries, where the ith query is
B[i][0] = L, B[i][1] = R.
Return an integer array representing the answer to the queries in input order.

Note - Assume indexing starts from 1


Problem Constraints
1 <= N <= 105
-109 <= A[i] <= 109
1 <= L <= R <= N
1 <= Q <= 2 * 105


Input Format
The first argument is an integer array A.
The second argument is a 2D integer array B.


Output Format
Return an integer array that represents the answer to the queries in input order.


Example Input
Input 1:-
A = [-9, -30, 28, 14, -10, 16, 14, -6, -25]
B = [[3, 8], [1, 1], [7, 8]]
Input 2:-
A = [3, 20, -6, 28]
B = [[3, 4], [2, 3], [4, 4]]


Example Output
Output 1:-
0 1 0
Output 2:-
1 0 1


Example Explanation
Explanation 1:-
First Query L = 3, R = 8, Subarray [28, 14, -10, 16, 14, -6] which is not sorted so output is 0.
Second query Subarray [-9], which is sorted so output is 1
Third query Subarray [14, -6], which is not sorted so output is 0.
Explanation 2:-
First Query Subarray is [-6, 28] which is sorted so output is 1.
Second Query Subarray is [20, -6] which is not sorted so output is 0.
Third Query Subarray is [28] which is sorted so output is 1.
*/

/*If a subarray is not sorted then for any index i in the subarray A[i] > A[i+1].
Try to use this property and store some data about the array before answering the queries.

Create a new array X where X[i] = 1 if A[i] > A[i+1]. Now create a new array Y where Y[i] = Y[i-1] + X[i].
Y is simply the prefix sum array of X. Now answer the queries. If d = Y[R] - Y[L] > 0, then the array was not sorted.
Time Complexity - O(N + Q)
Space Complexity - O(N)*/