package com.scaler.dsa.assignment;


public class SIXLETS {
    int sixlets(int a[], int i, int sum, int cnt) {
        if (sum > 1000)
            return 0;
        if (cnt == 0)
            return 1;
        if (i == a.length)
            return 0;
        // Take ith element or leave it.
        return sixlets(a, i + 1, sum, cnt) + sixlets(a, i + 1, sum + a[i], cnt - 1);
    }
    public int solve(int[] A, int B) {
        return sixlets(A, 0, 0, B);
    }
}

/*Q3. SIXLETS
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a array of integers A of size N and an integer B.

Return number of non-empty subsequences of A of size B having sum <= 1000.



Problem Constraints
1 <= N <= 20

1 <= A[i] <= 1000

1 <= B <= N



Input Format
The first argument given is the integer array A.

The second argument given is the integer B.



Output Format
Return number of subsequences of A of size B having sum <= 1000.



Example Input
Input 1:

    A = [1, 2, 8]
    B = 2
Input 2:

    A = [5, 17, 1000, 11]
    B = 4


Example Output
Output 1:

3
Output 2:

0


Example Explanation
Explanation 1:

 {1, 2}, {1, 8}, {2, 8}
Explanation 1:

 No valid subsequence

*/

/*For N <= 20, we can use the recursion technique to count all non-empty subsequences of A of size B having sum <= 1000.

initialize ans = 0
Consider we are at ith index with: current sum of subsequence = curSum
current size of subsequence = curSize

if (curSize == B && curSum <= 1000)
    increment the ans;
else
    for(int j = i+1; j<A.size();j++){
        Add the jth element to the current subsequence
        and recur for the next index with curSum = curSum + A[j]
                                          curSize = curSize + 1
    } */