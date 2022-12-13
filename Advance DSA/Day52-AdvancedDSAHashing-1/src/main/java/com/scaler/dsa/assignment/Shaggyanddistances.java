package com.scaler.dsa.assignment;


import java.util.HashMap;

public class Shaggyanddistances {
    public int solve(int[] A) {
        if (A.length == 1) {
            return -1;
        }
        // stores <Value, Index> pair
        HashMap< Integer, Integer > map = new HashMap < Integer, Integer > ();
        int result = A.length;
        for (int i = 0; i < A.length; i++) {
            // checks if A[i] has occurred previously
            if (map.containsKey(A[i])) {
                result = Math.min(result, i - map.get(A[i]));
            }
            map.put(A[i], i);
        }
        return (result == A.length) ? -1 : result;
    }
}

/*Q2. Shaggy and distances
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Shaggy has an array A consisting of N elements. We call a pair of distinct indices in that array a special if elements at those indices in the array are equal.

Shaggy wants you to find a special pair such that the distance between that pair is minimum. Distance between two indices is defined as |i-j|. If there is no special pair in the array, then return -1.



Problem Constraints
1 <= |A| <= 105



Input Format
The first and only argument is an integer array A.



Output Format
Return one integer corresponding to the minimum possible distance between a special pair.



Example Input
Input 1:

A = [7, 1, 3, 4, 1, 7]
Input 2:

A = [1, 1]


Example Output
Output 1:

 3
Output 2:

 1


Example Explanation
Explanation 1:

Here we have 2 options:
1. A[1] and A[4] are both 1 so (1,4) is a special pair and |1-4|=3.
2. A[0] and A[5] are both 7 so (0,5) is a special pair and |0-5|=5.
Therefore the minimum possible distance is 3.
Explanation 2:

Only possibility is choosing A[1] and A[2].*/


/*Idea behind this problem is to use hashing.
Iterate over the the array and for each element if you found that element earlier also
(i.e. stored in hash) then take the distance between them and update the hash with the
current index.
Answer will be minimum of all distances
We are storing the most recent found index of each element because that will be the closest
to the left of the next found index.
Time Complexity : O(N)
Space Complexity : O(N)*/