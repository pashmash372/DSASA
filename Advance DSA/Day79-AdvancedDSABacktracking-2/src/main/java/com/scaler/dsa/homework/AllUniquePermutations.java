package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.HashMap;

public class AllUniquePermutations {
    private boolean[] marked;
    private ArrayList <ArrayList< Integer >> res;
    private ArrayList < Integer > A;
    private int n;
    public ArrayList < ArrayList < Integer >> permute(ArrayList < Integer > A) {
        n = A.size();
        marked = new boolean[n];
        res = new ArrayList < > ();
        this.A = A;
        rec(0, new ArrayList < > ());
        return res;
    }
    public void rec(int idx, ArrayList < Integer > temp) {
        if (idx == n) {
            res.add(new ArrayList < > (temp));
            return;
        }
        HashMap repeat = new HashMap();
        // try all possible elements for the current position
        for (int i = 0; i < n; i++) {
            if (!marked[i] && repeat.get(A.get(i)) == null) { // to avoid duplicates
                repeat.put(A.get(i), 1);
                marked[i] = true;
                temp.add(A.get(i));
                rec(idx + 1, temp);
                marked[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}
/*Q2. All Unique Permutations
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of size N denoting collection of numbers that might contain duplicates, return all possible unique permutations.

NOTE: No 2 entries in the permutation sequence should be the same.

WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS.
Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.


Problem Constraints
1 <= |A| <= 9

0 <= A[i] <= 10



Input Format
Only argument is an integer array A of size N.



Output Format
Return a 2-D array denoting all possible unique permutation of the array.



Example Input
Input 1:

A = [1, 1, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

[ [1,1,2]
  [1,2,1]
  [2,1,1] ]
Output 2:

[ [1, 2]
  [2, 1] ]


Example Explanation
Explanation 1:

 All the possible unique permutation of array [1, 1, 2].
Explanation 2:

 All the possible unique permutation of array [1, 2].
*/

/*Try to think of a recursive solution in which iterate over the given array and on every ietartion the ith element
is picked as the first element of the current array and again call recurive function on the remaining suffix array.
Using recursion and backtracking we can iterate over all possible permutations but there will be many duplicates due to
duplicate element possibility in the given array. How can we resolve this?

Whatever approach we were following we follow the same approach just this time instead of iterating over the whole array
in the recursive call we iterate only over the unique elements and reduce its frequency by 1 on further calls. This ensures
that duplicate recursive call are not made keeping the same element in the same position. The frequencies can be tracked by
using a frequency hashmap and updating it in the whole process in all recursive call and backtracking steps.
Check Implementation for details.
The overall time complexity in the worst case is O(N!) as in the worst case maximum number of permutations is N!.
Space Complexity - O(N)*/