package com.scaler.dsa.assignement;


import java.util.ArrayList;
import java.util.Collections;

public class FirstMissingInteger {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0 && A.get(i) <= n) {
                int pos = A.get(i) - 1;
                if (A.get(pos) != A.get(i)) {
                    Collections.swap(A, pos, i);
                    i--;
                    // We are doing i-- as we have swapped i'th element with pos'th element and we might not have processed the pos'th element.
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (A.get(i) != i + 1)
                return (i + 1);
        }
        return n + 1;
    }
}
/*Q1. First Missing Integer
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an unsorted integer array, A of size N. Find the first missing positive integer.

Note: Your algorithm should run in O(n) time and use constant space.



Problem Constraints
1 <= N <= 1000000

-109 <= A[i] <= 109



Input Format
First argument is an integer array A.



Output Format
Return an integer denoting the first missing positive integer.



Example Input
Input 1:

[1, 2, 0]
Input 2:

[3, 4, -1, 1]
Input 3:

[-8, -7, -6]


Example Output
Output 1:

3
Output 2:

2
Output 3:

1


Example Explanation
Explanation 1:

A = [1, 2, 0]
First positive integer missing from the array is 3.
*/

/*Note: numbers A[i]<=0 and A[i]>N ( N being the size of the array ) are not important to us since the missing positive integer will be in the range [1, N+1].

The answer will be N+1 only if all of the elements of the array are exact one occurrence of [1, N].

Creating buckets would have been an easy solution if using extra space was allowed.

An array of size N initialized to 0 would have been created.

For every value A[i], which lies in the range [1, N], its count in the array would have been incremented.

Finally, traversing the array would help to find the first array position with value 0, and that will be our answer.
However, usage of buckets is not allowed; can we use the existing array as a bucket somehow?

Now, since additional space is not allowed either, the given array itself needs to be used to track it.

It may be helpful to use the fact that the size of the set we are looking to track is [1, N]

which happens to be the same size as the size of the array.

This means we can use the array to track these elements.

We traverse the array, and if A[i] is in [1, N] range, we try to put in the index of same value in the array.

Time complexity : O(N)
Auxiliary Space : O(1)*/