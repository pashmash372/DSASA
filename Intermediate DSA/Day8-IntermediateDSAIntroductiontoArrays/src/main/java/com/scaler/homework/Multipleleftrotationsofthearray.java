package com.scaler.homework;


import java.util.ArrayList;

public class Multipleleftrotationsofthearray {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = a.size();
        for (int x : b) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) temp.add(a.get((i + x) % n));
            ans.add(temp);
        }
        return ans;
    }
}



/*Q5. Multiple left rotations of the array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.

Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B.



Problem Constraints
1 <= length of both arrays <= 2000 -10^9 <= A[i] <= 10^9 0 <= B[i] <= 2000


Input Format
The first argument given is the integer array A.
The second argument given is the integer array B.


Output Format
Return the resultant matrix.


Example Input
Input 1:

    A = [1, 2, 3, 4, 5]
    B = [2, 3]

Input 2:


    A = [5, 17, 100, 11]
    B = [1]




Example Output
Output 1:

    [ [3, 4, 5, 1, 2]
     [4, 5, 1, 2, 3] ]


Output 2:


    [ [17, 100, 11, 5] ]



Example Explanation
for input 1 -> B[0] = 2 which requires 2 times left rotations

1: [2, 3, 4, 5, 1]

2: [3, 4, 5, 1, 2]

B[1] = 3 which requires 3 times left rotation

1: [2, 3, 4, 5, 1]

2: [3, 4, 5, 1, 2]

2: [4, 5, 1, 2, 4]




See Expected Output*/

/*If we are required to do K left rotations, we can append the first K elements of the array to the back and delete and delete them from the front

If K is greater than the size of the array, we can simply perform modulo on it with array size as after exact rotation of array’s size times the array return to its original state*/