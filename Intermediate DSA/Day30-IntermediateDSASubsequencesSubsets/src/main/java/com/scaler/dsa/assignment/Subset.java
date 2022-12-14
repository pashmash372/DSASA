package com.scaler.dsa.assignment;


import java.util.ArrayList;
import java.util.Collections;

public class Subset {
    ArrayList <ArrayList< Integer >> ans;
    void solve(int idx, ArrayList < Integer > cur, ArrayList < Integer > A) {
        if (idx == A.size()) {
            ans.add(new ArrayList < > (cur));
            return;
        }
        solve(idx + 1, cur, A); // not take
        int element = A.get(idx);
        cur.add(element); // DO
        solve(idx + 1, cur, A); // take
        cur.remove(cur.size() - 1); // UNDO
    }
    public ArrayList < ArrayList < Integer >> subsets(ArrayList < Integer > A) {
        Collections.sort(A);
        ans = new ArrayList < > ();
        ArrayList < Integer > cur = new ArrayList < > ();
        solve(0, cur, A);
        // sort the list of list
        Collections.sort(ans, (ArrayList < Integer > first, ArrayList < Integer > second) -> {
            for (int i = 0; i < first.size() && i < second.size(); i++) {
                if (first.get(i) < second.get(i))
                    return -1;
                if (first.get(i) > second.get(i))
                    return 1;
            }
            if (first.size() > second.size())
                return 1;
            return -1;
        });
        return ans;
    }
}


/*Q3. Subset
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a set of distinct integers A, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Also, the subsets should be sorted in ascending ( lexicographic ) order.
The list is not necessarily sorted.


Problem Constraints
1 <= |A| <= 16
INTMIN <= A[i] <= INTMAX


Input Format
First and only argument of input contains a single integer array A.



Output Format
Return a vector of vectors denoting the answer.



Example Input
Input 1:

A = [1]
Input 2:

A = [1, 2, 3]


Example Output
Output 1:

[
    []
    [1]
]
Output 2:

[
 []
 [1]
 [1, 2]
 [1, 2, 3]
 [1, 3]
 [2]
 [2, 3]
 [3]
]


Example Explanation
Explanation 1:

 You can see that these are all possible subsets.
Explanation 2:

You can see that these are all possible subsets.*/


/*For every element, you have 2 options.

You may either include the element in your subset or do not include the element in your subset.

Make the call for both cases.
Remember to include a base case to avoid infinite calling.

Can you also do it iteratively?
Hint: You can use the fact that each number from 0 to 2N - 1, represent each subset of N elements.*/