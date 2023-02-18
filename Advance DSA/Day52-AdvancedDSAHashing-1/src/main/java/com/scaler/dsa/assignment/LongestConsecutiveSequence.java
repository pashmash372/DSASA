package com.scaler.dsa.assignment;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LongestConsecutiveSequence {
    public int longestConsecutive(final List<Integer> A) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxCount = 0;
        for (int ele : A) {
            if (!mp.containsKey(ele)) {
                int lCount = 0;
                int rCount = 0;
                // lCount stores longest consecutive element till the current element - 1
                if (mp.containsKey(ele - 1)) {
                    lCount = mp.get(ele - 1);
                }
                // rCount stores longest consecutive element from the current element + 1
                if (mp.containsKey(ele + 1)) {
                    rCount = mp.get(ele + 1);
                }
                mp.put(ele, lCount + 1 + rCount);
                if (mp.containsKey(ele - lCount)) mp.put(ele - lCount, mp.get(ele));
                else mp.put(ele - lCount, mp.get(ele));
                if (mp.containsKey(ele + rCount)) mp.put(ele + rCount, mp.get(ele));
                else mp.put(ele + rCount, mp.get(ele));
                if (maxCount < lCount + 1 + rCount) maxCount = lCount + 1 + rCount;
            }
        }
        return maxCount;
    }
}

/*Java Simple Solution using Hashset*/
class LongestConsecutiveSequence1 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
// Create Hashset
        HashSet<Integer> hs = new HashSet<>();
// Insert all elemets to Hashset
        for (int i = 0; i < A.length; i++) {
            hs.add(A[i]);
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (hs.contains(A[i] - 1)) {
                continue;
            }
            int count = 0;
            int val = A[i];
            while (hs.contains(val)) {
                count++;
                val++;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}


/*Q1. Longest Consecutive Sequence
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an unsorted integer array A of size N.

Find the length of the longest set of consecutive elements from array A.



Problem Constraints
1 <= N <= 106

-106 <= A[i] <= 106



Input Format
First argument is an integer array A of size N.



Output Format
Return an integer denoting the length of the longest set of consecutive elements from the array A.



Example Input
Input 1:

A = [100, 4, 200, 1, 3, 2]
Input 2:

A = [2, 1]


Example Output
Output 1:

 4
Output 2:

 2


Example Explanation
Explanation 1:

 The set of consecutive elements will be [1, 2, 3, 4].
Explanation 2:

 The set of consecutive elements will be [1, 2].
*/

/*One solution is to sort the elements and then find the longest subarray with consecutive elements. But this will take O(NlogN).

An efficient way is to use hashing.

First, create an empty hash, and for each element, we insert and update the hash table and maxCount.

We only insert the element which is not yet inserted.
Calculate the lcount, i.e., the longest consecutive element till the current element - 1.
Calculate the rcount, i.e., the longest consecutive element from the current element + 1.

Update hMap[ele] (current element) = lcount + 1 + rcount.

Also, update the maxCount.*/