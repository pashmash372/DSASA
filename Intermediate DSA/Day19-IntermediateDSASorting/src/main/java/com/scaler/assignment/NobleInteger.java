package com.scaler.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int size = A.size();
        for (int i = 0; i < size; i++) {
//            to avoid dupl
            while (i + 1 < size && A.get(i) ==A.get(i + 1)) i++;
            if (A.get(i) == size - i - 1) return 1;
        }
        return -1;
    }
}


/*Q2. Noble Integer
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.



Problem Constraints
1 <= |A| <= 2*105
1 <= A[i] <= 107


Input Format
First and only argument is an integer array A.



Output Format
Return 1 if any such integer p is present else, return -1.



Example Input
Input 1:

 A = [3, 2, 1, 3]
Input 2:

 A = [1, 1, 3, 3]


Example Output
Output 1:

 1
Output 2:

 -1


Example Explanation
Explanation 1:

 For integer 2, there are 2 greater elements in the array..
Explanation 2:

 There exist no integer satisfying the required conditions.*/