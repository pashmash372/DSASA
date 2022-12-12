package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.Collections;

public class Arraywithconsecutiveelements {
    public int solve(ArrayList< Integer > A) {
        // sort the given array
        Collections.sort(A);
        int minn = A.get(0);
        // check if the elements are consecutive
        for (int x: A) {
            if (x != minn)
                return 0;
            minn++;
        }
        return 1;
    }
}
/*Q2. Array with consecutive elements
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of positive integers A, check and return whether the array elements are consecutive or not.
NOTE: Try this with O(1) extra space.



Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return 1 if the array elements are consecutive else return 0.



Example Input
Input 1:

 A = [3, 2, 1, 4, 5]
Input 2:

 A = [1, 3, 2, 5]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 As you can see all the elements are consecutive, so we return 1.
Explanation 2:

 Element 4 is missing, so we return 0.

*/

/*We can check that if we sort the array in increasing order, the prev element should be less than the current one.

If this condition satisfies for the whole array, then we return 1 else, return 0.

NOTE: Array doesn’t need to start with 1.*/