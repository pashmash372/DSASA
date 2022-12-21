package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.Collections;

public class CombinationSumII {
    ArrayList<ArrayList<Integer>> res;

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        if (A == null) return null;
        res = new ArrayList<>();
        Collections.sort(A);
        rec(A, new ArrayList<>(), B, 0);
        return res;
    }

    public void rec(ArrayList<Integer> A, ArrayList<Integer> ans, int B, int index) {
        if (B == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }
        if (B < 0 || index >= A.size()) return;
        int i = index + 1;
        for (; i < A.size(); i++)
            if (A.get(i) != A.get(i - 1)) break;
        rec(A, ans, B, i);
        ans.add(A.get(index));
        rec(A, ans, B - A.get(index), index + 1);
        ans.remove(ans.size() - 1);
    }
}

/* Another solution easy approach*/

class Solution12 {
    ArrayList<ArrayList<Integer>> res;

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
//1. create a multi-dim ArrayList
//2. create an array list
//3. create a index
//4. find the bounds of the given array
//5. create a sum with the respective index
//6. update the sum and use recursion for pos+1
//7. add to res if sum==k. just plain return if it doesn’t
//8. remove the integer at pos from sum and use recursion for the next pos+1
        res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        Collections.sort(A);
        int n = A.size();
        int k = B;
        int sum = 0;
        int pos = 0;
        subsetSum(list, A, sum, k, pos, n);
        return res;
    }

    public void subsetSum(ArrayList<Integer> list, ArrayList<Integer> A, int sum, int k, int pos, int n) {
        if (pos == n) {
            if (sum == k && !res.contains(list)) {
                res.add(new ArrayList<Integer>(list));
            }
            return;
        }
        sum += A.get(pos);
        list.add(A.get(pos));
        subsetSum(list, A, sum, k, pos + 1, n);
        sum -= A.get(pos);
        list.remove(list.size() - 1);
        subsetSum(list, A, sum, k, pos + 1, n);
    }
}


/*Q1. Combination Sum II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of size N of candidate numbers A and a target number B. Return all unique combinations in A where the candidate numbers sums to B.

Each number in A may only be used once in the combination.

Note:

All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
Warning:

DO NOT USE LIBRARY FUNCTION FOR GENERATING COMBINATIONS.

Example : itertools.combinations in python. If you do, we will disqualify your submission and give you penalty points.



Problem Constraints
1 <= N <= 20



Input Format
First argument is an integer array A denoting the collection of candidate numbers.
Second argument is an integer which represents the target number.



Output Format
Return all unique combinations in A where the candidate numbers sums to B.



Example Input
Input 1:

 A = [10, 1, 2, 7, 6, 1, 5]
 B = 8
Input 2:

 A = [2, 1, 3]
 B = 3


Example Output
Output 1:

 [
  [1, 1, 6 ],
  [1, 2, 5 ],
  [1, 7 ],
  [2, 6 ]
 ]
Output 2:

 [
  [1, 2 ],
  [3 ]
 ]


Example Explanation
Explanation 1:

 1 + 1 + 6 = 8
 1 + 2 + 5 = 8
 1 + 7 = 8
 2 + 6 = 8
 All the above combinations sum to 8 and are arranged in ascending order.
Explanation 2:

 1 + 2 = 3
 3 = 3
 All the above combinations sum to 3 and are arranged in ascending order.
*/

/*Some elements can be repeated in the input set.
Make sure you iterate over the number of occurrences of those elements to make sure you are not counting the same combinations again.

Once you do that, things are fairly straightforward. Backtracking is the solution here.
You make a recursive call with the remaining sum and make sure the indices are moving forward.*/