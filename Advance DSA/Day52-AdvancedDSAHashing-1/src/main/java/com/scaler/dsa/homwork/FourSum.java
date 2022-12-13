package com.scaler.dsa.homwork;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FourSum {
    /*public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
    }*/
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int target) {
        Collections.sort(A);
        Integer[] num = new Integer[A.size()];
        num = A.toArray(num);
        HashSet<ArrayList<Integer>> hashSet = new HashSet<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int k = j + 1;
                int l = num.length - 1;

                while (k < l) {
                    int sum = num[i] + num[j] + num[k] + num[l];

                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else if (sum == target) {
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(num[i]);
                        temp.add(num[j]);
                        temp.add(num[k]);
                        temp.add(num[l]);

                        if (!hashSet.contains(temp)) {
                            hashSet.add(temp);
                            result.add(temp);
                        }

                        k++;
                        l--;
                    }
                }
            }
        }

        return result;
    }
}


/*Q1. 4 Sum
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:

Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
The solution set must not contain duplicate quadruplets.
Example : Given array S = {1 0 -1 0 -2 2}, and target = 0 A solution set is:

    (-2, -1, 1, 2)
    (-2,  0, 0, 2)
    (-1,  0, 0, 1)
Also make sure that the solution set is lexicographically sorted. Solution[i] < Solution[j] iff Solution[i][0] < Solution[j][0] OR (Solution[i][0] == Solution[j][0] AND … Solution[i][k] < Solution[j][k])*/


/*Getting a Time Limit exceeded or Output Limit exceeded ?

Make sure you handle case of empty input []. In C++/C, Usually if you run a loop till array.size() - 2, it can lead to the program running indefinitely as array.size() is unsigned int, and the subtraction just makes it wrap over to a big integer.

Make sure you are not processing the same triplets again. Skip over the duplicates in the array.
Try a input like :
-1 -1 -1 -1 0 0 0 0 1 1 1 1
Ideally, you should get only 3 pairs : {[-1 -1 1 1], [-1 0 0 1], [0 0 0 0]}*/