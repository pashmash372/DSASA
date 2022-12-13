package com.scaler.dsa.assignment;


import java.util.ArrayList;
import java.util.HashMap;

public class LargestContinuousSequenceZeroSum {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        ArrayList<Integer> rst = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if(A == null) return rst;
        int len = 0;
        int sum = 0;
        int l = -1, r = -1;
        map.put(0, -1);
        for(int i = 0; i < A.size(); i++){
            sum += A.get(i);
            if(!map.containsKey(sum))
                map.put(sum, i);
            else{
                if(i - map.get(sum) > len){
                    l = map.get(sum) + 1;
                    r = i;
                    len = i - map.get(sum);
                }
            }
        }
        if(l >=0 && r >= 0){
            for(int i = l; i <= r; i++){
                rst.add(A.get(i));
            }
        }
        return rst;
    }
}

/*Q3. Largest Continuous Sequence Zero Sum
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of N integers.

Find the largest continuous sequence in a array which sums to zero.



Problem Constraints
1 <= N <= 106

-107 <= A[i] <= 107



Input Format
Single argument which is an integer array A.



Output Format
Return an array denoting the longest continuous sequence with total sum of zero.

NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.



Example Input
A = [1,2,-2,4,-4]


Example Output
[2,-2,4,-4]


Example Explanation
[2,-2,4,-4] is the longest sequence with total sum of zero.*/


/*Approach:

There are two steps:

Create cumulative sum array where ith index in this array represents total sum from 1 to ith index element.
Iterate all elements of cumulative sum array and use hashing to find two elements where value at ith index == value at jth index but i != j.
IF element is not present in hash in fill hash table with current element.*/
