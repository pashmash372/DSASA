package com.scaler.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class CompareSortedSubarrays {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        int n = A.size();
        Random rd = new Random();
        HashMap<Integer, Long> hm = new HashMap<>();
        HashSet<Long> used = new HashSet<>();
        long[] psum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(A.get(i))) {
//                generate a random number
                long hash = rd.nextLong();
                while (used.contains(hash)) {
                    hash = rd.nextLong();
                }
                hm.put(A.get(i), hash);
            }
            psum[i + 1] = psum[i] + hm.get(A.get(i));
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (ArrayList<Integer> tmp : B) {
            long val1 = psum[tmp.get(1) + 1] - psum[tmp.get(0)];
            long val2 = psum[tmp.get(3) + 1] - psum[tmp.get(2)];
            if (val1 == val2) ans.add(1);
            else ans.add(0);
        }
        return ans;
    }
}


/*Q2. Compare Sorted Subarrays
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of length N. You have to answer Q queries.

Each query will contain four integers l1, r1, l2, and r2. If sorted segment from [l1, r1] is the same as the sorted segment from [l2 r2], then the answer is 1 else 0.

NOTE The queries are 0-indexed.



Problem Constraints
0 <= A[i] <= 100000
1 <= N <= 100000
1 <= Q <= 100000



Input Format
The first argument is an array A.
The second is a 2D array B denoting queries with dimension Q * 4.
Consider ith query as l1 = B[i][0], r1 = B[i][1], l2 = A[i][2], r2 = B[i][3].



Output Format
Return an array of length Q with answers to the queries in the same order as the input.



Example Input
Input 1:

 A = [1, 7, 11, 8, 11, 7, 1]
 B = [
       [0, 2, 4, 6]
     ]
Input 2:

 A = [1, 3, 2]
 B = [
       [0, 1, 1, 2]
     ]


Example Output
Output 1:

 [1]
Output 2:

 [0]


Example Explanation
Explanation 1:

 (0, 2) -> [1, 7, 11]
 (4, 6) -> [11, 7, 1]
 Both are same when sorted hence 1.
Explanation 2:

 (0, 1) -> [1, 3]
 (1, 2) -> [3, 2]
 Both are different when sorted hence 0.
*/


/*If both sub-arrays are the same after sorting, their sum of values will be the same. So, we can find the sum in the range [l1, r1] and the sum in the range[l2, r2]. If they are different, then we are sure that ans is 0. But, if they are equal, then? Consider two sub-arrays [3 5] and [4 4]. Both have sum 8, but still, they are different.

The above approach fails because the input will be carefully chosen.

Now, we can still use the same idea but let’s first assign each value a unique random label from a vast range like 0 to 10^13. Now, the probability of failure will be very less that can be neglected with given constraints.

Note: Any solution with random hashing is not 100% correct. The possibility of failure exists. But with a wide range of numbers probability of failure will be too small.

Note: Make sure that you assign the same label to all the occurrences. If value 5 comes three times, every 3 occurrences should be given the same random label. Make sure you are using the appropriate data type. Also, choosing an extensive range like 0 to 10^15 can overflow long long int.*/