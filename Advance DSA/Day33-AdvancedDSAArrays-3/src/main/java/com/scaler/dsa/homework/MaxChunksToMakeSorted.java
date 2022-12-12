package com.scaler.dsa.homework;



public class MaxChunksToMakeSorted {
    public int solve(int[] A) {
        int cnt = 0, ma = 0, i = 0;
        for (int x: A) {
            ma = Math.max(ma, x);
            // checks if the maximum number so far equals the index number
            if (ma == i)
                cnt += 1;
            i += 1;
        }
        return cnt;
    }
}
/*Q4. Max Chunks To Make Sorted
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)], if we split the array into some number of "chunks" (partitions), and individually sort each chunk. After concatenating them in order of splitting, the result equals the sorted array.

What is the most number of chunks we could have made?



Problem Constraints
1 <= N <= 100000
0 <= A[i] < N



Input Format
The only argument given is the integer array A.



Output Format
Return the maximum number of chunks that we could have made.



Example Input
Input 1:

 A = [1, 2, 3, 4, 0]
Input 2:

 A = [2, 0, 1, 3]


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Explanation 1:

 A = [1, 2, 3, 4, 0]
 To get the 0 in the first index, we have to take all elements in a single chunk.
Explanation 2:

 A = [2, 0, 1, 3]
 We can divide the array into 2 chunks.
 First chunk is [2, 0, 1] and second chunk is [3].
*/

/*The smallest leftmost possible chunk is the smallest index at which A[0….i] contains all elements up to i.

We can check that if a maximum of A[0…..i] is i, then we can take it as a separate chunk.

Find the smallest possible leftmost chunk using the above idea, and after that, we can proceed similarly for the remaining part.*/