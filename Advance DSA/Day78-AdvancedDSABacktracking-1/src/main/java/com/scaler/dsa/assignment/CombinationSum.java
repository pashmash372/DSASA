package com.scaler.dsa.assignment;


import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum {
    ArrayList <ArrayList< Integer >> res;
    public ArrayList < ArrayList < Integer >> combinationSum(ArrayList < Integer > A, int B) {
        res = new ArrayList < > ();
        ArrayList < Integer > unique = new ArrayList < > ();
        if (A == null)
            return res;
        Collections.sort(A);
        unique.add(A.get(0));
        // list of all unique candidates
        for (int i = 0; i < A.size(); i++) {
            if (i != 0 && A.get(i) != A.get(i - 1))
                unique.add(A.get(i));
        }
        combinationSum(unique, new ArrayList < > (), B, 0);
        return res;
    }

    public void combinationSum(ArrayList < Integer > A, ArrayList < Integer > res, int B, int index) {
        if (B == 0) {
            this.res.add(new ArrayList(res));
            return;
        }
        if (B < 0)
            return;
        // try for all possible next candidate
        for (int i = index; i < A.size(); i++) {
            int num = A.get(i);
            res.add(num);
            combinationSum(A, res, B - num, i);
            res.remove(res.size() - 1);
        }
    }
}

/*Q2. Combination Sum
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of candidate numbers A and a target number B, find all unique combinations in A where the candidate numbers sums to B.

The same repeated number may be chosen from A unlimited number of times.

Note:

1) All numbers (including target) will be positive integers.

2) Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).

3) The combinations themselves must be sorted in ascending order.

4) CombinationA > CombinationB iff (a1 > b1) OR (a1 = b1 AND a2 > b2) OR ... (a1 = b1 AND a2 = b2 AND ... ai = bi AND ai+1 > bi+1)

5) The solution set must not contain duplicate combinations.



Problem Constraints
1 <= |A| <= 20

1 <= A[i] <= 50

1 <= B <= 500



Input Format
The first argument is an integer array A.

The second argument is integer B.



Output Format
Return a vector of all combinations that sum up to B.



Example Input
Input 1:

A = [2, 3]
B = 2
Input 2:

A = [2, 3, 6, 7]
B = 7


Example Output
Output 1:

[ [2] ]
Output 2:

[ [2, 2, 3] , [7] ]


Example Explanation
Explanation 1:

All possible combinations are listed.
Explanation 2:

All possible combinations are listed.*/

/*In every recursion run, you either include the element in the combination or you don’t.
To account for multiple occurrences of an element, make sure you call the next function without
incrementing the current index.
something like :
void doWork(vector &candidates, int index, vector &current, int currentSum, int target, vector<vector > &ans) { if (currentSum > target) { return; } if (currentSum == target) { ans.push_back(current); return; } for (int i = index; i < candidates.size(); i++) { current.push_back(candidates[i]); currentSum += candidates[i];

    doWork(candidates, i, current, currentSum, target, ans);

    current.pop_back();
    currentSum -= candidates[i];
}

}*/