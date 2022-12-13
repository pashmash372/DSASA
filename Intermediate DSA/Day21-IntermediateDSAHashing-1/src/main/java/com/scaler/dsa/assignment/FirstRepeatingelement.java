package com.scaler.dsa.assignment;


import java.util.ArrayList;
import java.util.HashMap;

public class FirstRepeatingelement {
    public int solve(ArrayList<Integer> A) {

        HashMap<Integer, Integer> vis = new HashMap<Integer, Integer>();
        int ans = -1;
        for(int i = A.size()-1; i >= 0; --i){
            if(vis.containsKey(A.get(i))){
                ans = A.get(i);
            }
            else{
                vis.put(A.get(i), 1);
            }
        }
        return ans;
    }
}
/*Q2. First Repeating element
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer array A of size N, find the first repeating element in it.

We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.

If there is no repeating element, return -1.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 109



Input Format
The first and only argument is an integer array A of size N.



Output Format
Return an integer denoting the first repeating element.



Example Input
Input 1:

 A = [10, 5, 3, 4, 3, 5, 6]
Input 2:

 A = [6, 10, 5, 4, 9, 120]


Example Output
Output 1:

 5
Output 2:

 -1


Example Explanation
Explanation 1:

 5 is the first element that repeats
Explanation 2:

 There is no repeating element, output -1
*/

/*A Simple Solution is to use two nested loops. The outer loop picks an element one by one, the inner loop checks whether the element is repeated or not. Once we find an element that repeats, we break the loops and print the element.

Time Complexity of this solution is O(n2)

We can Use Sorting to solve the problem in O(n Logn) time. Following are detailed steps.
1) Copy the given array to an auxiliary array temp[].
2) Sort the temp array using an O(nLogn) time sorting algorithm.
3) Scan the input array from left to right. For every element, count its occurrences in temp[] using binary search. As soon as we find an element that occurs more than once, we return the element.
This step can be done in O(nLogn) time.

We can optimize the solution using Hashing.

We can Use Hashing to solve this in average O(n) time.

The idea is to traverse the given array from right to left and update the minimum index whenever we find an element visited on the right side.
At last, return the element at the minimum index stored.*/