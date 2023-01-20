package com.scaler.dsa.assignment;


public class ChristmasTrees {
    public int solve(int[] A, int[] B) {
        final int inf = (int)(1e9 + 10);
        int n = A.length;
        int ans = inf;

        // i -> center
        for(int i = 0 ; i < n ; i++){

            int left_min = inf , right_min = inf;

            // left min calculated
            for(int j = 0 ; j < i ; j++){
                if(A[j] < A[i]){
                    left_min = Math.min(left_min, B[j]);
                }
            }

            // right min calculated
            for(int j = i + 1 ; j < n ; j++){
                if(A[j] > A[i]){
                    right_min = Math.min(right_min, B[j]);
                }
            }

            int temp_ans = left_min + B[i] + right_min;

            ans = Math.min(ans , temp_ans);
        }
        if(ans == inf) ans = -1;
        return ans;
    }
}

/*Q2. Christmas Trees
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
The cost of these trees is Bp + Bq + Br.

You are to choose 3 trees such that their total cost is minimum. Return that cost.

If it is not possible to choose 3 such trees return -1.



Problem Constraints
1 <= A[i], B[i] <= 109
3 <= size(A) = size(B) <= 3000



Input Format
First argument is an integer array A.
Second argument is an integer array B.



Output Format
Return an integer denoting the minimum cost of choosing 3 trees whose heights are strictly in increasing order, if not possible, -1.



Example Input
Input 1:

 A = [1, 3, 5]
 B = [1, 2, 3]
Input 2:

 A = [1, 6, 4, 2, 6, 9]
 B = [2, 5, 7, 3, 2, 7]


Example Output
Output 1:

 6
Output 2:

 7


Example Explanation
Explanation 1:

 We can choose the trees with indices 1, 2 and 3, and the cost is 1 + 2 + 3 = 6.
Explanation 2:

 We can choose the trees with indices 1, 4 and 5, and the cost is 2 + 3 + 2 = 7.
 This is the minimum cost that we can get.*/

/*To solve this, let’s take three indices, p, q and r.

p is the index of the tree that is to be chosen first, i.e. the one with the smallest height.
q is the index of the tree that is to be chosen second, i.e. the one with the middle height.
r is the index of the tree that is to be chosen third, i.e. the one with the largest height.
We should now traverse the array by fixing index q. Lets N be the size of the array.

For q, that goes from index q+1 to N-1, we can find an index p that goes from 1 to q-1 such that A[p] < A[q], and B[p] is minimum.
Similarly, find an index r that goes from q+1 to N such that A[r] > A[q], and B[r] is minimum.

This way, for all q we can find the minimum values, and we choose the minimum values from all the q values.

Time Complexity : O(n^2)
Space Complexity(extra) : O(1)*/