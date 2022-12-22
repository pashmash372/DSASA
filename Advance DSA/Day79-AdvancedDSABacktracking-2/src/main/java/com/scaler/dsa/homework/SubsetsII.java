package com.scaler.dsa.homework;

import java.util.*;


public class SubsetsII {
    ArrayList<ArrayList<Integer>> res;

    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        res = new ArrayList<>();
        if (A == null) return null;
        // to get same elements together
        Collections.sort(A);
        rec(A, new ArrayList<>(), 0);
        Collections.sort(res, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> a, List<Integer> b) {
                int size = Math.min(a.size(), b.size());
                for (int i = 0; i < size; i++) {
                    int cmp = Integer.compare(a.get(i), b.get(i));
                    if (cmp != 0) return cmp;
                }
                return Integer.compare(a.size(), b.size());
            }
        });
        return res;
    }

    public void rec(ArrayList<Integer> A, ArrayList<Integer> ans, int index) {
        if (index >= A.size()) {
            res.add(new ArrayList<>(ans));
            return;
        }
        int curIndex = index + 1;
        while (curIndex < A.size() && A.get(curIndex) == A.get(index)) curIndex++;
        // Take the element A[index] i times
        for (int i = 0; i <= (curIndex - index); i++) {
            for (int j = 0; j < i; j++)
                ans.add(A.get(index));
            rec(A, ans, curIndex);
            for (int j = 0; j < i; j++)
                ans.remove(ans.size() - 1);
        }
    }

}

/* Another Solution*/



class SubsetsII1 {
    ArrayList<ArrayList<Integer>> ans = new ArrayList();
    HashSet<ArrayList<Integer>> set = new HashSet();

    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        Collections.sort(A);
        ans.add(new ArrayList());
        generateSubsets(A, 0, new ArrayList());

        return ans;
    }

    void generateSubsets(ArrayList<Integer> A, int index, ArrayList<Integer> currList) {
        ArrayList<Integer> temp = new ArrayList();
        if (index == A.size()) {
            return;
        }

        //Add array item into currentList
        currList.add(A.get(index));
        for (Integer x : currList) {
            temp.add(x);
        }

        if (!set.contains(temp)) {
            set.add(temp);
            ans.add(temp);
        }
        generateSubsets(A, index + 1, currList);

        //remove array item from currentList
        currList.remove(A.get(index));
        generateSubsets(A, index + 1, currList);
    }
}


/*Q1. Subsets II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a collection of integers denoted by array A of size N that might contain duplicates, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
The subsets must be sorted lexicographically.


Problem Constraints
0 <= N <= 16



Input Format
Only argument is an integer array A of size N.



Output Format
Return a 2-D vector denoting all the possible subsets.



Example Input
Input 1:

 A = [1, 2, 2]
Input 2:

 A = [1, 1]


Example Output
Output 1:

 [
    [],
    [1],
    [1, 2],
    [1, 2, 2],
    [2],
    [2, 2]
 ]
Output 2:

 [
    [],
    [1],
    [1, 1]
 ]


Example Explanation
Explanation 1:

All the subsets of the array [1, 2, 2] in lexicographically sorted order.
*/

/*Think in terms of recursion.
This is very similar to the problem where you need to generate subsets for distinct integer. However, in this case, because of repetitions, things are not as simple as choosing or rejecting an element.
Now for the elements which are repeated you need to iterate over the count of elements you are going to include in your subset.*/